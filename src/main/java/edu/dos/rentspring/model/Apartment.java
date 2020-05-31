package edu.dos.rentspring.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Apartment {
    public String id;
    public int Floor;
    public double Area;
    public boolean isConditioner;
    public double RentalPricePerDay;
    private Building building;
    private LocalDateTime created_at;
    private LocalDateTime update_at;


    public Apartment() {
    }

    public Apartment(String id, int floor, double area,
                     boolean isConditioner, double rentalPricePerDay,
                     Building building, LocalDateTime created_at,
                     LocalDateTime update_at) {
        this.id = id;
        Floor = floor;
        Area = area;
        this.isConditioner = isConditioner;
        RentalPricePerDay = rentalPricePerDay;
        this.building = building;
        this.created_at = created_at;
        this.update_at = update_at;
    }

    public String getID() {
        return id;
    }

    public void setID(String ID) {
        this.id = id;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public boolean isConditioner() {
        return isConditioner;
    }

    public void setConditioner(boolean conditioner) {
        isConditioner = conditioner;
    }

    public double getRentalPricePerDay() {
        return RentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        RentalPricePerDay = rentalPricePerDay;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return Floor == apartment.Floor &&
                Double.compare(apartment.Area, Area) == 0 &&
                isConditioner == apartment.isConditioner &&
                Double.compare(apartment.RentalPricePerDay, RentalPricePerDay) == 0 &&
                id.equals(apartment.id) &&
                Objects.equals(building, apartment.building) &&
                Objects.equals(created_at, apartment.created_at) &&
                Objects.equals(update_at, apartment.update_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Floor, Area, isConditioner, RentalPricePerDay, building, created_at, update_at);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id='" + id + '\'' +
                ", Floor=" + Floor +
                ", Area=" + Area +
                ", isConditioner=" + isConditioner +
                ", RentalPricePerDay=" + RentalPricePerDay +
                ", building=" + building +
                ", created_at=" + created_at +
                ", update_at=" + update_at +
                '}';
    }
}
