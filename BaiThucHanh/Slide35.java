import java.util.Scanner;
public class Slide35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.print("Nhap so thu nhat :");
        num1 = sc.nextDouble();
        System.out.print("Nhap so thu hai :");
        num2 = sc.nextDouble();
        double SoNhoNhat = Math.min(num1,num2);
        System.out.println("So nho nhat la "+ SoNhoNhat);
        sc.close();
        
    }
}
    

