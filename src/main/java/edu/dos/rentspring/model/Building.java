package edu.dos.rentspring.model;

import java.util.Objects;

public class Building {

    public String id;
    public String address;
    public String phone;

    public Building() {
    }

    public Building(String id, String address, String phone) {
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    public Building(String address, String phone) {
        this.address = address;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return id.equals(building.id) &&
                Objects.equals(address, building.address) &&
                Objects.equals(phone, building.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, phone);
    }
}
