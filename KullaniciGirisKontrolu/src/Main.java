import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        String girilenUsername="";
        String girilenPassword="";
        int girisSayisi=0;
        do {
            System.out.print("Username giriniz: ");
            girilenUsername = scanner.nextLine();

            System.out.print("Password giriniz: ");
            girilenPassword = scanner.nextLine();
            if(((girilenUsername.equals(username))&&(girilenPassword.equals(password)))){
                System.out.println("hosgeldiniz");
                break;
            }
            else{
                System.out.println("Hatali giris, tekrar deneyiniz.");
                girisSayisi++;
            }
            if(girisSayisi==3){
                break;
            }

        } while (!((girilenUsername.equals(username)&&(girilenPassword.equals(password)))));


    }
}
