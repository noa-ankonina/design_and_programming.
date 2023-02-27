public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        // TODO: Implement.
        super(weight, season, null);
    }

    @Override
    public String toString() {
        //
        return "Caribou{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        this.changeSeason();
        Season season = this.getCurrentSeason();

        if (season == Season.WINTER) {
            this.color = Color.WHITE;
        }
        if (season == Season.SPRING)
            this.color = Color.BROWN;


    }
}
