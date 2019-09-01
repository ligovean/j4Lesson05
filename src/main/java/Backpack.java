import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private final int value;

    private int bestPrice;
    private List<Item> bestCollect = null;

    private int cnt;

    public int getCount() {
        return cnt;
    }

    public Backpack(int value) {
        this.value = value;
    }

    public int getBestPrice() {
        return bestPrice;
    }

    public List<Item> getBestCollect() {
        return bestCollect;
    }

    private int totalItemsVal(List<Item> items) {
        int totalVal = 0;
        for (Item item : items) {
            totalVal += item.getValue();
        }
        return totalVal;
    }

    private int totalItemsPrise(List<Item> items) {
        int totalPrise = 0;
        for (Item item : items) {
            totalPrise += item.getPrise();
        }
        return totalPrise;
    }

    private void bestCollect(List<Item> items) {
        if (totalItemsVal(items) <= value && totalItemsPrise(items) > bestPrice) {
            bestCollect = items;
            bestPrice = totalItemsPrise(items);
        }
    }

    public void calcBestCollect(List<Item> items) {
        cnt++;
        if (items.size() > 0) {
            bestCollect(items);
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> list = new ArrayList<>(items);
            list.remove(i);
            calcBestCollect(list);
        }
    }
}
