import java.util.Scanner;

public class makine {
    public static void main(String[] args) {

        int a,b,secim,sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.print("ilk Degeri Giriniz : ");
        a= inp.nextInt();
        System.out.print("ikinci Degeri Giriniz : ");
        b= inp.nextInt();
        System.out.print(" \n1) Toplama\n2) Cikarma\n3) Bolme\n4) Carpma\n Yampak istediginiz islemi seciniz : " );
        secim = inp.nextInt();

        switch (secim) {
            case 1:
                sonuc = a + b;
                System.out.print(sonuc);
                break;
            case 2:
                sonuc = a - b;
                System.out.print(sonuc);
                break;
            case 3:
                switch (b){
                    case 0 :
                    System.out.print("0 Bolmede Olmaz");
                    break;
                    default:
                        sonuc = a / b;
                        System.out.print(sonuc);
                        break;
                }


                break;
            case 4:
                sonuc = a * b;
                System.out.print(sonuc);
                break;
            default:
                System.out.print("Hatali Secim");
                break;
        }






    }
}
