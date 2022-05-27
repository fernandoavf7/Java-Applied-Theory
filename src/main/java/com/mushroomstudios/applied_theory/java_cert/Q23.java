package com.mushroomstudios.applied_theory.java_cert;

public class Q23 {
    static {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}

/*
print :
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.ArithmeticException: / by zero
	at com.mushroomstudios.applied_theory.java_cert.Q23.<clinit>(Q23.java:5)
	
	

- static executes inmediately before the main string
*/