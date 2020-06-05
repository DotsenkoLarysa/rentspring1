package edu.dos.rentspring.model;

import java.util.Objects;

public class Tenant {

    public String id;
    public String name;
    public String requisites;
    public String address;
    public String phone;
    public String contactPerson;

    public Tenant() {
    }

    public Tenant(String id, String name, String requisites,
                  String address, String phone, String contactPerson) {
        this.id = id;
        this.name = name;
        this.requisites = requisites;
        this.address = address;
        this.phone = phone;
        this.contactPerson = contactPerson;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequisites() {
        return requisites;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
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

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", requisites='" + requisites + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tenant tenant = (Tenant) o;
        return id.equals(tenant.id) &&
                Objects.equals(name, tenant.name) &&
                Objects.equals(requisites, tenant.requisites) &&
                Objects.equals(address, tenant.address) &&
                Objects.equals(phone, tenant.phone) &&
                Objects.equals(contactPerson, tenant.contactPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, requisites, address, phone, contactPerson);
    }
}

