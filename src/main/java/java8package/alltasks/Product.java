package java8package.alltasks;

public class Product {

    public String name;
    public int price;

    public String category;

    public String grade;

    public Product(String name, int price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    public String toString() {
        return "name: " + name + " price: " + price + " category: " + category + " grade: " + grade;
    }
}