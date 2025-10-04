package com.bookmyshow.design.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class City extends BaseModel{
    private String name;

    //private List<Theatre> theatreList;
}
