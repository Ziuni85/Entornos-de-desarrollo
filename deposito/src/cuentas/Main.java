package cuentas;

/**
 * @author david
 *
 */
public class Main {


    public static void main(String[] args) throws Exception {
    	//Se crea el objeto cuenta1 al que hemos refactorizado (antes miCuenta)
        CCuenta cuenta1;
        //Construimos el objeto con un constructor con paso de parámetros para inicializar los atributos
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        //Llamamos al método operativa_cuenta que engloba las líneas de código mas abajo comentadas al final de la clase main
        cuenta1.operativa_cuenta();
      //Llamamos al método operativa_cuenta con parametro cantidad que engloba las líneas de código mas abajo comentadas al final de la clase main
        cuenta1.operativa_cuenta(500);
        System.out.print( cuenta1.estado());
        
          
        //CODIGO ANTIGUO COMENTADO
        //Cambio hecho para realizar el commit.
//        double saldoActual;
//
//       
//        saldoActual = cuenta1.estado();
//        System.out.println("El saldo actual es"+ saldoActual );
//
//        try {
//            cuenta1.retirar(2300);
//        } catch (Exception e) {
//            System.out.print("Fallo al retirar");
//        }
//        try {
//            System.out.println("Ingreso en cuenta");
//            cuenta1.ingresar(695);
//        } catch (Exception e) {
//            System.out.print("Fallo al ingresar");
//        }
    }
}
