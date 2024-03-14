import java.util.Random;
public class Main {
    public static void main(String[] args){
        int age = 30;
        int temperature = 10;
        String result = permission(age, temperature);
        System.out.println("Результат: " + result);
    }
    public static String permission(int age, int temperature) {
        if ((age >= 20 & age <= 45 & temperature >= -20 & temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}