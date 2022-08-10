import java.util.Scanner;
public class PatikaDev {
    static void plus(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = input.nextInt();
        int n, result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.print(i + ". sayi :");
            n = input.nextInt();
            if (i == 1){
                result += n;
                continue;
            }
            result += n;
        }
        System.out.println("Sonuc : " + result);
    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = input.nextInt();
        int n, result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.print(i + ". sayi :");
            n = input.nextInt();
            if (i == 1){
                result += n;
                continue;
            }
            result -= n;
        }
        System.out.println("Sonuc : " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = input.nextInt();
        int n, result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.print(i + ". sayi :");
            n = input.nextInt();
            if (i == 1){
                result += n;
                continue;
            }
            result *= n;
        }
        System.out.println("Sonuc : " + result);
    }

    static void divided(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = input.nextInt();
        int n, result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.print(i + ". sayi :");
            n = input.nextInt();
            if (i == 1){
                result += n;
                continue;
            }
            result /= n;
        }
        System.out.println("Sonuc : " + result);
    }

    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degeri giriniz: ");
        int base = input.nextInt();
        System.out.print("Us degeri giriniz: ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++){
            result *= base;
        }
        System.out.println("Sonuc : " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++){
            result*=i;
        }
        System.out.println("Sonuc: " +result);
    }

    static void mod(){
        int a, b, result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        a = input.nextInt();
        System.out.print("Mod degerini giriniz: ");
        b = input.nextInt();
        result = a % b;
        System.out.println("Sonuc : " + result);
    }

    static void alan(){
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("a degeri giriniz: ");
        a = input.nextInt();
        System.out.print("b degeri giriniz: ");
        b = input.nextInt();
        System.out.println("Cevresi : " + (2* (a+b)));
        System.out.println("Alan : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama Islemi \n"
                    +"2- Cikarma Islemi \n"
                    +"3- Carpma Islemi \n"
                    +"4- Bolme Islemi \n"
                    +"5- Uslu Sayi Hesaplama \n"
                    +"6- Faktoriyel Hesaplama \n"
                    +"7- Mod alma \n"
                    +"8- Dikdortgen Alan ve Cevre Hesabi \n"
                    +"0- Cikis";
        while(true){
            System.out.println(menu);
            System.out.print("Lutfen bir islem seciniz: ");
            select = input.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alan();
                    break;

            }

            if (select == 0)
            {
                break;
            }

        }
    }
}

