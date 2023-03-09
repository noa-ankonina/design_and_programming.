public class Caribou extends Animal {

    Caribou(int weight, Season season) {
        // TODO: Implement.
        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {

        //Caribou: My weight is: 208 and my color is: BROWN
        Season season = this.getCurrentSeason();
        if (season == Season.WINTER){
            return "Caribou: " +"I am migrating south. "+
                    "My weight is: " + weight +
                    " and my color is: " + color;
        }
        if (season == Season.SUMMER){
            return "Caribou: " +"I am migrating north."+
                    "My weight is: " + weight +
                    " and my color is: " + color;
        } else {

        return "Caribou: " +
                "My weight is: " + weight +
                " and my color is: " + color;
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
