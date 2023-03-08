public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        // TODO: Implement.
        super(weight, season, null);
    }

    @Override
    public String toString() {
        Season season = this.getCurrentSeason();
        if (season == Season.WINTER){
            return "Caribou:{" +"I am migrating south."+
                    "weight=" + weight +
                    ", color=" + color +
                    '}';
        }
        if (season == Season.SUMMER){
            return "Caribou:{" +"I am migrating north."+
                    "weight=" + weight +
                    ", color=" + color +
                    '}';
        } else {

        return "Caribou{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        this.changeSeason();
        Season season = this.getCurrentSeason();

        if (season == Season.WINTER) {
            this.color = Color.WHITE;
        }
        if (season == Season.SPRING || season == Season.SUMMER || season == Season.FALL)
            this.color = Color.BROWN;


    }
}
