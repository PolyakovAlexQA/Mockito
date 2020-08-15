package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Movie {

    private int id;
    private int productId;
    private String productName;
    private int productPrice;
    private int count;

    public Movie(int id, String бладшот, String боевик, String s, String s1) {
    }
}

