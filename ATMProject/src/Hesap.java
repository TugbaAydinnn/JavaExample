public class Hesap {
    private int bakiye=0;
    private String hesapNo;
    private String email;
    private String telefonNo;

    public Hesap(String username){
        System.out.println("Atm'ye hosgeldiniz sayin: "+username);
    }
    public void bakiyeGoster(String username){
        System.out.println("Sayin: "+username+" bakiyeniz "+bakiye+ "tl'dir.");
    }
    public int paraYatirma(int miktar){
        bakiye+=miktar;
        System.out.println("Yeni Bakiyeniz: "+bakiye+" tl'dir.");
        return bakiye;
    }
    public int paraCekme(int miktar){
        if(miktar>bakiye){
            System.out.println("Yetersiz bakiye...");
        }else{
        bakiye-=miktar;
        System.out.println("Yeni Bakiyeniz: "+bakiye+" tl'dir.");
        }
        return bakiye;
    }
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public int getBakiye() {
        return bakiye;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }
}
