package Project007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>(
                Arrays.asList(
                        new MenuItem("Pizza", 10.0),
                        new MenuItem("Burger", 15.0),
                        new MenuItem("French Fries", 20.0),
                        new MenuItem("Hot Dog", 25.0),
                        new MenuItem("Pasta", 30.0),
                        new MenuItem("Chicken", 35.0),
                        new MenuItem("Fried Rice", 40.0),
                        new MenuItem("Pizza", 50.0),
                        new MenuItem("Burger", 55.0),
                        new MenuItem("French Fries", 60.0),
                        new MenuItem("Hot Dog", 65.0),
                        new MenuItem("Pasta", 70.0),
                        new MenuItem("Chicken", 75.0),
                        new MenuItem("Fried Rice", 80.0),
                        new MenuItem("Pizza", 90.0),
                        new MenuItem("Burger", 95.0),
                        new MenuItem("French Fries", 100.0),
                        new MenuItem("Hot Dog", 105.0),
                        new MenuItem("Pasta", 110.0),
                        new MenuItem("Chicken", 115.0),
                        new MenuItem("Fried Rice", 120.0)
                )
        );

        menuItems.forEach(System.out::println);

        OrderService orderService = new SimpleOrderService();

        orderService.placedOrder(menuItems.get(0));
        orderService.placedOrder(menuItems.get(1));
        orderService.placedOrder(menuItems.get(3));
        orderService.placedOrder(menuItems.get(4));
        orderService.placedOrder(menuItems.get(6));
        orderService.placedOrder(menuItems.get(7));
        orderService.placedOrder(menuItems.get(9));
        orderService.placedOrder(menuItems.get(4));
        orderService.placedOrder(menuItems.get(7));
        orderService.placedOrder(menuItems.get(1));
        orderService.placedOrder(menuItems.get(5));
    }


}