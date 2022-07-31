import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //miktar=ana para
        //faiz oranı->%6
        System.out.println("Bankamiza hosgelniz (faiz orani %6)");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yatirilacak para miktari: ");
        float miktar=scanner.nextFloat();
        System.out.print("Kac yil vadeli yatirmak istiyorsunuz? ");
        int vade=scanner.nextInt();
        double faizHesabi=miktar;
        int i=1;
        do{
            faizHesabi=(double) ((faizHesabi*0.06)+faizHesabi);
            System.out.println(i+". yil sonunda toplam para  "+faizHesabi);
            vade--;
            i++;
        }while (vade>0);
        System.out.println(faizHesabi);

    }
}
