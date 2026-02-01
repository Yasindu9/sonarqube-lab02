package com.example;

public class App {

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        // Call the worse duplicated method version
// System.out.println removed (Sonar issue fix)
String result = String.valueOf(calc.calculate(10, 5, "add-again"));

        UserService service = new UserService();

        // Existing unsafe SQL injection call
        service.findUser("admin");

        // NEW dangerous SQL injection delete method call
        service.deleteUser("admin");
    }
}
