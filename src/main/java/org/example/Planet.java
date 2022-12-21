package org.example;

/**
 * create Efrain Solorzano
 * representa un planeta
 */
public class Planet {
    /**
     * nombre el planeta
     */
    public String name;
    /**
     * tamaño  el planeta
     */
    private int size;
    /**
     * numero e lunas
     */
    protected String numberMoon;

    /**
     * muestra el tamaño del planeta
     * @return tamaño del planeta
     */
    public int getSize() {
        return size;
    }

    /**
     * obtiene el tamaño del planeta
     * @param size
     */

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * muestra el nombre del planeta en consola
     */
    private void seePlanet(){
        System.out.println(this.name);
    }
}
