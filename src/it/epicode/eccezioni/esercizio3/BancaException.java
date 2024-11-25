package it.epicode.eccezioni.esercizio3;

public class BancaException extends Exception { // GESTIRE ECCEZIONI BANCARIE
    public BancaException(String message) { // COSTRUTTORE CHE ACCETTA UN MESSAGGIO
        super(message); // PASSO MESSAGGIO ALLA CLASE MADRE EXCEPTION
    }
}