package com.phonelist.phonelist.adapters.repositories;

import com.phonelist.phonelist.infra.adapters.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SpringPhoneRepository extends JpaRepository<PhoneEntity, UUID> {
    Optional<PhoneEntity> findByCode(UUID code);
    List<PhoneEntity> findAll();
}
