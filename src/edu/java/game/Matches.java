package edu.java.game;

public class Matches
{
    int setRemainedMatches;
    int remainedMatches;
    int selectedMatches;
    int compNumber;

    public Matches() {
    }

    public Matches(int setRemainedMatches, int remainedMatches, int selectedMatches, int compNumber) {
        this.setRemainedMatches = setRemainedMatches;
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

    public int getSetRemainedMatches() {
        return setRemainedMatches;
    }

    public void setSetRemainedMatches(int setRemainedMatches) {
        this.setRemainedMatches = setRemainedMatches;
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
                "quantityMatches=" + setRemainedMatches +
                ", remainedMatches=" + remainedMatches +
                ", selectedMatches=" + selectedMatches +
                '}';
    }
}
