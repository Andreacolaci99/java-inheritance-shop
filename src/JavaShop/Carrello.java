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
            switch (smartphoneScelto) {
               case "Iphone":

               Smartphone iphone = new Smartphone(5739472);
               iphone.setNome("Iphone 16");
               iphone.setMarca("Apple");
               iphone.setPrezzo(999.99);
               iphone.setIva(1.22);
               iphone.setCodiceImei("IWAHXI9483");
               iphone.setMemoria(128.0);
               System.out.println(iphone);
               break;

               case "Samsung":

                Smartphone samsung = new Smartphone(2379872);
                samsung.setNome("Samsung Galaxy S20");
                samsung.setMarca("Samsung");
                samsung.setPrezzo(789.99);
                samsung.setIva(1.22);
                samsung.setCodiceImei("IWAHIDH27192");
                samsung.setMemoria(256.0);
                System.out.println(samsung);
                break;

               default:
                   System.out.println("Inserire almeno uno smartphone !");
             }
           }else if (prodottoScelto.equals("Televisore")){
            System.out.println("Quale televisore hai scelto ?");
            String televisoreScelto = scan.nextLine();
            switch (televisoreScelto) {

                case "lg":
                Televisore lg = new Televisore(4938203);
                lg.setNome("LG Ultra");
                lg.setMarca("LG");
                lg.setPrezzo(1499.99);
                lg.setIva(1.22);
                lg.setDimensioni(69.7);
                lg.setSmartTv(true);
                System.out.println(lg);            
                break;

                case "philips":
                Televisore philips = new Televisore(41288303);
                philips.setNome("Philips Ultra");
                philips.setMarca("Philips");
                philips.setPrezzo(1799.99);
                philips.setIva(1.22);
                philips.setDimensioni(92.0);
                philips.setSmartTv(false);
                System.out.println(philips);
                break;
                default:
                    System.out.println("Inserire almeno un televisore !");
            }
           }else if(prodottoScelto.equals("Cuffie")){
            System.out.println("Quali cuffie hai scelto ?");
            String cuffieScelte = scan.nextLine();
            switch (cuffieScelte) {

                case "airPods":
                Cuffie airPods = new Cuffie(28741092);
                airPods.setNome("AirPods Pro");
                airPods.setMarca("Apple");
                airPods.setPrezzo(579.00);
                airPods.setIva(1.22);
                airPods.setColore("Blue Navy");
                airPods.setSonoWireless(true);
                airPods.setSonoCablate(false);
                System.out.println(airPods);
                break;

                case "sony":
                Cuffie sony = new Cuffie(28741092);
                sony.setNome("Sony Pro");
                sony.setMarca("Sony");
                sony.setPrezzo(289.00);
                sony.setIva(1.22);
                sony.setColore("Dark Green");
                sony.setSonoWireless(false);
                sony.setSonoCablate(true);
                System.out.println(sony);
                break;
                default:
                    System.out.println("Inserire almeno un tipo di cuffie !");
            }
           }else{
            System.out.println("NON HAI INSERITO NESSUN PRODOTTO !!");
           }
        }
        
    }
