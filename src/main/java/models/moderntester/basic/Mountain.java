package models.moderntester.basic;

public class Mountain {
    private final int rank;
    private final String peak;
    private final String mountainRange;
    private final String state;
    private final int height;

    public Mountain(int rank, String peak, String mountainRange, String state, int height) {
        this.rank = rank;
        this.peak = peak;
        this.mountainRange = mountainRange;
        this.state = state;
        this.height = height;
    }

    public String getPeak() {
        return peak;
    }

    public String getMountainRange() {
        return mountainRange;
    }

    public String getState() {
        return state;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rank: " + rank +
                ", Peak: " + peak +
                ", Mountain range: " + mountainRange;
    }
}
