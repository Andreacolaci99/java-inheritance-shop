package JavaShop;

public class Cuffie extends Prodotto {

    private String colore;
    private boolean sonoWireless;
    private boolean sonoCablate;

    public Cuffie(int codice){
        super(codice);
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isSonoWireless() {
        return sonoWireless;
    }

    public void setSonoWireless(boolean sonoWireless) {
        this.sonoWireless = sonoWireless;
    }

    public boolean isSonoCablate() {
        return sonoCablate;
    }

    public void setSonoCablate(boolean sonoCablate) {
        this.sonoCablate = sonoCablate;
    }

    @Override
    public String toString() {
        return "Il prodotto con codice " + getCodice() + " sono delle " + getNome() + " prodotte da " + getMarca() +
        " il loro prezzo è di " + getPrezzo() + " euro , l'iva applicata sul prodotto è di " + getIva() + " il loro colore è "
        + getColore() + " e  sono wireless " + isSonoWireless() + " o cablate " + isSonoCablate();
    }
}
