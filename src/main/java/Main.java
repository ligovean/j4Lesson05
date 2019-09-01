import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Новый рюкзак на 5 литров
        Backpack backpack1 = new Backpack(5);
        
        //Вещички
        List<Item> list = new ArrayList<>();
        list.add(new Item("Книга",   1, 600));
        list.add(new Item("Бинокль", 2, 5000));
        list.add(new Item("Аптечка", 4, 1500));
        list.add(new Item("Ноутбук", 2, 40000));
        list.add(new Item("Котелок", 1, 500));

        backpack1.calcBestCollect(list);

        list = backpack1.getBestCollect();


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getPrise());
        }
        System.out.println();
        System.out.println("C " + backpack1.getCount() + " попытки набрали вещичек на " + backpack1.getBestPrice() + " руб.");

    }
}
