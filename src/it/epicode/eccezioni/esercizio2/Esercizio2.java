package it.epicode.eccezioni.esercizio2;

import org.slf4j.Logger; // LOGGER
import org.slf4j.LoggerFactory; // LOGGERFACTORY
import java.util.InputMismatchException; // INPUT ERRATO
import java.util.Scanner;

public class Esercizio2 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio2.class);

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // CICLO INFINITO KM E LITRI
        while (true) {
            try {
                System.out.println("Inserisci i km percorsi (oppure 0 per terminare): ");
                double km = scanner.nextDouble(); // LETTURA KM PERCORSI
                if (km == 0) { //TERMINA A 0
                    logger.info("Programma terminato.");
                    break;
                }

                System.out.println("Inserisci i litri consumati: ");
                double litri = scanner.nextDouble();
                if (litri == 0) { // GESTIAMO DIVISIONE PER 0
                    throw new ArithmeticException("Divisione per zero non consentita!");
                }

                double consumo = km / litri; // CALCOLO KM E LITRI
                logger.info("Calcolato consumo: {} km/l", consumo);
                System.out.printf("Consumo: %.2f km/l%n", consumo);

            } catch (ArithmeticException e) { // GESTIONE DIVISIONE PER 0
                logger.error("Errore: Divisione per zero!", e);
                System.out.println("Errore: Divisione per zero!");
            } catch (InputMismatchException e) { // INPUT NUMERICO
                logger.error("Input non valido!", e); // LOG ERRORE
                System.out.println("Errore: Devi inserire un numero.");
                scanner.next();
            }
        }
    }
}