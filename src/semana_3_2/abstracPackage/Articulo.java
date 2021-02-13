package semana_3_2.abstracPackage;

public abstract class Articulo {
    private String codigo;
    private String marca;
    private String modelo;
    private int garantiaEnMeses;
    private double precio;

    /**
     *
     */
    public Articulo() {
        // TODO Auto-generated constructor stub
    }

    public Articulo(String codigo, String marca, String modelo, int garantiaEnMeses, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.garantiaEnMeses = garantiaEnMeses;
        this.precio = precio;
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantiaEnMeses() {
        return garantiaEnMeses;
    }

    public void setGarantiaEnMeses(int garantiaEnMeses) {
        this.garantiaEnMeses = garantiaEnMeses;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void imprimirDescripcion();
}
