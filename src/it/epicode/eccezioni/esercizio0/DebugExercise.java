package it.epicode.eccezioni.esercizio0;

public class DebugExercise {
    public static void main(String[] args) { // Metodo main
        int[] numbers = {1, 2, 3, 4, 5}; // Dichiarazione e inizializzazione di un array di numeri interi
        int sum = 0; // Variabile per la somma, inizializzata a 0

        // Ciclo for per calcolare la somma degli elementi dell'array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Aggiunge l'elemento corrente dell'array alla somma
            System.out.println("Index: " + i + ", Value: " + numbers[i] + ", Sum: " + sum); // Stampa i dettagli
        }

        System.out.println("Final Sum: " + sum); // Stampa la somma finale
    }
}