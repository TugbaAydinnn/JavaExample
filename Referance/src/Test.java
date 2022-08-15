public class Test {
    public static void main(String[] args){
        Hesap hesap1=new Hesap("ali","yilmaz");
        Hesap hesap2=hesap1;

        Hesap hesap3=new Hesap("ayşe","aydemir");
        if(hesap1==hesap3){
            System.out.println("bellekte ayni yeri gosteriyor");
        }
        else{
            System.out.println("bellekte farkli yeri gosteriyor");
        }
    }
}
