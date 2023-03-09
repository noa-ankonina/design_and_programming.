public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setLeavesColor(Color leavesColor) {
        this.leavesColor = leavesColor;
    }

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return this.season;
    }

    @Override
    public void changeSeason() {
        if(season==Season.FALL)
            this.season=Season.WINTER;
        else
            this.season= this.season.values()[getCurrentSeason().ordinal() + 1];
    }

    @Override
    public int compareTo(Object o) {
        // TODO: Implement.

        if(this.height >  ((Tree) o).height)
            return 1;
        if(this.height < ((Tree) o).height)
            return-1;
        return 0;
    }

    public void influenceSeason(){

    }
    @Override
    public String toString() {
        return " Tree" +
                "height=" + height +
                ", season=" + season +
                ", leavesColor=" + leavesColor + '\n';
    }
}
