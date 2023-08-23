package example2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class cl = String.class;
        System.out.println("All fields:");
        Field[] fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + fieldType.getName());
        }
        System.out.println("Constructors:");
        Constructor[] constructor = cl.getConstructors();
        for (Constructor c: constructor) {
            System.out.println(c.getName());
            System.out.println(c.getParameterTypes());
        }

    }
}
