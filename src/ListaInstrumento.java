public class ListaInstrumento {
    private int cantidadMaxima;
    private int cantidadActual;
    private Instrumento[] listaInstrumento;

    /**
     * Constructor de ListaInstrumento
     * @param cantidadMaxima
     */
    public ListaInstrumento(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 0;
        this.listaInstrumento = new Instrumento[cantidadMaxima];
    }

    /**
     * get de la cantidad Maxima
     * @return
     */
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     * get de la cantidad Actual
     * @return
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    public void agregarInstrumento(Instrumento instrumento){
        if (this.cantidadActual >= this.cantidadMaxima) {
            System.out.println("No se puede agregar");
            return;
        }
        this.listaInstrumento[this.cantidadActual] = instrumento;
        this.cantidadActual++;
    }

    /**
     * Metodo para obtener poscicion
     * @param posicion
     * @return
     */
    public Instrumento obtenerInstrumento(int posicion){
        if (posicion < 0 || posicion >= this.cantidadActual) {
            return null;
        }
        return this.listaInstrumento[posicion];
    }


}
