/**
 * Clase Cuerda
 */

public class Cuerda extends Instrumento {
    private String tipoCuerda;
    private int numeroCuerda;
    private String tipoSonido;

    /**
     * Constructor de la clase
     * @param tipo
     * @param codigo
     * @param precio
     * @param stock
     * @param material
     * @param nombre
     * @param tipoCuerda
     * @param numeroCuerda
     * @param tipoSonido
     */
    public Cuerda(String tipo, String codigo, int precio, int stock, String material, String nombre, String tipoCuerda, int numeroCuerda, String tipoSonido) {
        super(tipo, codigo, precio, stock, material, nombre);
        this.tipoCuerda = tipoCuerda;
        this.numeroCuerda = numeroCuerda;
        this.tipoSonido = tipoSonido;
    }

    /**
     * get del tipo de cuerda
     * @return
     */
    public String getTipoCuerda() {
        return tipoCuerda;
    }

    /**
     * get del numero de cuerda
     * @return
     */
    public int getNumeroCuerda() {
        return numeroCuerda;
    }

    /**
     * get del tipo de sonido
     * @return
     */
    public String getTipoSonido() {
        return tipoSonido;
    }
}
