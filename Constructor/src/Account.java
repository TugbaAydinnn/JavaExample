public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;

    public  Account(){
        this("Bilgi Yok",0.0,"Bilgi Yok","Bilgi Yok","Bilgi Yok");

    }
    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo ) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;

    }
    public Account(String isim,String email,String telefonNo){
        this("Bilgi yok",0.0,isim,email,telefonNo);

    }
    public void ekranaYaz(){
        System.out.println("Hesap Numarasi: "+hesapNo);
        System.out.println("Bakiye: "+bakiye);
        System.out.println("Isim: "+isim);
        System.out.println("E-mail: "+email);
        System.out.println("Telefon Numarasi: "+telefonNo);
    }

    private String email;
    private String telefonNo;
    private double toplamMiktar=0;

    public void parayatirma(double miktar){
        bakiye+=miktar;
        System.out.println("Yeni Bakiye: "+bakiye);
    }
    public void paraCekme(double miktar){
        if(bakiye<miktar){
            System.out.println("yaterli miktarda para bulunmamaktadır.İşlem gerçekleştirilmemektedir.");
        }
        else{

            toplamMiktar+=miktar;
                if(toplamMiktar>=1500){
                    System.out.println("para cekme limitine ulaştınız...");
                }
                else{
                    bakiye-=miktar;
                    System.out.println("Yeni bakiye: "+bakiye);
                }

        }
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }
}
