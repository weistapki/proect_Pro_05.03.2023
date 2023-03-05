package v3;

import java.util.Scanner;

public class EmployeeInfo {
    static String fullName;
    static String position;
    static String email;
    static int telephone;
    static int age;
    static Employee employee;
    public static void main(String[] args) {

        handleInputs();

        employee = new Employee();

        employee.setFullName(fullName);
        employee.setPosition(position);
        employee.setEmail(email);
        employee.setTelephone(telephone);
        employee.setAge(age);

        showInfo();
    }
    private static void handleInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Full Name: ");
        fullName = scanner.nextLine();
        System.out.print("Position: ");
        position = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Telephone: ");
        telephone = scanner.nextInt();
        System.out.print("Age:");
        age = scanner.nextInt();
    }
    private static void showInfo() {
        System.out.println(
                "Name: " + employee.getFullName() +
                        "\nPosition: " + employee.getPosition() +
                        "\nEmail: " + employee.getEmail() +
                        "\nTelephone: " + employee.getTelephone() +
                        "\nAge: " + employee.getAge());

    }
}
