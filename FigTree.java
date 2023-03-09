public class FigTree extends Tree {


    FigTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,null);
        
    }

    @Override
    public String toString() {
        if (season == Season.WINTER) {
            return "Fig tree.{" +
                    "My height is:" + height +
                    "and I have no leaves"+
                    '}';
        }
        //Fig tree. My height is: 304 and I have no leaves
        //Fig tree. My height is: 266 and my color is: YELLOW
        //Fig tree. I give fruit. My height is: 264 and my color is: GREEN
        if (season == Season.SUMMER) {
            return "Fig tree.{" +"I give fruit."+
                    "My height is:" + height +
                    "and my color is:" + leavesColor +
                    '}';

        } else {
            return "Fig tree.{" +
                    "My height is:" + height +
                    "and my color is:" + leavesColor +
                    '}';
        }
    }

    @Override
    public void changeSeason() {
        // TODO: Implement.
        this.changeSeason();
        this.influenceSeason();
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
