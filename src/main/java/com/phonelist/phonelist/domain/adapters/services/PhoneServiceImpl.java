package com.phonelist.phonelist.domain.adapters.services;

import com.phonelist.phonelist.adapters.repositories.PhoneRepository;
import com.phonelist.phonelist.domain.Phone;
import com.phonelist.phonelist.domain.dto.PhoneDTO;
import com.phonelist.phonelist.domain.ports.interfaces.PhoneServicePort;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class PhoneServiceImpl implements PhoneServicePort {

    private final PhoneRepository phoneRepository;

    public PhoneServiceImpl(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public List<PhoneDTO> searchRegisters() {
        return null;
    }

    @Override
    public void createRegister(PhoneDTO phoneDTO) {
        Phone phone = new Phone(phoneDTO);
        this.phoneRepository.save(phone);

    }

    @Override
    public void updateRegister(UUID code, PhoneDTO phoneDTO) throws NoClassDefFoundError, ChangeSetPersister.NotFoundException {
        Phone phone = this.phoneRepository.searchByCode(code);
        if (Objects.isNull(phone))
            throw new ChangeSetPersister.NotFoundException();

        this.phoneRepository.save(phone);
    }

    //add update method here

}
