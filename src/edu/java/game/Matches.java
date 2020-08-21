package edu.java.game;

public class Matches
{
    int quantityMatches;
    int remainedMatches;
    int selectedMatches;
    int compNumber;

    public Matches() {
    }

    public Matches(int quantityMatches, int remainedMatches, int selectedMatches, int compNumber) {
        this.quantityMatches = quantityMatches;
        this.remainedMatches = remainedMatches;
        this.selectedMatches = selectedMatches;
        this.compNumber = compNumber;
    }

    public int getCompNumber() {
        return compNumber;
    }

    public void setCompNumber(int compNumber) {
        this.compNumber = compNumber;
    }

    public Matches(int selectedMatches) {
        this.selectedMatches = selectedMatches;
    }

    public int getSelectedMatches() {
        return selectedMatches;
    }

    public void setSelectedMatches(int selectedMatches) {
        this.selectedMatches = selectedMatches;
    }

    public int getQuantityMatches() {
        return quantityMatches;
    }

    public void setQuantityMatches(int quantityMatches) {
        this.quantityMatches = quantityMatches;
    }

    public int getRemainedMatches() {
        return remainedMatches;
    }

    public void setRemainedMatches(int remainedMatches) {
        this.remainedMatches = remainedMatches;
    }

    @Override
    public String toString() {
        return "Matches{" +
                "quantityMatches=" + quantityMatches +
                ", remainedMatches=" + remainedMatches +
                ", selectedMatches=" + selectedMatches +
                '}';
    }
}
