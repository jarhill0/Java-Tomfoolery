package L01;

public class Restaurant {
    private String name;
    private String openingTime;
    private String closingTime;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setOpeningTime(String o) {
        openingTime = o;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setClosingTime(String c) {
        closingTime = c;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();
        myRestaurant.setName("Taste of America");
        myRestaurant.setOpeningTime("5:00");
        myRestaurant.setClosingTime("6:00");
        System.out.println(myRestaurant.getName());
        System.out.println(myRestaurant.getOpeningTime());
        System.out.println(myRestaurant.getClosingTime());
    }

}
