package Entities;

import java.util.Scanner;

public class MenuManager {
    private Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1 - xem danh sách sản phẩm:");
        System.out.println("2 - tìm sản phẩm theo tên:");
        System.out.println("3 - tìm sản phẩm theo ID:");
        System.out.println("4 - tìm sản phẩm số lượng dưới 5:");
        System.out.println("5 - tìm sản phẩm theo mức giá:");
        System.out.println("0 - thoát chương trình");
        System.out.println("mời bạn lựa chọn:");
        return Integer.parseInt(scanner.nextLine());
    }

    public String getInputString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public int getInputInt(String message) {
        System.out.print(message);
        return Integer.parseInt(scanner.nextLine());
    }
}
