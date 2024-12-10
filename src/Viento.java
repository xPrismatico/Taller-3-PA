/**
 * Clase Viento
 */

public class Viento extends Instrumento{

    /**
     * Constructor de la clase
     * @param tipo
     * @param codigo
     * @param precio
     * @param stock
     * @param material
     * @param nombre
     */
    public Viento(String tipo, String codigo, int precio, int stock, String material, String nombre) {
        super(tipo, codigo, precio, stock, material, nombre);
    }
}
