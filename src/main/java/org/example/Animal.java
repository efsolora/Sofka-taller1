package org.example;

import java.util.ArrayList;

/**
 * create Efrain Solorzano
 * representa un animal
 */
public class Animal {
    /**
     * nombre de animal
     */
    private String name;
    /**
     * tipo de animal
     */
    public String type;
    /**
     * array con las caracteristicas del animal
     */
    protected ArrayList<String>  characteristics;

    /**
     * muestra el nombre del animal
     * @return nombre del animal
     */
    public String getName() {
        return name;
    }

    /**
     * obtiene el nombre del animal
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * muestrab el tipo e animmal en consola
     * @param type
     */
    public void seeType(String type) {
           this.type = type;
        System.out.println(this.type);
    }


}
