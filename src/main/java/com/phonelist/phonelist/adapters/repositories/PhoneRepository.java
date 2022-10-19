package com.phonelist.phonelist.adapters.repositories;

import com.phonelist.phonelist.domain.Phone;
import com.phonelist.phonelist.domain.ports.repository.PhoneRepositoryPort;
import com.phonelist.phonelist.infra.adapters.entity.PhoneEntity;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class PhoneRepository implements PhoneRepositoryPort {

    //injeção
    private final SpringPhoneRepository springPhoneRepository;

    public PhoneRepository(SpringPhoneRepository springPhoneRepository) {
        this.springPhoneRepository = springPhoneRepository;
    }

    @Override
    public List<Phone> searchAll() {
        //implementação dos metodos de persistência no banco de dados
        List<PhoneEntity> phoneEntities = this.springPhoneRepository.findAll();
        return phoneEntities.stream().map(PhoneEntity::toPhone).collect(Collectors.toList());
    }

    @Override
    public Phone searchByCode(UUID code) {
        Optional<PhoneEntity> phoneEntity = this.springPhoneRepository.findByCode(code);

        if (phoneEntity.isPresent())
            return phoneEntity.get().toPhone();

        throw new RuntimeException("Register do not exists");
    }

    @Override
    public void save(Phone phone) {
        PhoneEntity phoneEntity;
        if (Objects.isNull(phone.getCode()))
            phoneEntity = new PhoneEntity(phone);
        else {
            phoneEntity = this.springPhoneRepository.findById(phone.getCode()).get();
            phoneEntity.update(phone);
        }

        this.springPhoneRepository.save(phoneEntity);
    }
}
