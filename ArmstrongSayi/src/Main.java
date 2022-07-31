import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int kalan,basamakSayisi=0;
        int toplam=0;
        System.out.print("Lutfen sayi giriniz...");
        int sayi=scanner.nextInt();
        int degerTut=sayi;
        int sayi1=sayi;
        do{
            kalan=sayi%10;
            sayi=sayi/10;
            basamakSayisi+=1;

        }while (sayi>0);
        System.out.println("Basamak Sayisi: "+basamakSayisi);
        while (sayi1>0){
            kalan=sayi1%10;
            sayi1=sayi1/10;
            toplam+=Math.pow(kalan,basamakSayisi);

        }
        System.out.println("Toplam: "+toplam);
        if(degerTut==toplam){
            System.out.println("Armstrong sayi");
        }
        else{
            System.out.println("Armstrong sayi degildir.");
        }

    }
}
