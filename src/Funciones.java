import java.util.Scanner;

/**
 * funciones utilizadas en la clase Main
 * @author dam1
 * @version v1.0
 */
public class Funciones{
    /**
     * Comprueba si el suledo esta entre 1000 y 1750
     * @param sueldo del trabajador
     * @return si esta dentro del rango
     */
    public static Boolean obtenerSueldo1750(Double sueldo){
        if (sueldo>1000 && sueldo<1759){
            return true;
        }
        return false;
    }

    /**
     * Comprueba si el sueldo es menor que 1000
     * @param sueldo del trabajador
     * @return si es menor que 1000
     */
    public static Boolean obtenerSueldo1000(Double sueldo){
        if(sueldo>0 && sueldo<1000){
            return true;
        }
        return false;
    }

    /**
     * Alta de trabajador
     * @return Alta de trabajador
     */
    public static Trabajador darAltaTrabajador(){
        Trabajador obxTrabajador = new Trabajador();
        //obxTrabajador.setNombre("Pepe");
        //obxTrabajador.setSueldo(1200d);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre?");
        obxTrabajador.setNombre(sc.nextLine());
        System.out.println("Sueldo?");
        obxTrabajador.setSueldo(sc.nextDouble());

        return obxTrabajador;
    }
}
