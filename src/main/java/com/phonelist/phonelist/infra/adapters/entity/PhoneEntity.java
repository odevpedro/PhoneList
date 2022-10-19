package com.phonelist.phonelist.infra.adapters.entity;

import com.phonelist.phonelist.domain.Category;
import com.phonelist.phonelist.domain.Phone;
import com.phonelist.phonelist.domain.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "phone")
public class PhoneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID code;

    private Category category;
    private User user;
    private String number;
    private String areaCode;
    private LocalDateTime register;
    private LocalDateTime timeUpdate;


//metodos

    public PhoneEntity(Phone phone) {
        this.code = phone.getCode();
        this.category = phone.getCategory();
        this.user = phone.getUser();
        this.number = phone.getNumber();
        this.areaCode = phone.getAreaCode();
        this.register = phone.getRegister();
        this.timeUpdate = phone.getTimeUpdate();
    }

    public void update(Phone phone) {
        this.code = phone.getCode();
        this.category = phone.getCategory();
        this.user = phone.getUser();
        this.number = phone.getNumber();
        this.areaCode = phone.getAreaCode();
        this.register = phone.getRegister();
        this.timeUpdate = phone.getTimeUpdate();
    }

    public Phone toPhone(){
        return new Phone(this.code, this.category, this.user, this.number, this.areaCode, this.register, this.timeUpdate);
    }



}
