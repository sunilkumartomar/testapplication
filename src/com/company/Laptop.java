package com.company;

public class Laptop{
    private int id;
    private String name;
    private int ram;
    private String Brand;
    public Laptop() {
    }

    public Laptop(int id, String name, int ram, String brand) {
        this.id = id;
        this.name = name;
        this.ram = ram;
        Brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" + "id=" + id + ", name='" + name + '\'' + ", ram=" + ram + ", Brand='" + Brand + '\'' + '}';
    }
/* @Override
    public int compareTo(Laptop a)
    {
        return this.name.compareTo(a.name);
    }*/
}
