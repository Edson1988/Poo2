import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

    //tiene atributos varaiables caracteristicas

    private Float ancho;
    private Float alto;
    private Float profundidad;
    private String material;
    private Integer numRuedas;
    private String tipo;

    private List<Producto>productos;

    //metodo acciones



    public Double obtenerTotal(){

        Double total=0D;
        for(Producto p : productos){
            total+=p.getPrecio();
        }

        return total;
    }


    //constructos

  /*  public CarritoDeCompras(Float ancho, Float alto, Float profundidad, String material, Integer numRuedas, String tipo, List<Producto> productos) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
        this.material = material;
        this.numRuedas = numRuedas;
        this.tipo = tipo;
        this.productos = productos;
    }*/

    public CarritoDeCompras(){

productos=new ArrayList<>();
    }



    // gets and sets


    public Float getAncho() {
        return ancho;
    }

    public void setAncho(Float ancho) {
        this.ancho = ancho;
    }

    public Float getAlto() {
        return alto;
    }

    public void setAlto(Float alto) {
        this.alto = alto;
    }

    public Float getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Float profundidad) {
        this.profundidad = profundidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(Integer numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
