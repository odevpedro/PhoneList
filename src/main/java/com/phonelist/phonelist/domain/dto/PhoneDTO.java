package com.phonelist.phonelist.domain.dto;

import com.phonelist.phonelist.domain.Category;
import com.phonelist.phonelist.domain.User;

import java.time.LocalDateTime;
import java.util.UUID;

public class PhoneDTO {

    private UUID code;
    private String number;
    private Category category;
    private User user;
    private String areaCode;
    private LocalDateTime register;
    private LocalDateTime timeUpdate;

    //novo constructor apenas com as informações necessárias
    public PhoneDTO(UUID code, String number, User user, String areaCode) {
    }

    public UUID getCode() {
        return code;
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
}
