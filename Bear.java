public class Bear extends Animal {
    Bear(int weight, Season season) {

        // TODO: Implement.



        super(weight,season, Color.BROWN);
    }

    @Override
    public String toString() {
        Season season = getCurrentSeason();
        if (season == Season.WINTER){
            return "Bear{" + "I am sleeping" +
                    " My weight is:" + weight +
                    "and my color is:" + color +
                    '}';
        }else{
            return "Bear{" +
                    " My weight is:" + weight +
                    "and my color is:" + color +
                    '}';
        }



    }

    public void influenceSeason() {
        Season season = getCurrentSeason();
        if (season == Season.WINTER) {
            this.weight = this.weight - (this.weight * (20 / 100));

        }
        if (season == Season.SPRING)
            this.weight= this.weight-(this.weight*(25/100));
        if (season == Season.SUMMER)
            this.weight= this.weight+(this.weight*(1/3));
        if (season == Season.FALL)
            this.weight= this.weight+(this.weight*(25/100));

    }

    @Override
    public void changeSeason() {
        // TODO: Implement.

        this.changeSeason();
        this.influenceSeason();

    }
}
