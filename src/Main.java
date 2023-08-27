import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklıgı Giriniz: ");
        heat = input.nextInt();
        String choice = (heat < 5)?  "Kayak Yapabilirsin": "";

        if ((heat >= 5) && (heat <= 25)){
            if (heat <=15){
                System.out.println("Sinemaya Gidebilirsin.");
            }if (heat > 10){
                System.out.println("Piknik Yapabilirsin.");
            }
        }else {
            System.out.println("Yüzmeye Gidebilirsin.");
        }
    }
}