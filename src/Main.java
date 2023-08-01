public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Вес боксера №1 " + boxer1 + " кг");
        System.out.println("Вес боксера №2 " + boxer2 + " кг");
        var totalweight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров " + totalweight + " кг");
        System.out.println("Задача 7");
        var weightdif = boxer2 - boxer1;
        System.out.println("Разница в весе " + weightdif + " кг");
        var weight_dif = boxer2 % boxer1;
        System.out.println("Весовая разница " + weightdif + " кг");
    }
}