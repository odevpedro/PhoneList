package com.phonelist.phonelist.domain.ports.interfaces;

import com.phonelist.phonelist.domain.dto.PhoneDTO;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

public interface PhoneServicePort {

    List<PhoneDTO> searchRegisters();

    void createRegister(PhoneDTO produtoDTO);

    void updateRegister(UUID code,PhoneDTO phoneDTO) throws ChangeSetPersister.NotFoundException;

}
