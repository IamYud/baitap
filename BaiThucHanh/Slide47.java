import java.util.Scanner;
public class Slide47 {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao so nguyen bat ky: ");
              number = sc.nextInt();
              sum += number;
          } while (sum < 100); 
            System.out.println("Tong cac so vua nhap = "+sum);
            sc.close();
           } 
        }
       