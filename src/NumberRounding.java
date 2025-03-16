import java.util.Scanner;

public class NumberRounding {
    //round(x): En yakın tam sayıya yuvarlar
    //ceil(x): Yukarı yuvarlar
    //floor(x): Aşağı yuvarlar
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");

        String Input= scanner.nextLine();

        Input =Input.replace(",",".");

        double InputNumber = Double.parseDouble(Input);//Niye bu işlemi yaptım :lokal olarak tr olduğu için input olarak örn :5.7  hata olur.
                                                        //bizde double parse yapacaz ama o da , girlirse hata veriyor o yüzden virgülü
                                                        //noktaya çevirdik ki parse çalışsın :)


        // Math işlemleri

        int InputNumberRound = (int) Math.round(InputNumber);//round(x): En yakın tam sayıya yuvarlar

        int InputNumberCeil = (int )Math.ceil(InputNumber);//ceil(x): Yukarı yuvarlar

        int InputNumberFloor = (int) Math.floor(InputNumber);//floor(x): Aşağı yuvarlar

        System.out.println("Aşağı Yuvarlama : " + InputNumberFloor);

        System.out.println("Yukarı Yuvarlama: " + InputNumberCeil);

        System.out.println("En Yakın Tam Sayı: " + InputNumberRound);

        scanner.close();

    }
}
