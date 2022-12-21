package org.example;
import java.util.Date;

/**
 * Created Efrain Solorzano
 * Esta clase presenta la informacion personal e alguien
 */
public class Person {
    /**
     * el nombre de una persona
     */
    private String name;
    /**
     * el primer apellido de la persona
     */
    public String lastName;
    /**
     * el segundo apellido de la persona
     */
    public String lastName2;
    /**
     * la fecha e nacimiento e una persona
     */
    public Date dateBirth;
    /**
     * el tamaño e una persona
     */
    public float height;

    /**
     * muestra el nombre e la persona
     * @return el nombre
     */
    public String getName() {
        return name;
    }

    /**
     * obtiene el nombre e la persona
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
