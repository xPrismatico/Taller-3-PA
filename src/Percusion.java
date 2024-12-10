/**
 * Clase Percusion
 */
public class Percusion extends Instrumento {
    private String tipoSonido;
    private String altura;


    /**
     * Constructor utilizado para agregar instrumentos al archivo
     * @param tipo
     * @param codigo
     * @param precio
     * @param stock
     * @param material
     * @param nombre
     * @param tipoSonido
     * @param altura
     */
    public Percusion(String tipo, String codigo, int precio, int stock, String material, String nombre, String tipoSonido, String altura) {
        super(tipo, codigo, precio, stock, material, nombre);
        this.tipoSonido = tipoSonido;
        this.altura = altura;
    }

    /**
     * get del tipo de sonido
     * @return
     */
    public String getTipoSonido() {
        return tipoSonido;
    }

    /**
     * get de la altura del instrumento
     * @return
     */
    public String getAltura() {
        return altura;
    }

}
