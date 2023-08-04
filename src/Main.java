import Entities.ItemService;
import Entities.MenuManager;

public class Main {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();
        itemService.items();

        MenuManager menuManager = new MenuManager();
        int choice;
        do {
            choice = menuManager.showMenu();
            switch (choice) {
                case 1:
                    itemService.print();
                    break;
                case 2:
                    String name = menuManager.getInputString("Mời bạn nhập tên:");
                    itemService.findName(itemService.items(), name);
                    break;
                case 3:
                    int id = menuManager.getInputInt("Mời bạn nhập ID:");
                    itemService.findId(itemService.items(), id);
                    break;
                case 4:
                    System.out.println("-----sản phẩm có số lượng dưới 5:-----");
                    itemService.findQuantity(itemService.items());
                    break;
                case 5:
                    itemService.fPrince(itemService.items());
                    break;
                case 0:
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng lựa chọn lại:");
                    break;
            }
        } while (choice != 0);
    }
}
