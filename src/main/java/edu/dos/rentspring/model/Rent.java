package edu.dos.rentspring.model;

import java.time.LocalDate;
import java.util.Objects;

public class Rent {
    public String id;
    public Apartment apartment;
    public Tenant tenant;
    public LocalDate startDate;
    public LocalDate endDate;

    public Rent() {
    }

    public Rent(String id, Apartment apartment,
                Tenant tenant, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.apartment = apartment;
        this.tenant = tenant;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getID() {
        return id;
    }

    public void setID(String ID) {
        this.id = id;
    }


    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id='" + id + '\'' +
                ", apartment=" + apartment +
                ", tenant=" + tenant +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return id.equals(rent.id) &&
                Objects.equals(apartment, rent.apartment) &&
                Objects.equals(tenant, rent.tenant) &&
                Objects.equals(startDate, rent.startDate) &&
                Objects.equals(endDate, rent.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apartment, tenant, startDate, endDate);
    }
}
