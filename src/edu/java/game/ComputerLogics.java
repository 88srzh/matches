package edu.java.game;

import java.util.Scanner;

public class ComputerLogics extends Matches {
    public void computerLogics() {
        quantityMatches = 20;

        ConsoleMessages consoleMessages = new ConsoleMessages();

        int subtractionMatches = 20;

        while (subtractionMatches > 0) {

            if (quantityMatches > 4) {
                System.out.println("Введите число: ");
                int compNumber = (int) ((Math.random() * 3) + 1);
                System.out.println(" - Количество выбранных компьютером спичек: " + compNumber);
                quantityMatches = (quantityMatches - compNumber);
//            consoleMessages.callRemainedMatches();
                System.out.println("На столе осталось " + quantityMatches + " спичек.");
            } else if (quantityMatches < 4) {
                compNumber = 1;
                System.out.println(" - Количество выбранных компьютером спичек: " + compNumber);
                quantityMatches = (quantityMatches - compNumber);
            }


            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: ");
            int peopleNumber = sc.nextInt();
//            sc.close();

            if (peopleNumber > 0 && peopleNumber < 4) {
                System.out.println(" - Количество выбранных человеком спичек: " + peopleNumber);
                quantityMatches = (quantityMatches - peopleNumber);
//                consoleMessages.callRemainedMatches();
                System.out.println("На столе осталось " + quantityMatches + " спичек");
                subtractionMatches = quantityMatches;
            } else if (peopleNumber > 3) {
                System.out.print("Вы не можете вводить больше 3, попробуйте снова.\nВведите число: ");
                int peopleNumberRepeat = sc.nextInt();
                System.out.println(" - Количество выбранных человеком спичек: " + peopleNumberRepeat);
                quantityMatches = (quantityMatches - peopleNumberRepeat);
//                consoleMessages.callRemainedMatches();
                System.out.println("На столе осталось " + quantityMatches + " спичек");
            }


        }
    }
}