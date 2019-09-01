package campaign;

public class Item {

    private final String name;
    private final int value;
    private final int prise;

    public Item(String name, int value, int prise) {
        this.name = name;
        this.value = value;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getPrise() {
        return prise;
    }



}
