import java.util.ArrayList;
import java.util.HashMap;
public class menu {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Double>> menu = new HashMap<>();
        ArrayList<Double> mohitoPrice = new ArrayList<>();
        mohitoPrice.add(350.0);
        mohitoPrice.add(15.5);
        mohitoPrice.add(92.0);
        menu.put("Коктейль Mojito", mohitoPrice);
        ArrayList<Double> tiramisuPrice = new ArrayList<>();
        tiramisuPrice.add(350.0);
        tiramisuPrice.add(15.5);
        tiramisuPrice.add(92.0);
        menu.put("Тирамису", tiramisuPrice);
        ArrayList<Double> ramenPrice = new ArrayList<>();
        ramenPrice.add(230.0);
        ramenPrice.add(8.50);
        ramenPrice.add(7.00);
        menu.put("Рамен", ramenPrice);
        System.out.println(menu);
    }
}
