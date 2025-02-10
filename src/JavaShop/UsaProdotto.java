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

        Smartphone samsung = new Smartphone(2379872);
        
        samsung.setNome("Samsung Galaxy S20");
        samsung.setMarca("Samsung");
        samsung.setPrezzo(789.99);
        samsung.setIva(1.22);
        samsung.setCodiceImei("IWAHIDH27192");
        samsung.setMemoria(256.0);

        Televisore philips = new Televisore(41288303);

        philips.setNome("Philips Ultra");
        philips.setMarca("Philips");
        philips.setPrezzo(1799.99);
        philips.setIva(1.22);
        philips.setDimensioni(92.0);
        philips.setSmartTv(false);

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

        Cuffie sony = new Cuffie(28741092);

        sony.setNome("Sony Pro");
        sony.setMarca("Sony");
        sony.setPrezzo(289.00);
        sony.setIva(1.22);
        sony.setColore("Dark Green");
        sony.setSonoWireless(false);
        sony.setSonoCablate(true);

        System.out.println(iphone);
        System.out.println(lg);
        System.out.println(airPods);
        System.out.println(samsung);
        System.out.println(philips);
        System.out.println(sony);
    }
    
}
