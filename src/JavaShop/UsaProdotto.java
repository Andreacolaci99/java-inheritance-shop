package JavaShop;

public class UsaProdotto {

    public static void main(String[] args) {
        
        Smartphone iphone = new Smartphone(5739472);
        
        iphone.setNome("Iphone 16");
        iphone.setMarca("Apple");
        iphone.setPrezzo(999.99);
        iphone.setIva(1.22);
        iphone.setCodiceImei("IWAHXI9483");
        iphone.setMemoria(128.0);

        Televisore lg = new Televisore(4938203);

        lg.setNome("LG Ultra");
        lg.setMarca("LG");
        lg.setPrezzo(1499.99);
        lg.setIva(1.22);
        lg.setDimensioni(69.7);
        lg.setSmartTv(true);

        Cuffie airPods = new Cuffie(28741092);

        airPods.setNome("AirPods Pro");
        airPods.setMarca("Apple");
        airPods.setPrezzo(579.00);
        airPods.setIva(1.22);
        airPods.setColore("Blue Navy");
        airPods.setSonoWireless(true);
        airPods.setSonoCablate(false);

        System.out.println(iphone);
        System.out.println(lg);
        System.out.println(airPods);
    }
    
}
