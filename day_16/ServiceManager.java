package day_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceManager {

    public static void main(String[] args) {

        List<Service> serviceList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean choice = true;

        while (choice) {

            System.out.println("Enter service name:");
            String name = input.nextLine();

            System.out.println("Enter service charge:");
            double charge = input.nextDouble();
            input.nextLine();

            serviceList.add(new Service(name, charge));

            System.out.println("Do you want to continue adding services? (y/n)");
            char c = input.next().charAt(0);
            input.nextLine();

            if (c == 'n' || c == 'N') {
                choice = false;
            }
        }

        System.out.println("\nAvailable Services:");

        for (Service service : serviceList) {
            System.out.println(service);
        }

        if (!serviceList.isEmpty()) {
            Service firstService = serviceList.get(0);
            System.out.println("\nFirst service name: " + firstService.getServiceName());
        }

        input.close();
    }
}