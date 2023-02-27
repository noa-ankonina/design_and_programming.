public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public void changeSeason() {

        this.season= this.season.values()[getCurrentSeason().ordinal() + 1];

    }

    @Override
    public int compareTo(Object o) {
        // TODO: Implement.

        if(this.height >  ((Tree) o).height)
            return 1;
        if(this.height >((Tree) o).height)
            return-1;

        return 0;
    }

    public void influenceSeason(){

    }
    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", season=" + season +
                ", leavesColor=" + leavesColor +
                '}';
    }
}
