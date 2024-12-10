import java.io.IOException;
import java.util.Scanner;
import ucn.ArchivoEntrada;
import ucn.ArchivoSalida;
import ucn.Registro;

/**
 * Clase que implementa al Sistema
 */
public class SistemaImpl implements Sistema {
    private ListaInstrumento instrumentos;

    /**
     * Constructor de la clase
     */
    public SistemaImpl() throws IOException {
        this.instrumentos = new ListaInstrumento(1000);
        menu();
    }

    /**
     * Método para generar un menu para acceder a los métodos y lectura de archivo
     */
    @Override
    public void menu() throws IOException {
        procesarArchivo();
        boolean salir = false;
        while (salir == false) {
            Scanner in = new Scanner(System.in);
            System.out.println("> Bienvenido a la Tienda Beat the Rhythm !");
            System.out.println("Escoge una opción para interactuar con el Sistema");
            System.out.println("/// MENÚ ///");
            System.out.println("1. Agregar Instrumento");
            System.out.println("2. Vender Instrumento");
            System.out.println("3. Consultar Inventario");
            System.out.println("4. Cierre");

            System.out.print("Ingrese una opción: ");
            String opcion = in.nextLine();
            switch (opcion) {
                case "1":
                    agregarInstrumento();
                    break;
                case "2":
                    venderInstrumento();
                    break;
                case "3":
                    consultarInventario();
                    break;
                case "4":
                    cerrar();
                    salir = true;
                    return;
                default:
                    System.out.print("Opción no válida, escoja 1, 2, 3 o 4: ");
                    break;
            }
        }
    }

    /**
     * Metodo que agrega intrumentos nuevos o agrega stock
     */
    @Override
    public void agregarInstrumento() {
        Scanner in = new Scanner(System.in);
        System.out.println("Que tipo de instrumento necesita agregar?: ");
        System.out.println("1. Cuerda");
        System.out.println("2. Percusión");
        System.out.println("3. Viento");
        System.out.println("4. Salir");

        String r = in.nextLine();
        while (r != "4") {
            switch (r) {
                case "1":
                    r = "Cuerda";
                    System.out.print("Que instrumento es? (nombre): ");
                    String r1 = in.nextLine();

                    // Busca en el Contenedor instrumentos el nombre ingresado, si está, solamente se suma +1 en el stock
                    boolean x = true;
                    for (int i = 0; i < instrumentos.getCantidadActual(); i++) {
                        Instrumento instrumento = instrumentos.obtenerInstrumento(i);
                        if (instrumento.getNombre().equalsIgnoreCase(r1)) {
                            instrumento.setStock(instrumento.getStock() + 1);
                            x = false;
                        }
                    }
                    // Si el nombre de instrumento ingrsado no está en el contenedor, te pregunta sus datos
                    // para añadirlo al contenedor
                    if (x == true) {
                        System.out.print("Que tipo de cuerda es? Nylon, Acero o Tripa: ");
                        String r11 = in.nextLine();

                        System.out.print("Cuál es su código?: ");
                        String r12 = in.nextLine();

                        System.out.print("Cual es su precio?: ");
                        int r13 = in.nextInt();

                        System.out.print("Cuántos quiere agregar?: ");
                        int r14 = in.nextInt();

                        System.out.print("Cuántas cuerdas tiene?: ");
                        int r15 = in.nextInt();

                        System.out.print("De qué material es? Madera o Metal: ");
                        String r16 = in.nextLine();

                        System.out.print("Que tipo de sonido tiene? Acústico o Eléctrico: ");
                        String r17 = in.nextLine();
                        Instrumento instrumentoNuevo = new Cuerda(r, r12, r13, r14, r16, r1, r11, r15, r17);
                        this.instrumentos.agregarInstrumento(instrumentoNuevo);
                    }
                    break;

                case "2":
                    r = "Percusión";
                    System.out.print("Que instrumento es? (nombre): ");
                    String r2 = in.nextLine();
                    // Busca en el Contenedor instrumentos el nombre ingresado, si está, solamente se suma +1 en el stoc
                    boolean x2 = true;
                    for (int i = 0; i < instrumentos.getCantidadActual(); i++) {
                        Instrumento instrumento = instrumentos.obtenerInstrumento(i);
                        if (instrumento.getNombre().equalsIgnoreCase(r2)) {
                            instrumento.setStock(instrumento.getStock() + 1);
                            x2 = false;
                        }
                        break;
                    }
                    // Si el nombre de instrumento ingrsado no está en el contenedor, te pregunta sus datos
                    // para añadirlo al contenedor
                    if (x2 == true) {

                        System.out.print("Que tipo de percución es? Membranófono o idiófono: ");
                        String r21 = in.nextLine();

                        System.out.print("Cuál es su código?: ");
                        String r22 = in.nextLine();

                        System.out.print("Cual es su precio?: ");
                        int r23 = in.nextInt();

                        System.out.print("Cuántos quieres agregar?: ");
                        int r24 = in.nextInt();

                        System.out.print("De qué material es? Madera, Metal o Piel: ");
                        String r25 = in.nextLine();

                        System.out.print("Cual es su altura? Definida o Indefinida: ");
                        String r26 = in.nextLine();

                        Instrumento instrumentoNuevo = new Percusion(r, r22, r23, r24, r25, r2, r21, r26);
                        this.instrumentos.agregarInstrumento(instrumentoNuevo);
                    }
                    break;

                case "3":
                    r = "Viento";
                    System.out.print("Que instrumento es? (nombre): ");
                    String r3 = in.nextLine();
                    // Busca en el Contenedor instrumentos el nombre ingresado, si está, solamente se suma +1 en el stock
                    boolean x3 = true;
                    for (int i = 0; i < instrumentos.getCantidadActual(); i++) {
                        Instrumento instrumento = instrumentos.obtenerInstrumento(i);
                        if (instrumento.getNombre().equalsIgnoreCase(r3)) {
                            instrumento.setStock(instrumento.getStock() + 1);
                            x3 = false;
                        }
                        break;
                    }
                    // Si el nombre de instrumento ingrsado no está en el contenedor, te pregunta sus datos
                    // para añadirlo al contenedor
                    if (x3 == true) {

                        System.out.print("Cuál es su código?: ");
                        String r32 = in.nextLine();

                        System.out.print("Cual es su precio?: ");
                        int r33 = in.nextInt();

                        System.out.print("Cuántos quiere agregar?: ");
                        int r34 = in.nextInt();

                        System.out.print("De qué material es? Madera o Metal: ");
                        String r36 = in.nextLine();

                        Instrumento instrumentoNuevo = new Viento(r, r32, r33, r34, r36, r3);
                        this.instrumentos.agregarInstrumento(instrumentoNuevo);
                    }
                    break;
                case "4":
                    return;
                default:
                    System.out.print("Opción no valida, escoja 1, 2, 3 o 4: ");

                    break;
            }
            //repite el menu por si requiere añadr mas instrumentos
            System.out.print("Que tipo de instrumento necesita agregar? (Escribe 4 para salir): ");
            r = in.nextLine();
        }
    }

    /**
     * Metodo que vende un Instrumento reduciendo stock y genera boleta
     */
    @Override
    public void venderInstrumento() {
        // Vendes 1 instrumento al ingresar el codigo de dicho instrumento restandole 1 al stock
        int operacion = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("\nIngrese el Código del Instrumento que quiere vender:");
        String v = in.nextLine();
        for (int i = 0; i < instrumentos.getCantidadActual(); i++) {
            Instrumento instrumento = instrumentos.obtenerInstrumento(i);
            // Al vender generar una boleta con el Instrumento Vendido, Precio, Codigo y un Numero de Operacion
            if (instrumento.getCodigo().equalsIgnoreCase(v) && instrumento.getStock() > 0) {
                instrumento.setStock(instrumento.getStock() - 1);
                System.out.println("Instrumento vendido!\n");
                operacion++;
                generarBoleta(operacion,instrumento.getNombre(),instrumento.getPrecio(),instrumento.getCodigo());
            }
            // Si no hay stock (stock <= 0) envia un mensaje indicando que se agotó
            if (instrumento.getCodigo().equalsIgnoreCase(v) && instrumento.getStock() <= 0) {
                System.out.println("Instrumento Agotado! (No hay stock disponible)\n");
            }
        }
    }

    /**
     * Metodo que muestra los instrumentos por tipo o por codigo unico
     */
    @Override
    public void consultarInventario() {
        boolean salir = false;
        while (salir == false) {
            Scanner in = new Scanner(System.in);
            System.out.println("\nCómo quieres buscar instrumentos?: ");
            System.out.println("1. Por Tipo");
            System.out.println("2. Por Código único");
            System.out.println("3. Salir");
            String b = in.nextLine();
            switch (b) {

                // POR TIPO:
                case "1":
                    // Imprime todos los instrumentos que hay en cada tipo con sus datos
                    // Sólo se muestran los instrumentos que tienen stock disponible
                    for (int i = 0; i < instrumentos.getCantidadActual(); i++) {
                        Instrumento instrumentoConsultar = instrumentos.obtenerInstrumento(i);
                        if (instrumentoConsultar.getTipo().equalsIgnoreCase("Cuerda") && instrumentoConsultar.getStock() > 0) {
                            System.out.println("\n---Instrumento Tipo Cuerda---");
                            System.out.println("Código: " + instrumentoConsultar.getCodigo());
                            System.out.println("Precio: " + instrumentoConsultar.getPrecio());
                            System.out.println("Instrumento: " + instrumentoConsultar.getNombre());
                            System.out.println("Tipo de cuerda: " + ((Cuerda) instrumentoConsultar).getTipoCuerda());
                            System.out.println("Numero de cuerdas: " + ((Cuerda) instrumentoConsultar).getNumeroCuerda());
                            System.out.println("Material de construcción: " + instrumentoConsultar.getMaterial());
                            System.out.println("Tipo de Sonido: " + ((Cuerda) instrumentoConsultar).getTipoSonido());
                        }
                    }
                    for (int i = 0; i < instrumentos.getCantidadActual(); i++) {
                        Instrumento instrumentoConsultar = instrumentos.obtenerInstrumento(i);
                        if (instrumentoConsultar.getTipo().equalsIgnoreCase("Percusión") && instrumentoConsultar.getStock() > 0) {
                            System.out.println("\n---Instrumento Tipo Percusión---");
                            System.out.println("Código: " + instrumentoConsultar.getCodigo());
                            System.out.println("Precio: " + instrumentoConsultar.getPrecio());
                            System.out.println("Instrumento: " + instrumentoConsultar.getNombre());
                            System.out.println("Tipo de Sonido: " + ((Percusion) instrumentoConsultar).getTipoSonido());
                            System.out.println("Material de construcción: " + instrumentoConsultar.getMaterial());
                            System.out.println("Altura: " + ((Percusion) instrumentoConsultar).getAltura());
                        }
                    }
                    for (int i = 0; i < instrumentos.getCantidadActual(); i++) {
                        Instrumento instrumentoConsultar = instrumentos.obtenerInstrumento(i);
                        if (instrumentoConsultar.getTipo().equalsIgnoreCase("Viento") && instrumentoConsultar.getStock() > 0) {
                            System.out.println("\n---Instrumento Tipo Viento---");
                            System.out.println("Código: " + instrumentoConsultar.getCodigo());
                            System.out.println("Precio: " + instrumentoConsultar.getPrecio());
                            System.out.println("Instrumento: " + instrumentoConsultar.getNombre());
                            System.out.println("Material de construcción: " + instrumentoConsultar.getMaterial());
                        }
                    }
                    break;

                // POR CÓDIGO:
                case "2":
                    // Imprime el instrumento con sus datos que corresponde con el codigo ingresado
                    // Sólo se muestran los datos del instrumento si tiene stock disponible y el codigo existe
                    System.out.println("Ingrese el Código para buscar el instrumento:");
                    String c = in.nextLine();
                    for (int i = 0; i < instrumentos.getCantidadActual(); i++) {
                        Instrumento instrumentoCodigo = instrumentos.obtenerInstrumento(i);
                        if (instrumentoCodigo.getCodigo().equalsIgnoreCase(c) && instrumentoCodigo.getStock() > 0) {
                            System.out.println("\n---Instrumento de " + instrumentoCodigo.getTipo() + "---");
                            System.out.println("Código: " + instrumentoCodigo.getCodigo());
                            System.out.println("Stock: " + instrumentoCodigo.getStock());
                            System.out.println("Precio: " + instrumentoCodigo.getPrecio());
                            System.out.println("Material de construcción: " + instrumentoCodigo.getMaterial());
                            System.out.println("Instrumento: " + instrumentoCodigo.getNombre());

                            if (instrumentoCodigo.getTipo().equalsIgnoreCase("Cuerda")) {
                                System.out.println("Tipo de cuerda: " + ((Cuerda) instrumentoCodigo).getTipoCuerda());
                                System.out.println("Numero de cuerdas: " + ((Cuerda) instrumentoCodigo).getNumeroCuerda());
                                System.out.println("Tipo de Sonido: " + ((Cuerda) instrumentoCodigo).getTipoSonido());
                            }
                            if (instrumentoCodigo.getTipo().equalsIgnoreCase("Percusión")) {
                                System.out.println("Tipo de Sonido: " + ((Percusion) instrumentoCodigo).getTipoSonido());
                                System.out.println("Altura: " + ((Percusion) instrumentoCodigo).getAltura());
                            }
                        } else if (instrumentoCodigo.getCodigo().equalsIgnoreCase(c) && instrumentoCodigo.getStock() <= 0) {
                            System.out.println("\nNo hay stock de este instrumento.");
                        }
                    }
                    break;
                case "3":
                    salir = true;
                    return;

                default:
                    System.out.println("\nOpcion no valida, escoja 1, 2 o 3");
                    break;
            }
        }
    }
    /**
     * Metodo que guarda las modificaciones hechas al archivo csv y luego cierra el programa
     * @throws IOException
     */
    @Override
    public void cerrar() throws IOException {
        System.out.println("Cerrando archivo...");
        ArchivoSalida archivo = new ArchivoSalida("instumentos.csv");
        int numero = 0;
        boolean titulo = true;
        for (int i = -1; i < instrumentos.getCantidadActual(); i++) {
            // Hago una referencia al instrumento para obtener la posicion
            Instrumento instrumentoSalida = instrumentos.obtenerInstrumento(i);
            Registro linea = new Registro(instrumentos.getCantidadActual() + 1);
            // genera las categorias del archivo escritas
            if (titulo == true) {
                linea.agregarCampo("");
                linea.agregarCampo("codigo_ean");
                linea.agregarCampo("precio");
                linea.agregarCampo("stock");
                linea.agregarCampo("tipo");
                linea.agregarCampo("instrumento");
                linea.agregarCampo("tipo_cuerda");
                linea.agregarCampo("numero_cuerdas");
                linea.agregarCampo("material");
                linea.agregarCampo("tipo_sonido");
                linea.agregarCampo("altura");
                titulo = false;
                archivo.writeRegistro(linea);
                continue;
            }
            linea.agregarCampo(numero);
            linea.agregarCampo(instrumentoSalida.getCodigo());
            linea.agregarCampo(instrumentoSalida.getPrecio());
            linea.agregarCampo(instrumentoSalida.getStock());
            linea.agregarCampo(instrumentoSalida.getTipo());
            if (instrumentoSalida.getTipo().equalsIgnoreCase("Cuerda")) {
                linea.agregarCampo(instrumentoSalida.getNombre());
                linea.agregarCampo(((Cuerda) instrumentoSalida).getTipoCuerda());
                linea.agregarCampo(((Cuerda) instrumentoSalida).getNumeroCuerda());
                linea.agregarCampo(instrumentoSalida.getMaterial());
                linea.agregarCampo(((Cuerda) instrumentoSalida).getTipoSonido());
                linea.agregarCampo("null");
            }
            if (instrumentoSalida.getTipo().equalsIgnoreCase("Percusión")) {
                linea.agregarCampo(instrumentoSalida.getNombre());
                linea.agregarCampo("null");
                linea.agregarCampo("null");
                linea.agregarCampo(instrumentoSalida.getMaterial());
                linea.agregarCampo(((Percusion) instrumentoSalida).getTipoSonido());
                linea.agregarCampo(((Percusion) instrumentoSalida).getAltura());
            }

            if (instrumentoSalida.getTipo().equalsIgnoreCase("Viento")) {
                linea.agregarCampo(instrumentoSalida.getNombre());
                linea.agregarCampo("null");
                linea.agregarCampo("null");
                linea.agregarCampo(instrumentoSalida.getMaterial());
                linea.agregarCampo("null");
                linea.agregarCampo("null");
            }
            numero++;
            archivo.writeRegistro(linea);
        }
        System.out.println("Cambios guardados en archivo.");
    }

    /**
     * Metodo para generar una boleta
     * @param operacion
     * @param nombre instrumento
     * @param precio del instumento
     * @param codigo del instrumeneto vendido
     */
    public void generarBoleta(int operacion, String nombre, int precio, String codigo) {
        System.out.println("._________________________________________.");
        System.out.println("| << Tienda: Beath the Rhythm >>          |");
        System.out.println("| << COMPROBANTE DE VENTA >>              |");
        System.out.println("|                                         |");
        System.out.println("| > Codigo Producto: "+ codigo);
        System.out.println("| > Instrumento vendido: "+ nombre);
        System.out.println("| > Precio: $"+ precio);
        System.out.println("|                                         |");
        System.out.println("| █|█||███|██|||██ █|█ █| █ ");
        System.out.println("| NUMERO DE OPERACION: 00"+ operacion);
        System.out.println("| << Tienda: Beath the Rhythm >>          |");
        System.out.println("|_________________________________________|\n");
    }


    /**
     * Lectura de archivo .csv
     */
    public void procesarArchivo() {
        ArchivoEntrada archivo;
        //variable para que se salte la primera linea (categorias)
        boolean salto = false;
        try {
            archivo = new ArchivoEntrada("instumentos.csv");
        } catch (Exception ignored) {
            return;
        }

        while (!archivo.isEndFile()) {
            Registro linea;
            //variables del archivo declaradas
            String numero;
            String codigo;
            String precio;
            String stock;
            String tipoInstrumento; // Clases: Cuerda, Percusion, Viento
            String nombre; // Nombre de Instrumento

            String tipoCuerda; // Cuerda
            String numeroCuerda; // Cuerda

            String material;

            String tipoSonido; // Cuerda y Percusion
            String altura; // Percusion

            try {
                linea = archivo.getRegistro();

                while (salto == true) {
                    // asignar a las variables un valor en base a la linea del csv que se encuentre
                    numero = linea.getString();
                    codigo = linea.getString();
                    precio = linea.getString();
                    stock = linea.getString();
                    tipoInstrumento = linea.getString(); // Que Clase es

                    nombre = linea.getString();

                    tipoCuerda = linea.getString();
                    numeroCuerda = linea.getString();

                    material = linea.getString();

                    tipoSonido = linea.getString();
                    altura = linea.getString();

                    //si en el archivo detecta que el tipo de instumento es percusión y lo agrega a la lista instrumento
                    if (tipoInstrumento.equalsIgnoreCase("Percusión")) {
                        Instrumento instrumento = new Percusion(tipoInstrumento, codigo, Integer.parseInt(precio), Integer.parseInt(stock), material, nombre, tipoSonido, altura);
                        this.instrumentos.agregarInstrumento(instrumento);
                    }
                    //si en el archivo detecta que el tipo de instumento es viento y lo agrega a la lista instrumento
                    if (tipoInstrumento.equalsIgnoreCase("Viento")) {
                        Instrumento instrumento = new Viento(tipoInstrumento, codigo, Integer.parseInt(precio), Integer.parseInt(stock), material, nombre);
                        this.instrumentos.agregarInstrumento(instrumento);
                    }
                    //si en el archivo detecta que el tipo de instumento es cuerda y lo agrega a la lista instrumento
                    if (tipoInstrumento.equalsIgnoreCase("Cuerda")) {
                        Instrumento instrumento = new Cuerda(tipoInstrumento, codigo, Integer.parseInt(precio), Integer.parseInt(stock), material, nombre, tipoCuerda, Integer.parseInt(numeroCuerda), tipoSonido);
                        this.instrumentos.agregarInstrumento(instrumento);
                    }
                    break;
                }
                salto = true;

            } catch (Exception ignored) {
                continue;
            }
        }
        archivo.close();
    }
}
