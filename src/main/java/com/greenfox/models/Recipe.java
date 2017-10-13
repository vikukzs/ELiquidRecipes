package com.greenfox.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Zsuzska on 2017. 01. 10..
 */
@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double pg;
    private double vg;
    private double aroma1;
    private String aroma1name;
    private double aroma2;
    private String aroma2name;
    private double aroma3;
    private String aroma3name;
    private double nicotine;
    public int rating;

    public Recipe(){}
    public Recipe(String name, double pg, double vg, double aroma1, String aroma1name, double aroma2, String aroma2name, double aroma3, String aroma3name, double nicotine){
        this.name = name;
        this.pg = pg;
        this.vg = vg;
        this.aroma1 = aroma1;
        this.aroma1name = aroma1name;
        this.aroma2 = aroma2;
        this.aroma2name = aroma2name;
        this.aroma3 = aroma3;
        this.aroma3name = aroma3name;
        this.nicotine = nicotine;
        this.rating = 0;
    }

}
