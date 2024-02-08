import java.util.Scanner;
public class Slide90 {
    public static void main(String[] args){
        String chuoi;
        char Kytu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ky");
        chuoi = scanner.nextLine();
        System.out.println("Cac ky tu vo trong chuoi");
        for (int i=0;i<chuoi.length();i++) {
            Kytu = chuoi.charAt(i);
            System.out.println(Kytu);
            scanner.close();
        }
    }
}