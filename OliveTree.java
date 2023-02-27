public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,null);
    }

    @Override
    public String toString() {
        return "OliveTree{" +
                "height=" + height +
                ", season=" + season +
                ", leavesColor=" + leavesColor +
                '}';
    }

    @Override
    public void changeSeason() {
        this.changeSeason();
    }

    @Override
    public void influenceSeason() {

        Season season = getCurrentSeason();
        if (season == Season.WINTER ||season == Season.FALL)
            this.height = this.height+=5;
        if (season == Season.SPRING ||season == Season.SUMMER)
            this.height = this.height+=20;

        }




}
