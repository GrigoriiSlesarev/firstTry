import java.util.HashMap;
public class orders {
public static void main (String[] args) {
HashMap<String, Double> orders = new HashMap<>();
    orders.put ("Иван И.", 4345.5);
    orders.put ("Ольга С.", 76564.43);
    orders.put ("Александр T.", 1234.86);
    orders.put ("Александр Р.", 23432.87) ;
    orders.put ("Екатерина 0.", 1034753.6) ;
    orders.put ("Ярослав В.", 450.0);
    Double sum = 0.0; // Объявите переменную, где будет сохранена общая сумма
         for (Double value : orders.values()) {
             sum += value;// Пройдитесь в цикле по значениям
     }
        System.out.println("Всего было совершено заказов на сумму: " + sum);
         System.out.println("Как дела?");
    System.out.println("люблю тебя?");
}
}
