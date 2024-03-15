import java.util.Scanner;
public class hocsinh {
    public static void main(String[] args) {
        Student st = new Student();
        st.Nhapthongtin();
        st.Xuatthongtin();
        st.Diemtongket();
    }
}
class Student{
    String Ten;
    int Tuoi;
    Float DiemX, DiemY, DiemZ;
    Float Diemtk;
    void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin hoc sinh");
        System.out.println("Nhap ten hoc sinh");
        Ten = sc.nextLine();
        System.out.println("Nhap tuoi hoc sinh");
        Tuoi = sc.nextInt();
        System.out.println("Nhap diem X");
        DiemX = sc.nextFloat();
        System.out.println("Nhap diem Y");
        DiemY = sc.nextFloat();
        System.out.println("Nhap diem Z");
        DiemZ = sc.nextFloat();
        sc.close();
    }
void Xuatthongtin() {
    System.out.println("Ten hoc sinh" + Ten);
    System.out.println("Tuoi hoc sinh" + Tuoi);
    System.out.println("Diem X cua hoc sinh" + DiemX);
    System.out.println("Diem Y cua hoc sinh" + DiemY);
    System.out.println("Diem Z cua hoc sinh" + DiemZ);
}
void Diemtongket() {
    Diemtk = ( DiemX + DiemY + DiemZ )/3;
    System.out.println("Diem tong ket : " +Diemtk);
}
}