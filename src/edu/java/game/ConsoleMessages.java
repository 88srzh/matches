package edu.java.game;

public class ConsoleMessages extends Matches
{
    public void callRemainedMatches() {
        System.out.println("На столе осталось " + getRemainedMatches() + " спичек.");
    }

//    public void callSelectedMatches() {
//        System.out.println(" - Количество выбранных компьютером спичек = " + selectedMatches);
//    }
}
