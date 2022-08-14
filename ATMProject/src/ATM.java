import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        int trueLogin=0;
        int kontrol=1;
        int cikis=0;
        Login loginObject=new Login();

        Scanner scanner=new Scanner(System.in);
        do {
            if(trueLogin==1){
                break;
            }
            System.out.print("Username Giriniz...");
            String username=scanner.nextLine();
            System.out.print("Password Giriniz");
            String password=scanner.nextLine();

            String kntrlUsername=loginObject.getUsername();
            String kntrlPassword=loginObject.getPassword();


            if (kntrlUsername.equals(username) && kntrlPassword.equals(password)) {
                trueLogin=1;
                Hesap hesapObject=new Hesap(username);
                do{

                System.out.println("------------------ ISLEMLER ------------------");
                System.out.println("1-Bakiye Goruntuleme \n" +
                                   "2-Para Yatirma \n" +
                                   "3-Para Cekme \n" +
                                   "4-Cikis \n");
                int islem=scanner.nextInt();
                switch (islem){
                    case 1:
                        hesapObject.bakiyeGoster(username);
                        break;
                    case 2:
                        System.out.print("Yatirilacak tutari giriniz: ");
                        int miktar=scanner.nextInt();
                        hesapObject.paraYatirma(miktar);
                        break;
                    case 3:
                        System.out.print("Atm'den cekilecek para miktarini giriniz:");
                        int tutar=scanner.nextInt();
                        hesapObject.paraCekme(tutar);
                        break;
                    case 4:
                        cikis=1;
                        break;
                }
                }while (cikis!=1);

            } else {
                System.out.println("Username veya password hatali... :(");
                System.out.println("Yapilan hatali giris sayisi: "+kontrol);
            }

            kontrol++;
            if(kontrol>3){
                System.out.println("3 kez hatali giris yapildi...");
            }


        }while (kontrol<=3);



    }
}
