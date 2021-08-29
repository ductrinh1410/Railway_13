package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.QLCB;

public class Program {

	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		
		QLCB qlcb = new QLCB();
		
		System.out.println("-----PHẦN MỀM QUẢN LÍ CÁN BỘ-----");
		
		System.out.println("1- Thêm mới cán bộ");
		System.out.println("2- Tìm kiếm cán bộ");
		System.out.println("3- Hiển thị danh sách cán bộ");
		System.out.println("4- Xóa cán bộ theo tên");
		System.out.println("5- Thoát khỏi chương trình");
		
		byte chucNang;
		do {
			System.out.println("Mời bạn chọn chức năng: (1-5)");
			chucNang = scanner.nextByte();
			
			switch (chucNang) {
			case 1:
				qlcb.themCanBO();
				break;
			case 2:
				qlcb.timkiemCanBO();
				break;
			case 3:
				qlcb.hienThiDanhSachCanBo();
				break;
			case 4:
				qlcb.xoaCanBoTheoTen();
				break;
			case 5:
				return;
				
			default:
				System.out.println("Mời bạn nhập lại giá trị trong khoảng (1-5)");
				break;
			}
		} while (chucNang != 5);
	
	}
}
