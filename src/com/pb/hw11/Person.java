package com.pb.hw11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person {

    private String fio;
    private LocalDate birthday;
    private List<String> phones;
    private String address;
    private LocalDateTime updatedAt;

//    Person(String fio, LocalDate birthday, List<String> phones, String address, LocalDateTime updatedAt) {
//        this.fio = fio;
//        this.birthday = birthday;
//        this.phones = phones;
//        this.address = address;
//        this.updatedAt = updatedAt;
//    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhone(String phone) {
        if (this.phones == null) {
            this.setPhones(new ArrayList<>(Arrays.asList()));
        }

        this.phones.add(phone);
    }

    public void updatePhone(int index, String phone) throws Exception {
        this.phones.remove(index);
        this.phones.add(index, phone);
    }

    public void removePhone(int index) {
        this.phones.remove(index);
    }

    public int searchPhone(String phone) {
        if (this.phones != null) {
            for (int i = 0; i < this.phones.size(); i++) {
                if (this.phones.get(i).equals(phone)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
