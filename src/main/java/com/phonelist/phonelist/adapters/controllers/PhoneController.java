package com.phonelist.phonelist.adapters.controllers;

import com.phonelist.phonelist.domain.Phone;
import com.phonelist.phonelist.domain.dto.PhoneDTO;
import com.phonelist.phonelist.domain.ports.interfaces.PhoneServicePort;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
    @RequestMapping("phones")
    public class PhoneController {

        private final PhoneServicePort phoneServicePort;

        public PhoneController(PhoneServicePort produtoServicePort) {
            this.phoneServicePort = produtoServicePort;
        }

        @GetMapping
        List<PhoneDTO> getPhones() {
            return phoneServicePort.searchRegisters();
        }

        @PutMapping(value = "/{code}")
        void updatRegister(@PathVariable UUID code, @RequestBody PhoneDTO phoneDTO) throws ChangeSetPersister.NotFoundException {
            phoneServicePort.updateRegister(code, phoneDTO);
        }

        public void createRegister(PhoneDTO phoneDTO) {
            Phone produto = new Phone(phoneDTO);
            this.phoneServicePort.createRegister(phoneDTO);
        }

}
