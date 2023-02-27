public class FigTree extends Tree {


    FigTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,null);
    }

    @Override
    public String toString() {
        return "FigTree{" +
                "height=" + height +
                ", season=" + season +
                ", leavesColor=" + leavesColor +
                '}';
    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        this.changeSeason();
    }

    @Override
    public void influenceSeason() {

        Season season = getCurrentSeason();
        if (season == Season.WINTER)
            this.height = this.height+=20;
        if (season == Season.FALL){
            this.height = this.height+=20;
        this.leavesColor= Color.YELLOW;}
        if (season == Season.SPRING ){
            this.height = this.height+=30;
            this.leavesColor= Color.GREEN;
        }
        if (season == Season.SUMMER)
            this.height = this.height+=30;

    }

}
