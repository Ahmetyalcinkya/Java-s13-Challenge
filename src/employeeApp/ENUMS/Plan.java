package employeeApp.ENUMS;

public enum Plan {

    BASIC("TEMEL", 5000),
    MEDIUM("STANDART", 10000),
    ADVANCED("GELİŞMİŞ", 15000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
