package ru.itcave.coins_base.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "coins")
public class Coin implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "country")
    private String country;

    @Column(name = "nominal")
    private String nominal;

    @Column(name = "year")
    private String year;

    @Column(name = "material")
    private String material;

    @Column(name = "weight")
    private String weight;

    @Column(name = "diameter")
    private String diameter;

    @Column(name = "picture")
    private byte[] picture;

    @Column(name = "description")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Coin() {
    }

    public Coin(String country, String nominal, String year, String material, String weight, String diameter, byte[] picture, String description) {
        this.country = country;
        this.nominal = nominal;
        this.year = year;
        this.material = material;
        this.weight = weight;
        this.diameter = diameter;
        this.picture = picture;
        this.description = description;
    }


}
