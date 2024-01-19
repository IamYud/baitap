package BaiThucHanh;
import java.util.Scanner;
public class PhuongTrinhBacNhat {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap he so a");
        double a =scanner.nextDouble();
        System.out.print("Nhap he so b");
        double b =scanner.nextDouble();
        giaiPhuongTrinhBacNhat(a,b);
        scanner.close();
}
public static void giaiPhuongTrinhBacNhat(double a,double b){
    if(a == 0) {
        if (b == 0){
            System.out.println("Phuong Trinh Co Vo So Nghiem");
        } else {
            System.out.println("Phuong trinh Vo Nghiem");
        }
    } else {
        double x = -b/a;
        System.out.println("Nghiem Cua Phuong Trinh La x =" +x);
    }
}
}