package org.example;

import java.util.ArrayList;

/**
 * create Efrain Solorzano
 * representa frutas
 */
public class Fruit {
    /**
     * nombre e la fruta
     */
    public String name;
    /**
     *peso promeio de la fruta
     */
    private float averageWeigth;
    /**
     * array con los colore e la frutas
     */
    public ArrayList<String> colors;

    /**
     * muestra el peso promedio de la fruta
     * @return peso promedio de la fruta
     */
    public float getAverageWeigth() {
        return averageWeigth;
    }

    /**
     * obtiene el peso promedio de la fruta
     * @param averageWeigth
     */
    public void setAverageWeigth(float averageWeigth) {
        this.averageWeigth = averageWeigth;
    }
}
