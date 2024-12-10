/**
 * Herencia Instrumento
 */
public class Instrumento {
    private String tipo;
    private String material;
    private String nombre;
    private String codigo;
    private int precio;
    private int stock;


    /**
     * Constructor de la clase
     * @param tipo
     * @param codigo
     * @param precio
     * @param stock
     * @param material
     * @param nombre
     */
    public Instrumento(String tipo, String codigo, int precio, int stock, String material, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.material = material;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Get del tipo intrumento
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * get del codigo del instrumento
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * get del precio del instrumento
     * @return
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * del del stock del instrumento
     * @return
     */
    public int getStock() {
        return stock;
    }

    /**
     * get del material del instrumento
     * @return
     */
    public String getMaterial() {
        return material;
    }

    /**
     * get del nombre del instrumento
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * set del stock del instrumento
     * @return
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
