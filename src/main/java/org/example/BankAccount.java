package org.example;

/**
 * create Efrain Solorzano
 * representa una cuenta bancaria
 */
public class BankAccount {
    /**
     * numero de cuenta
     */
    private int accountNumber;
    /**
     * representa si la cuenta esta activa o no esta activa
     */
    protected boolean active;

    /**
     * muestra el nunmero e cuenta
     * @return numero e cuenta
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * se obtiene el numero el cuenta
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

}
