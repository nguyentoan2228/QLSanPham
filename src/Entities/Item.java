package Entities;

public class Item {
    private int id;
    private String name;
    private String describe;
    private int quantity;
    private double price;
    private String unit;

    public Item() {
    }
    public Item(int id,String name, String describe, int quantity, double price, String unit) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Mô tả: " + describe);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Giá bán: " + price);
        System.out.println("Đơn vị tính: " + unit);
        System.out.println("----------------------");
    }
}


