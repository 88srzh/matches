package edu.java.game;

public class ComputerLogics extends Matches
{
    public void computerLogics() {

//        Scanner sc = new Scanner(System.in);
        Matches compMatches = new Matches();

        compMatches.quantityMatches = 20;
        System.out.println("Введите число: ");

        int compNumber = (int) ((Math.random() *3) +1);
        System.out.println(" - Количество выбранных компьютером спичек: " + compNumber);
        compMatches.setRemainedMatches(compMatches.getQuantityMatches() - compNumber);
        System.out.println("На столе осталось " + compMatches.getRemainedMatches() + " спичек.");

    }
}
