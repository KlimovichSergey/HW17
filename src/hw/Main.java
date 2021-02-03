package hw;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Home home = new Home();
        Class clazz = home.getClass();
        System.out.println(clazz.getName());

        Field [] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            System.out.println(field.getName());
        }
            Method [] methods = clazz.getMethods();
            for(Method method : methods) {
                System.out.println(method.getName());
            }
    }
}
