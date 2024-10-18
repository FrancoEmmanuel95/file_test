package model;

public class Property {
    private Owner owner;
    private String address;
    private Double area;
    private Double salePrice;
    private Double rentalPrice;
    private Boolean rented;
    private Boolean sold;

    public Property(Owner owner, String address, Double area, Double salePrice, Double rentalPrice, Boolean rented, Boolean sold) {
        this.owner = owner;
        this.address = address;
        this.area = area;
        this.salePrice = salePrice;
        this.rentalPrice = rentalPrice;
        this.rented = rented;
        this.sold = sold;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Boolean getRented() {
        return rented;
    }

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }
}
