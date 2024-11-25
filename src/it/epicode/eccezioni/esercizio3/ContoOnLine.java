package it.epicode.eccezioni.esercizio3;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxPrelievo) { // MI CREO IL COSTRUTTORE
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    @Override
    public void preleva(double importo) throws BancaException { // SOVRASCRIVO METODO PRELEVA
        if (importo > maxPrelievo) { // CONTROLLO SE PRELIEVO HA SUPERATO IL LIMITE
            throw new BancaException("Prelievo oltre il limite consentito."); // EXCEPTION
        }
        super.preleva(importo);
    }
}