package Entities;

import java.util.Scanner;

public class ItemService {
    public Item[] items(){
        Item[] itemArray = new Item[5];
        itemArray[0] = new Item(1,"bàn chải đánh răng", "vệ sinh",20,20000,"vnđ");
        itemArray[1] = new Item(2,"chảo", "đồ gia dụng",3,130000,"vnđ");
        itemArray[2] = new Item(3,"mì tôm", "thực phẩm",20,5000,"vnđ");
        itemArray[3] = new Item(4,"máy tính", "điện tử",4,10000000,"vnđ");
        itemArray[4] = new Item(5,"giấy cuộn", "vệ sinh",20,55000,"vnđ");
        return itemArray;
    }
    public void print(){
        for (Item i: items()){
            i.print();
        }
    }
    public void findName(Item[] items, String name){
        int cout = 0;
        for (Item i: items()){
            if (i.getName().toLowerCase().contains(name.toLowerCase())){
                i.print();
                cout ++;
            }
        } if (cout == 0){
            System.out.println("không tìm thấy sản phẩm");
        }
    }
    Scanner scanner = new Scanner(System.in);
    public void findId(Item[] items, int id){
        int cout = 0;

        for (Item i: items()){
            if (i.getId()==id){
                i.print();
                cout ++;
                System.out.println("bạn có muốn thay đổi số lượng sản phẩm Y/N:");
                String option = scanner.nextLine();
                if (option.equalsIgnoreCase("Y")) {
                    System.out.println("Nhập số lượng mới:");
                    int newQuantity = Integer.parseInt(scanner.nextLine());
                    i.setQuantity(newQuantity);
                    i.print();
                }
            }
        } if (cout == 0){
            System.out.println("không tìm thấy sản phẩm");
        }
    }

    public void findQuantity(Item[] items){
        for (Item i: items){
            if (i.getQuantity() < 5){
                i.print();
            }
        }
    }
    public void fPrince(Item[] items){
        System.out.println("lựa chọn mức giá bạn muốn mua");
        System.out.println("1 - dưới 50000.");
        System.out.println("2 - 50000 đến 100000.");
        System.out.println("3 - 100000 trở lên.");
        int choice = Integer.parseInt(scanner.nextLine());
        int cout = 0;
        switch (choice){
            case 1:
                for (Item i: items){
                    if (i.getPrice() < 50000){
                        i.print();
                        cout++;
                    }
                }
                break;
            case 2:
                for (Item i: items){
                    if (i.getPrice() > 50000 && i.getPrice() < 100000){
                        i.print();
                        cout++;
                    }
                }
                break;
            case 3:
                for (Item i: items){
                    if (i.getPrice() > 100000){
                        i.print();
                        cout++;
                    }
                }
                break;
            default:
                System.out.println("không hợp lệ");
        }
        if (cout == 0){
            System.out.println("không có sản phẩm!");
        }
    }
}

