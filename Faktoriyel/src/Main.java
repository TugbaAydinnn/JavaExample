import java.util.Scanner;

public class Main {
    public static int Faktoriyel(int sayi){
        int faktoriyel=1;
        while (sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }
        return faktoriyel;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Faktoriyeli alinacak sayiyi giriniz: ");
        int sayi=scanner.nextInt();
       int faktoriyel= Faktoriyel(sayi);
       System.out.println(sayi+" sayisinin faktoriyeli "+faktoriyel+" 'dir.");

    }
}
