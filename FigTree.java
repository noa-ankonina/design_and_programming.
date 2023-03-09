public class FigTree extends Tree {


    FigTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,Color.YELLOW);
    }

    @Override
    public String toString() {
        if (season == Season.WINTER) {
            return "Fig tree. " +
                    " My height is:" + height +
                    " and I have no leaves"+ '\n';
        }

        if (season == Season.SUMMER) {
            return "Fig tree. " +"I give fruit."+
                    " My height is:" + height +
                    " and my color is:" + leavesColor+ '\n';

        } else {
            return "Fig tree. " +
                    " My height is:" + height +
                    " and my color is:" + leavesColor+ '\n';
        }
    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        super.changeSeason();
        this.influenceSeason();
    }

    @Override
    public void influenceSeason() {

        Season season = getCurrentSeason();
        if (season == Season.WINTER)
            this.setHeight(this.height+20);
        if (season == Season.FALL){
            this.height = this.height+20;
        this.leavesColor= Color.YELLOW;}
        if (season == Season.SPRING ){
            this.height = this.height+30;
            this.leavesColor= Color.GREEN;
        }
        if (season == Season.SUMMER)
            this.height += 30;

    }

}
