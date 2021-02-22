package semana_4_2;

public class Arbusto extends Vegetal implements Actor{

    private int alturaEnCm;
    private String tipoClima;
    private boolean esVenenoso;

    public Arbusto(String nombre, String tipo, String  color, int alturaEnCm, String  tipoClima, boolean esVenenoso) {
        super(nombre, tipo,  tipoClima);
        this.alturaEnCm = alturaEnCm;
        this. tipoClima =  tipoClima;
        this.esVenenoso = esVenenoso;
    }

    @Override
    public void actuar() {
        System.out.println("Como arbusto, yo no hago hago el papel");
    }

    @Override
    public void divertir() {
        System.out.println("Como arbusto, yo me divierto");
    }

    @Override
    public void desaparecer() {
        System.out.println("Como arbusto, yo desaparezco");
    }

    @Override
    public void madurar() {
        super.madurar();
    }

    @Override
    public void podrirse() {
        super.podrirse();
    }

    @Override
    public void realizarFotosintesis() {
        System.out.println("Como arbusto, yo hago mi fotosíntesis");
    }

    public void secarse() {
        System.out.println("Me sequé");
    }

    public void generarSemillas() {
        System.out.println("Voy a ser padre");
    }

    public void generarAroma() {
        System.out.println("Olorcito rico!");
    }

    @Override
    public String toString() {
        return "Arbusto{" +
                "alturaEnCm=" + alturaEnCm +
                ",  tipoClima='" +  tipoClima + '\'' +
                ", esVenenoso=" + esVenenoso +
                '}';
    }

    public int getAlturaEnCm() {
        return alturaEnCm;
    }

    public void setAlturaEnCm(int alturaEnCm) {
        this.alturaEnCm = alturaEnCm;
    }

    public String getTipoClima() {
        return  tipoClima;
    }

    public void setTipoClima(String  tipoClima) {
        this. tipoClima =  tipoClima;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }
}
