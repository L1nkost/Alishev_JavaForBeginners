package Serializing_1;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1,"Bob"), new Person(2,"Mike"), new Person(3,"Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
