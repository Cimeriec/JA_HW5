package example3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) {
        Class<?> cl = Car.class;
        Field[] fields = cl.getDeclaredFields();
        System.out.println("All fields:");
        for (Field f: fields) {
            System.out.print("Name: " + f.getName() + "\t\t");
            System.out.print("Modifier: " + getMod(f.getModifiers()) + "\t\t");
            System.out.println("Type: " + f.getType());
        }
        System.out.println("--------------------------------------");
        Constructor<?>[] constructor = cl.getConstructors();
        System.out.println("Constructors:");
        for (Constructor c: constructor) {
            System.out.println("Name: " + c.getName());
            System.out.print("Types: ");
            for (Parameter p: c.getParameters()) {
                System.out.print(p.getType() + "\t\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
        Method[] methods = cl.getMethods();
        System.out.println("Methods:");
        for (Method m: methods) {
            System.out.print("Name: " + m.getName() + "\t\t");
            System.out.print("Modifier: " + getMod(m.getModifiers())+ "\t\t");
            System.out.println("Return types: " + m.getReturnType() + "\t\t");
            System.out.println("Parameters: " + "\t\t");
            for (Parameter p: m.getParameters()) {
                System.out.println("\t" + p.getType() + "\t\t");
            }
        }
    }
public static String getMod (int mod) {
        String result;
        switch (mod) {
            case 1: result = "public"; break;
            case 2: result = "private"; break;
            case 4: result = "protected"; break;
            case 8: result = "static"; break;
            case 16: result = "final"; break;
            case 32: result = "synchronized"; break;
            case 64: result = "volatile"; break;
            case 128: result = "transient"; break;
            case 256: result = "native"; break;
            case 1024: result = "abstract"; break;
            default: result = "unknown";
        }
    return result;
}
}
class Car {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
