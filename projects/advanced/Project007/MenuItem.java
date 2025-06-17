package Project007;

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public MenuItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("┌───────────────┐\n");
        stringBuilder.append("│   Menu Item   │\n");
        stringBuilder.append("├───────────────┤\n");
        stringBuilder.append("│ Name: ").append(name);
        for (int i = 0; i < 14 - name.length(); i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("│\n");
        stringBuilder.append("│ Price: $").append(price);
        for (int i = 0; i < 11 - String.valueOf(price).length(); i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("│\n");
        stringBuilder.append("└───────────────┘");
        return stringBuilder.toString();
    }

}
