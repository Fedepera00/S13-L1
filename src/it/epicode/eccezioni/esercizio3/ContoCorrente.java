package it.epicode.eccezioni.esercizio3;

public class ContoCorrente {
    private String titolare;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) { // MI CREO IL COSTRUTTORE
        this.titolare = titolare;
        this.saldo = saldo;
    }

    public void preleva(double importo) throws BancaException { //MODALITA' PER PRELEVARE
        if (saldo - importo < 0) { // CONTROLLO SALDO -0
            throw new BancaException("Saldo insufficiente."); // LANCIA ECCEZIONE SALDO NEGATIVO
        }
        saldo -= importo; // UPDATE SALDO
    }

    public double getSaldo() {
        return saldo;
    }
}