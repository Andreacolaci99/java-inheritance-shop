package JavaShop;

public class Smartphone extends Prodotto {

    private String codiceImei;
    private double memoria;

    public Smartphone(int codice){
        super(codice);
    }

    public String getCodiceImei() {
        return codiceImei;
    }

    public void setCodiceImei(String codiceImei) {
        this.codiceImei = codiceImei;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Il prodotto con codice " + getCodice() + " è un " + getNome() + " prodotto da " + getMarca() +
        " il suo prezzo è di " + getPrezzo() + " euro, l'iva applicata sul prodotto è di " + getIva() + " il suo codice IMEI è "
        + getCodiceImei() + " e la sua memoria è di " + getMemoria() ;
    }
}
