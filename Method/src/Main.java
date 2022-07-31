import java.util.Scanner;

public class Main {
    public static void EbobHesapla(int s1,int s2){

        int k1,k2,i=3;
        int ebob=1;
        int geciciS1=s1;
        int geciciS2=s2;
        while (s1>0&&s2>0){
           if(s1%2==0 && s2%2==0){
               s1=s1/2;
               s2=s2/2;
               ebob*=2;


           }else{
               k1=s1%i;
               k2=s2%i;
               s1=s1/i;
               s2=s2/i;


               if(k1==0 && k2==0){
               ebob*=i;}
               i++;


           }



        }
        System.out.println("girilen sayilarin ebobu: "+ebob);

    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz: ");
        int s1=scanner.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        int s2=scanner.nextInt();
        EbobHesapla(s1,s2);
    }
}
