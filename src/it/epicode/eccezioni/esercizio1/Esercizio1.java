package it.epicode.eccezioni.esercizio1;

import org.slf4j.Logger; //LOGGER
import org.slf4j.LoggerFactory; // LOGGERFACTORY
import java.util.InputMismatchException; // ECCEZIONE IMPORT ERRATO
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio1.class); // INIZIALIZZO LOGGER

    public void run() {
        int[] array = new int[5]; // ARRAY 5 ELEMENTI
        Random random = new Random(); // OGGETTI RANDOM
        Scanner scanner = new Scanner(System.in);

        // ARRAY CASUALI CON NUMERI DA 1 A 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1; // CASUALE NUMERO
        }

        logger.info("Array iniziale generato");

        // CICLO INFINITO
        while (true) {
            try {
                System.out.println("Inserisci l'indice (0-4) da aggiornare (oppure 0 per terminare): ");
                int indice = scanner.nextInt();
                if (indice == 0) { // INDICE 0 FINE PROGRAMMA
                    logger.info("Programma terminato dall'utente.");
                    break;
                }

                System.out.println("Inserisci il nuovo valore: ");
                int valore = scanner.nextInt();

                array[indice] = valore; // AGGIORNO ARRRAY
                logger.debug("Aggiornato indice {} con valore {}", indice, valore);
                stampaArray(array);

            } catch (ArrayIndexOutOfBoundsException e) { //GESTIONE ERRORE FUORI DAL LIMITE
                logger.error("Indice fuori dai limiti!", e);
                System.out.println("Errore: Indice fuori dai limiti!");
            } catch (InputMismatchException e) { // GERRORE INPUT NUMERICO
                logger.error("Input non valido!", e);
                System.out.println("Errore: Devi inserire un numero.");
                scanner.next();
            }
        }
    }

    private void stampaArray(int[] array) { // Metodo per stampare i valori dell'array
        for (int num : array) {
            System.out.print(num + " "); // Stampa ogni elemento dell'array
        }
        System.out.println(); // A capo dopo la stampa
    }
}