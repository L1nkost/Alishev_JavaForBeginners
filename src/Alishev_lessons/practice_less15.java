package Alishev_lessons;

import com.ibm.dtfj.corereaders.zos.mvs.LsedTemplate;

public class practice_less15 {
    public static void main(String[] args) {

        Person2 h1 = new Person2();
        h1.setName("Jake");
        h1.setAge(34);
        System.out.println("Выводим значение в мейн методе: " +h1.getAge());
        System.out.println("Выводим значение в мейн методе: " +h1.getName());
    }
}

    class Person2 {
        private String name;
        private int age;

        public void setName(String Username) {
            if (Username.isEmpty()) {
                System.out.println("Empty name");
            } else {
                name = Username;
            }
        }
        public String getName() {
            return name;
        }

        public void setAge(int Userage) {
            if (Userage < 0) {
                System.out.println("Empty age");
            } else {
                age = Userage;
            }
        }
        public int getAge() {
            return age;
        }

        void setNameAndAge(String username, int userage) {
            name = username;
            age = userage;
        }

        int calculateYearsToRetirement() {
            int years = 65-age;
            return years;
        }

        void speak() {
            System.out.println( "Hi, i'm " +name );
        }
        void sayHello() {
            System.out.println( "Hello" );
        }
    }