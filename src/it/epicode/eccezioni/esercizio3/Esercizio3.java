package it.epicode.eccezioni.esercizio3;

import org.slf4j.Logger; //LOGGER
import org.slf4j.LoggerFactory; // LOGERFACTORY
import java.util.Scanner;

public class Esercizio3 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio3.class);

    public void run() {
        Scanner scanner = new Scanner(System.in);
        ContoOnLine conto = new ContoOnLine("Mario Rossi", 1000, 500); // CREO CONTO ONLINE

        // CICLO INFINITO PER OPERAZIONI BANCARIE
        while (true) {
            try {
                System.out.println("Saldo attuale: " + conto.getSaldo());
                System.out.println("Inserisci l'importo da prelevare (oppure 0 per terminare): ");
                double importo = scanner.nextDouble();
                if (importo == 0) { // TERMINE APP SE L'IMPORTO E' 0
                    logger.info("Programma terminato.");
                    break;
                }

                conto.preleva(importo); // ESEGUO PRELIEVO
                logger.info("Prelievo effettuato. Saldo attuale: {}", conto.getSaldo());

            } catch (BancaException e) { // ERRORI SALDO E LIMITE GESTIONE
                logger.error("Errore: {}", e.getMessage(), e);
                System.out.println("Errore: " + e.getMessage());
            }
        }
    }
}