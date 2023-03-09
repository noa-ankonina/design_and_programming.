public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        // TODO: Implement.
        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {
        Season season = this.getCurrentSeason();
        if (season == Season.WINTER){
            return "Caribou: " +"I am migrating south."+
                    " weight=" + weight +
                    ", color=" + color+ '\n';
        }
        if (season == Season.SUMMER){
            return "Caribou: " +"I am migrating north."+
                    " weight=" + weight +
                    ", color=" + color+ '\n';
        } else {

        return "Caribou " +
                " weight=" + weight +
                ", color=" + color+ '\n';
    }
    }

    public void influenceSeason() {
        Season season = getCurrentSeason();
        if (season == Season.WINTER) {
            this.setColor(Color.WHITE);
        }
        if (season == Season.SPRING || season == Season.SUMMER || season == Season.FALL)
            this.setColor(Color.BROWN);
    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        super.changeSeason();
        this.influenceSeason();
    }

}
