public class Main {
    public static void main(String[] args) {
        double price = 7_012.20;
        int one_mile_price = 20;
        int result = (int) Math.floor(price / one_mile_price);

        System.out.println("Поздравляем! Вам начислится " + result + " бонусных миль.");
    }
}