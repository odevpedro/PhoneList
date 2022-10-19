package com.phonelist.phonelist.domain;

import com.phonelist.phonelist.domain.dto.PhoneDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public class Phone {
    private UUID code;
    private String number;
    private Category category;
    private User user;
    private String areaCode;
    private LocalDateTime register;
    private LocalDateTime timeUpdate;

    public Phone(){}

    public Phone(UUID code, String number, Category category, User user, String areaCode, LocalDateTime register, LocalDateTime timeUpdate) {
        this.code = code;
        this.number = number;
        this.category = category;
        this.user = user;
        this.areaCode = areaCode;
        this.register = register;
        this.timeUpdate = timeUpdate;
    }

    public Phone(UUID code, Category category, User user, String number, String areaCode, LocalDateTime register, LocalDateTime timeUpdate) {
    }

    public String getNumber() {
        return number;
    }

    public Category getCategory() {
        return category;
    }

    public User getUser() {
        return user;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public LocalDateTime getRegister() {
        return register;
    }

    public LocalDateTime getTimeUpdate() {
        return timeUpdate;
    }

    public UUID getCode() {
        return code;
    }
    //constructor que vai instanciar um novo Phone passando um dto como parametro

    public Phone(PhoneDTO phoneDTO) {
        this.code = phoneDTO.getCode();
        this.number = phoneDTO.getNumber();
        this.category = phoneDTO.getCategory();
        this.user = phoneDTO.getUser();
        this.areaCode = phoneDTO.getAreaCode();
        this.register = phoneDTO.getRegister();
        this.timeUpdate = phoneDTO.getTimeUpdate();
    }

    public PhoneDTO toPhoneDTO() {
        return new PhoneDTO(this.code, this.number, this.user, this.areaCode);
    }
}
