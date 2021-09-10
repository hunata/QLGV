import entities.GiangVien;
import entities.GiangVienCoHuu;
import entities.GiangVienThinhGiang;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Số giảng viẹn");
//        int n = Integer.parseInt(sc.nextLine());
//
//        GiangVien[] list = new GiangVien[n];
//        for (int i = 0 ; i<n;i++){
//            System.out.format("Giảng viên thứ %d\n", i+1);
//            System.out.format("- Loại GV: 0 Cơ hữu, 1 Thỉnh giảng");
//            int type = Integer.parseInt(sc.nextLine());
//
//            if (type ==0){
//                list[i] = new GiangVienCoHuu();
//
//            }else{
//                list[i]= new GiangVienThinhGiang();
//            }
//            list[i].fromConsole(sc);
//        }
GiangVien[] list = {
        new GiangVienCoHuu("Nam", "Nam", "ad","no",5000000, 40),
        new GiangVienCoHuu("Nam", "Nam", "ad","no",4000000, 40),
        new GiangVienThinhGiang("Nam1","Nam","dc","dt","hcm"),
};
            for(GiangVien gv: list){
                System.out.println(gv);
            }

            int total = 0;
        for (GiangVien gv : list) {
            int luong = gv.tinhLuong();
            System.out.println(luong);
            total += luong;
        }
        System.out.format("Tông lương: %d\n", total);

//            for(GiangVien gv: list){
//                if (gv instanceof GiangVienCoHuu){
//                    System.out.println(gv);
//                }
//            }
    }
}
