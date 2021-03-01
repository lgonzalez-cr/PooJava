package semana_5_1;

public class Waiter {
    private StarbucksBuilder starbucksBuilder;
    private String atributo_1;
    private String atributo_2;

    public Waiter() {}

    public Waiter(StarbucksBuilder starbucksBuilder, String atributo_1, String atributo_2) {
        this.starbucksBuilder = starbucksBuilder;
        this.atributo_1 = atributo_1;
        this.atributo_2 = atributo_2;
    }

    public StarbucksBuilder getStarbucksBuilder() {
        return starbucksBuilder;
    }

    public void setStarbucksBuilder(StarbucksBuilder starbucksBuilder) {
        this.starbucksBuilder = starbucksBuilder;
    }

    public String getAtributo_1() {
        return atributo_1;
    }

    public void setAtributo_1(String atributo_1) {
        this.atributo_1 = atributo_1;
    }

    public String getAtributo_2() {
        return atributo_2;
    }

    public void setAtributo_2(String atributo_2) {
        this.atributo_2 = atributo_2;
    }

    public void constructStarbucks(){
        System.out.println("constructStarbucks");
    }

    public void metodo_1(){
        System.out.println("Waiter metodo_1");
    }

    public void metodo_2(){
        System.out.println("Waiter metodo_2");
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "starbucksBuilder=" + starbucksBuilder +
                ", atributo_1='" + atributo_1 + '\'' +
                ", atributo_2='" + atributo_2 + '\'' +
                '}';
    }
}
