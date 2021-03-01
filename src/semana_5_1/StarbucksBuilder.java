package semana_5_1;

public abstract class StarbucksBuilder {
    private Starbucks starbucks;


    public void createStarbucks(){
        starbucks = new Starbucks("Small", "Espresso", 2000);
    }

    public Starbucks getStarbucks(){
        return starbucks;
    }

    public abstract void buildSize();

    public abstract void buildDrink();
}
