package com.geekbang.jvm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class MyClassLoader extends ClassLoader{

    public static void main(String[] args) {
        try {
             Object obj = new MyClassLoader().findClass("Hello").newInstance();
             Method[] declareMethods = obj.getClass().getDeclaredMethods();

            for (Method m : declareMethods ) {

                System.out.println(m.toString());
                m.invoke(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        File file = new File(name);
        int len = (int) file.length();
        byte[] bytes = new byte[len];
        try {
            int classLen = new FileInputStream(file).read(bytes);

            for (int i = 0;i<bytes.length;i++){
                bytes[i] = (byte) (255-bytes[i]);
            }
            return defineClass("Hello", bytes, 0, bytes.length);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return super.findClass(name);
    }
}
