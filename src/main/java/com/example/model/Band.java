package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Band {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city;
    private Integer year;

    public Band() {
    }

    public Band(String name, String city, Integer year) {
        this.name = name;
        this.city = city;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        Band band = (Band) o;

        if ( id != null ? !id.equals(band.id) : band.id != null ) return false;
        if ( name != null ? !name.equals(band.name) : band.name != null ) return false;
        if ( city != null ? !city.equals(band.city) : band.city != null ) return false;
        return year != null ? year.equals(band.year) : band.year == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }
}
