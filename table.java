import java.util.HashMap;
public class table {
    public static void main (String[] args){
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Канада", "Торонто");
        capitals.put("Ирак", "Багдад");
        capitals.put("Австрия", "Вена");
        capitals.put("Канада", "Оттава");
        System.out.println(capitals);
    }
}
