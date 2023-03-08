public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        // TODO: Implement.
        super(height,season,null);
    }

    @Override
    public String toString() {
        if(season == Season.FALL){
            //Olive tree. I give fruit. My height is: 224 and my color is: GREEN
            return "Olive tree.{" + "I give fruit."+
                    "My height is:" + height +
                    "and my color is:" + leavesColor +
                    '}';
        }else {
            //Olive tree. My height is: 193 and my color is: GREEN
            return "Olive tree.{" +
                    "My height is:" + height +
                    "and my color is:" + leavesColor +
                    '}';
        }
    }

    @Override
    public void changeSeason() {

        this.changeSeason();
        this.influenceSeason();
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
