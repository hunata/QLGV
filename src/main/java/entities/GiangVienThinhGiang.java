package entities;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private String coQuan;

    public GiangVienThinhGiang(String ten, String email, String diaChi, String dienThoai, String coQuan) {
        super(ten, email, diaChi, dienThoai);
        this.coQuan = coQuan;
    }

    public GiangVienThinhGiang() {
    }

    @Override
    public void fromConsole(Scanner sc) {
        super.fromConsole(sc);
        System.out.println("- Cơ quan: ");
        this.coQuan = sc.nextLine();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GiangVienThinhGiang{");
       super.getGVString(sb);
        sb.append(", coQuan='").append(coQuan).append('\'');
        sb.append('}');
        return sb.toString();
    }
    @Override
    public int tinhLuong() {
        final int luong1Gio = 200000;
        return this.soGioDay * luong1Gio;
    }
}
