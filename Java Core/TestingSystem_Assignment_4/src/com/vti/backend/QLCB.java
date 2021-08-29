package com.vti.backend;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Canbo;
import com.vti.entity.CongNhan;
import com.vti.entity.Gender;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

public class QLCB {
	
	
	private static List<Canbo> canBos ;
	
	public QLCB() {
		canBos = new ArrayList<Canbo>();
	}

	public void themCanBO() {
		Scanner scanner = new Scanner(System.in);

		byte loaiCanBo;

		boolean isloaiCanBo = false;

		do {
			System.out.println("Bạn muốn thêm loại cán bộ nào:" + "1 Công Nhân , 2 Kỹ Sư , 3 Nhân Viên");
			loaiCanBo = scanner.nextByte();

			switch (loaiCanBo) {
			case 1:
				themCongNhan();
				isloaiCanBo = true;
				break;
			case 2:
				themKySu();
				isloaiCanBo = true;
				break;
			case 3:
				themNhanVien();
				isloaiCanBo = true;
				break;
			default:
				System.out.println("Mời bạn nhập lại!(giá trị trong khoảng 1-3)");
				break;
			}
		} while (isloaiCanBo = false);

	}

	public Gender themGioiTinh() {
		Scanner scanner = new Scanner(System.in);

		byte gioiTinh;

		do {
			System.out.println("Mời bạn nhập vào giới tính:(1 - nam , 2 nữa , 3 khác )");
			gioiTinh = scanner.nextByte();
			switch (gioiTinh) {
			case 1:
				return Gender.MALE;

			case 2:
				return Gender.FEMALE;
			case 3:
				return Gender.UNKNOWN;

			default:
				System.out.println("Mời bạn nhập lại!(giá trị trong khoảng 1-3)");
				break;
			}

		} while (gioiTinh <= 0 || gioiTinh > 3);

		return Gender.MALE;
	}

	public void themCongNhan() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập vào id:");
		short id = scanner.nextShort();
		scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên:");
		String name = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tuổi:");
		byte age = scanner.nextByte();
		scanner.nextLine();

		Gender gender = themGioiTinh();

		System.out.println("Mời bạn nhập địa chỉ:");
		String address = scanner.nextLine();
		byte bac;
		do {
			System.out.println("Mời bạn nhập vào bậc:(1 - 10 )");
			bac = scanner.nextByte();
			if (bac < 0 || bac > 10) {
				System.out.println("Bạn đã nhập sai! Mời bạn nhập lại");
			}
		} while (bac < 0 || bac > 10);

		CongNhan congNhan = new CongNhan(id, name, age, gender, address);
		canBos.add(congNhan);
		System.out.println("Thêm thành công!" + congNhan);

	}

	public void themKySu() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập vào id:");
		short id = scanner.nextShort();
		scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên:");
		String name = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tuổi:");
		byte age = scanner.nextByte();
		scanner.nextLine();

		Gender gender = themGioiTinh();

		System.out.println("Mời bạn nhập địa chỉ:");
		String address = scanner.nextLine();

		System.out.println("Mời bạn nhập vào nghành đào tạo:");
		String nganhDaoTao = scanner.nextLine();

		KySu kySu = new KySu(id, name, age, gender, address, nganhDaoTao);
		canBos.add(kySu);
		System.out.println("Thêm thành công!" + kySu);
	}

	public void themNhanVien() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập vào id:");
		short id = scanner.nextShort();
		scanner.nextLine();

		System.out.println("Mời bạn nhập vào tên:");
		String name = scanner.nextLine();

		System.out.println("Mời bạn nhập vào tuổi:");
		byte age = scanner.nextByte();
		scanner.nextLine();

		Gender gender = themGioiTinh();

		System.out.println("Mời bạn nhập địa chỉ:");
		String address = scanner.nextLine();

		System.out.println("Mời bạn nhập vào công việc");
		String congViec = scanner.nextLine();

		NhanVien nhanVien = new NhanVien(id, name, age, gender, address, congViec);
		canBos.add(nhanVien);
		System.out.println("Thêm thành công!" + nhanVien);
	}

	public void timkiemCanBO() {
		Scanner scanner = new Scanner(System.in);

		byte loaiCanBo;

		boolean isloaiCanBo = false;

		do {
			System.out.println("Bạn muốn tìm kiếm theo loại cán bộ nào:" + "1 Công Nhân , 2 Kỹ Sư , 3 Nhân Viên");
			loaiCanBo = scanner.nextByte();

			switch (loaiCanBo) {
			case 1:
				timKiemCongNhanTheoTen();
				isloaiCanBo = true;
				break;
			case 2:
				timKiemKySuTheoTen();
				isloaiCanBo = true;
				break;
			case 3:
				timKiemNhanVienTheoTen();
				isloaiCanBo = true;
				break;
			default:
				System.out.println("Mời bạn nhập lại!(giá trị trong khoảng 1-3)");
				break;
			}
		} while (isloaiCanBo = false);

	}

	public void timKiemCongNhanTheoTen() {

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		name = name.trim().toLowerCase();
		
		boolean isExist = false;
		
		for (Canbo CongNhan : canBos) {
			if (CongNhan.getName().toLowerCase().equals(name)) {
				System.out.println(CongNhan);
				isExist = true;
			}

		}
		if (isExist== false) {
			System.out.println("Không tìm thấy!");
		}
		
	}

	public void timKiemKySuTheoTen() {
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		name = name.trim().toLowerCase();
		
		boolean isExist = false;

		for (Canbo KySu : canBos) {
			if (KySu.getName().toLowerCase().equals(name)) {
				System.out.println(KySu);
				isExist = true;
			}

		}
		if (isExist == false) {
			System.out.println("Không tìm thấy!");
		}
		
	}

	public void timKiemNhanVienTheoTen() {

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		name = name.trim().toLowerCase();

		for (Canbo NhanVien : canBos) {
			if (NhanVien.getName().toLowerCase().equals(name)) {
				System.out.println(NhanVien);
			}

		}
		System.out.println("Không tìm thấy!");
	}
	
	public void hienThiDanhSachCanBo() {
		for (int i = 0; i < canBos.size(); i++) {
			if (canBos.get(i) instanceof CongNhan) {
				System.out.println(canBos.get(i));
			} else if (canBos.get(i) instanceof KySu) {
				System.out.println(canBos.get(i));
			} else {
				System.out.println(canBos.get(i));	
				
			}
		}
		
	}
	
	public void xoaCanBoTheoTen() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập vào tên cán bộ cần xóa:");
		String name = scanner.nextLine();
		name = name.trim().toLowerCase();

		boolean isExist = false;

		for (Canbo canBo : canBos) {
			if (canBo.getName().toLowerCase().equals(name)) {
				canBos.remove(canBo);
				System.out.println("Xóa thành công!");
				isExist = true;
				break;
			}
		}

		if (isExist == false) {
			System.out.println("Không tìm thấy cán bộ nào có tên là: " + name);
		}
	}


}
