package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập loại cần tạo");
            String animalType = scanner.nextLine();
            AnimalFactory.getAnimalType(animalType).eat();
        } while (true);
    }
}
