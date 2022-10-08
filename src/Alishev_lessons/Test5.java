package Alishev_lessons;


interface AbleToEat {
    public void eat();
}

public class Test5 {
    public static void main(String[] args) {     // Анонимный класс - одиночное использование
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };

        ableToEat.eat();
    }
}
