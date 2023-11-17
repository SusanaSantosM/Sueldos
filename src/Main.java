
public class Main {
    /**
     * Numero de trabajadores con sueldo entre 1000 y 1750
     */
    static Integer  contador1750 =0;
    /**
     * Numero de trabajadores con sueldo menor de 1000
     */
    static Integer contador1000 =0;
    static Integer contadorMas1750 =0;

    /**
     * Aumenta contador según rango del sueldo del trabajador.
     * @param args no recibe parametros
     */
    public static void main(String[] args) {
        Trabajador auxTrabajador;
        //Funciones obxFunciones = new Funciones();
        do{
            auxTrabajador = Funciones.darAltaTrabajador();
            actualizarcontadores(auxTrabajador);
        } while(auxTrabajador.getSueldo() !=0);

        mostrarContadores();
    }

    /**
     * Aumenta contadores según rango
     */
    public static void actualizarcontadores(Trabajador auxTrabajador){
        if(Funciones.obtenerSueldo1750(auxTrabajador.getSueldo())){
            contador1750++;
        }
        else if (Funciones.obtenerSueldo1000(auxTrabajador.getSueldo())) {
            contador1000++;
        }
    }

    public static void mostrarContadores(){
        System.out.println("Entre 1000-1750: " + contador1750 +"\nMenos de 1000:" +contador1000);
    }
}