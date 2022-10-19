package com.phonelist.phonelist.domain.ports.repository;

import com.phonelist.phonelist.domain.Phone;

import java.util.List;
import java.util.UUID;

public interface PhoneRepositoryPort {

    List<Phone> searchAll();

    Phone searchByCode(UUID code);

    void save(Phone produto);
}
