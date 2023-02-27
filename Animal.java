public abstract class Animal implements Seasonable,Comparable{
    protected int weight;
    private Season season;
    protected Color color;

    // TODO: Add auxiliary fields and functions.

    Animal(int weight, Season season, Color color){
        this.weight =weight;
        this.season =season;
        this.color =color;
    }

    @Override
    public void changeSeason() {

        this.season= this.season.values()[getCurrentSeason().ordinal() + 1];

    }

public void influenceSeason(){

    }
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        // TODO: Implement.
        if(this.weight >  ((Animal) o).weight)
            return 1;
        if(this.weight >((Animal) o).weight)
            return-1;
        return 0;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", season=" + season +
                ", color=" + color +
                '}';
    }
}
