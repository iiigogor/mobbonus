public class Main {
    public static void main(String[] args) {
        int chek = 100;
        int make = 999;
        int bonus;
        int total;
        if (make <= 1000) {
            bonus = 0;
            System.out.println("Бонусов нет");
        } else {
            bonus = make / 100;
        }
        total = chek + make + bonus;
        System.out.println("На Вашем счете " + total + "рублей");
    }
}
