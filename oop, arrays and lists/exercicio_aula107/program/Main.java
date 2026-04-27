package program;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();


        System.out.println("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

            System.out.println("-".repeat(50));

            System.out.print("Digite o ID do funcionario que terá o salário aumentado: ");
            int id = sc.nextInt();
            Employee emp = list.stream().filter(x -> x.getId() == id).findFirst() .orElse(null);
            if (emp == null) {
                System.out.println("esse ID não existe!");
            } else {
                System.out.print("Digite a porcentagem para aumento: ");
                int percent = sc.nextInt();
                emp.addSalary(percent);
            }

            System.out.println("-".repeat(50));

            System.out.println("Lista de funcionarios:");
            for (Employee e : list) {
                System.out.println(e);
            }

    }
}
