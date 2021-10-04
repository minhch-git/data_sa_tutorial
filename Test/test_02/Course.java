package test_02;

public class Course {
    private int id;
    private String name;
    private String author;
    private int price;
    
    public Course(int id, String name, String author, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "id: "+this.getId()+"; name: "+this.getName()+"; price: "+this.getPrice()+"; author: "+this.getAuthor();
    }
}
