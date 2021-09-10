package entities;

import java.util.Scanner;

public class GiangVien {
    protected String ten,email, diaChi, dienThoai;
    protected int soGioDay;

    public GiangVien(String ten, String email, String diaChi, String dienThoai) {
        this.ten = ten;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
    }

    public GiangVien() {
    }

    public void fromConsole(Scanner sc){
        GiangVien gv = new GiangVien();

        System.out.println("- Tên: ");
        gv.ten = sc.nextLine();

        System.out.println("- Email: ");
        gv.email = sc.nextLine();

        System.out.println("- Điện Thoại: ");
        gv.dienThoai = sc.nextLine();

        System.out.println("- Địa chỉ: ");
        gv.diaChi = sc.nextLine();

        System.out.println("- Số giờ dạy trong tháng: ");
        gv.soGioDay = Integer.parseInt(sc.nextLine());


    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiangVien{");
        this.getGVString(sb);
        sb.append('}');
        return sb.toString();
    }

    protected void getGVString(StringBuffer sb) {
        sb.append("ten='").append(ten).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", diaChi='").append(diaChi).append('\'');
        sb.append(", dienThoai='").append(dienThoai).append('\'');
        sb.append(", soGIoDay=").append(soGioDay);
    }
    public int tinhLuong() {
        return 0;
    }

}
