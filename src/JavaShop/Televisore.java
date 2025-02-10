package JavaShop;

public class Televisore extends Prodotto {
    
    private double dimensioni;
    private boolean smartTv;

    public Televisore(int codice){
        super(codice);
    }

    public double getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(double dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    @Override
    public String toString() {
        return "Il prodotto con codice " + getCodice() + " è un " + getNome() + " prodotto da " + getMarca() +
        " il suo prezzo è di " + getPrezzo() + " euro, l'iva applicata sul prodotto è di " + getIva() + " la sua dimensione è di " + getDimensioni() + " ed è una tv smart : " + isSmartTv() ;
        
    }
}
