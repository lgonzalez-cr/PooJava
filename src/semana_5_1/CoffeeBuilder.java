package semana_5_1;

public class CoffeeBuilder extends StarbucksBuilder{

    private String atributo_1;
    private String atributo_2;
    private String atributo_3;

    public CoffeeBuilder() {}

    public CoffeeBuilder(String atributo_1, String atributo_2, String atributo_3) {
        this.atributo_1 = atributo_1;
        this.atributo_2 = atributo_2;
        this.atributo_3 = atributo_3;
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

    public String getAtributo_3() {
        return atributo_3;
    }

    public void setAtributo_3(String atributo_3) {
        this.atributo_3 = atributo_3;
    }

    @Override
    public void buildSize(){
        System.out.println("CoffeeBuilder buildSize");
    }

    @Override
    public void buildDrink(){
        System.out.println("CoffeeBuilder buildDrink");
    }

    public void metodo_1(){
        System.out.println("CoffeeBuilder metodo_1");
    }

    @Override
    public String toString() {
        return "CoffeeBuilder{" +
                "atributo_1='" + atributo_1 + '\'' +
                ", atributo_2='" + atributo_2 + '\'' +
                ", atributo_3='" + atributo_3 + '\'' +
                '}';
    }
}
