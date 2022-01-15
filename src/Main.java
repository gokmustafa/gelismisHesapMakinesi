import java.util.Scanner;
public class Main{
    static int plus (int a, int b){
        int result=a+b;
        System.out.print("Toplam= "+result);
        return a+b;
    }

    static int minus (int a, int b){
        int result=a-b;
        System.out.print("Toplam= "+result);
        return a-b;

    }

    static int times (int a, int b){
        int result=a*b;
        System.out.print("Toplam= "+result);
        return a*b;

    }

    static int divided (int a, int b){
        int result=a/b;
        System.out.print("Toplam= "+result);
        return a/b;

    }
    static int usAlma( int a, int b){
        int result=1;
        for (int i=1; i<=b; i++){
            result *= a;
        }
        System.out.print(result);
        return result;
    }

    static int mod (int a, int b){
        int result=a%b;
        System.out.print("mod "+result);
        return a%b;

    }

    static void rectangle (int a, int b){

        System.out.print("Çevre "+(2*(a+b)));
        System.out.print("\nAlan "+(a*b));


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu =
                "1- Toplama İşlemi\n" +
                        "2- Çıkarma İşlemi\n" +
                        "3- Çarpma İşlemi\n" +
                        "4- Bölme işlemi\n" +
                        "5- Üslü Sayı Hesaplama\n" +
                        "6- Mod Alma\n" +
                        "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                        "0- Çıkış Yap\n";



        System.out.print(menu);
        while (true)    {
            System.out.print("\nLütfen seçim yapınız: ");
            int select = input.nextInt();
            if (select==0){
                break;
            }
            System.out.print("Birinci sayıyı giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b= input.nextInt();


            switch(select){
                case 1:
                    plus (a,b);
                    break;
                case 2:
                    minus (a,b);
                    break;
                case 3:
                    times (a,b);
                    break;
                case 4:
                    divided (a,b);
                    break;
                case 5:
                    usAlma (a,b);
                    break;
                case 6:
                    mod (a,b);
                    break;
                case 7:
                    rectangle (a,b);
                    break;
                default:
                    System.out.print("Geçersiz sayı girdiniz");


            }


        }

    }


}

