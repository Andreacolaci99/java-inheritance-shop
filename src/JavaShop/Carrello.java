package JavaShop;

import java.util.Scanner;

public class Carrello {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci i prodotti che vuoi acquistare :");
        String prodottoSelezionato = scan.nextLine();

        System.out.println("Cosa stai inserendo ? Uno Smartphone, un Televisore o delle Cuffie ?");
        String prodottoScelto = scan.nextLine();

        if(prodottoScelto.equals("Smartphone")){
            System.out.println("Quale smartphone hai scelto ?");
            String smartphoneScelto = scan.nextLine();
            if(smartphoneScelto.equals("Iphone")){
               System.out.println(UsaProdotto.iphone);
            }
        }
        
    }
}
