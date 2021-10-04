package test;

public class Fruit {
    private int code;
    private String name;
    private String origin;
    private double price;

    public Fruit(int code, String name, String origin, double price){
        this.code = code;
        this.name = name;
        this.origin = origin;
        this.price = price;
    }    

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "code: "+code+"; name: "+name+"; origin: "+origin+"; price: "+price;
    }
}
