package example4;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<?> cl = Animal.class;
        Animal animal = new Animal();
        System.out.println(animal.getName());
        System.out.println(animal.getBreed());
        System.out.println(animal.getAge());
        Field filedAge = cl.getDeclaredField("age");
        filedAge.setAccessible(true);
        filedAge.setInt(animal, 10);
        Field fileBreed = cl.getDeclaredField("breed");
        fileBreed.setAccessible(true);
        fileBreed.set(animal, "Maine Coon");
        Field filedName = cl.getDeclaredField("name");
        filedName.setAccessible(true);
        filedName.set(animal, "Vasja");
        System.out.println(animal.getName());
        System.out.println(animal.getBreed());
        System.out.println(animal.getAge());
    }
}
