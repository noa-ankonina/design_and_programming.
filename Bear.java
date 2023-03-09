public class Bear extends Animal {
    Bear(int weight, Season season) {

        // TODO: Implement.
        super(weight,season, Color.BROWN);
    }

    @Override
    public String toString() {
        Season season = getCurrentSeason();
        if (season == Season.WINTER){
            return "Bear " + "I am sleeping" +
                    " My weight is:" + weight +
                    " and my color is:" + color+ '\n';
        }else{
            return "Bear" +
                    " My weight is:" + weight +
                    " and my color is:" + color+ '\n';
        }
    }

    public void influenceSeason() {
        Season season = getCurrentSeason();
        if (season == Season.WINTER) {
            this.weight = (int) (this.weight - (this.weight * 0.2));
        }
        if (season == Season.SPRING)
            this.weight= (int) (this.weight-(this.weight*0.25));
        if (season == Season.SUMMER)
            this.weight= (int) (this.weight+(this.weight*0.25));
        if (season == Season.FALL)
            this.weight= (int) (this.weight+(this.weight*0.25));

    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        super.changeSeason();
        this.influenceSeason();
    }
}
