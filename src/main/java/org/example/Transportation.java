package org.example;

/**
 * create Efrain Solorzzano
 * representa a los tranportes
 */
public class Transportation {
    /**
     * nombre el transporte
     */
    protected String name;
    /**
     * tipo e transporte
     */
    public String type;
    /**
     * numero e pasajeros
     */
    private int numberOfPassengers;

    /**
     * muestra el numero e pasajeros
     * @return numero de pasajeros
     */

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * obtiene el numero de pasajeros
     * @param numberOfPassengers
     */

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    /**
     * muestra el tipo e tranporte en consola
     * @param type
     */
    protected void seeType(String type) {
        this.type = type;
        System.out.println(this.type);
    }
}
