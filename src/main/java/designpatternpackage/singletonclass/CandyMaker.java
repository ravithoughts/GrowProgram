package designpatternpackage.singletonclass;

public class CandyMaker {
    private boolean empty;
    private boolean boiled;
    private static CandyMaker instance;

    private CandyMaker() {
        empty = true;
        boiled = false;
    }

    public static CandyMaker getInstance() {
        if (instance == null) {
            synchronized (CandyMaker.class) {
                if (instance == null) {
                    System.out.println("Creating instance of Candy Maker");
                    instance = new CandyMaker();
                }
            }
        }
        System.out.println("Returning instance of Candy Maker");
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}