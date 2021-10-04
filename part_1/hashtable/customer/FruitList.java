package customer;

import java.util.ArrayList;

public class FruitList {
    private ArrayList<String> myFruits = new ArrayList<>();

    public FruitList() {

    }

    public void enter(String nameFruit) {
        myFruits.add(nameFruit);

    }

    public ArrayList<String> getMyFruits() {
        return myFruits;
    }

    public void setMyFruits(ArrayList<String> myFruits) {
        this.myFruits = myFruits;
    }

    @Override
    public String toString() {
        return "myFruits=" + myFruits + '}';
    }
}
