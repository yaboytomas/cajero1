
package cuentas;

public class AppCuentaCorriente {

    public static void main(String[] args) {
        
    //----OBJETOS----//
    CuentaCorriente nuevaCuenta1 = new CuentaCorriente("Tomas",9009009);
    CuentaCorriente nuevaCuenta2 = new CuentaCorriente("Kika", 6006006, 1000000);
   
    //----CODIGO-----//
    System.out.println(nuevaCuenta1);
    System.out.println(nuevaCuenta2);
        System.out.println("");
    
    System.out.println("Nombre del titular: " + nuevaCuenta1.getTitular());
    System.out.println("Numero de cuenta: " + nuevaCuenta1.getNumeroCuenta());
    System.out.println("Saldo de cuenta: $" + nuevaCuenta1.getSaldo());
        System.out.println("");
    
    nuevaCuenta2.setNumeroCuenta(45454545);
        System.out.println("Nuevo numero de cuenta: " + nuevaCuenta2.getNumeroCuenta()); 
    nuevaCuenta2.setSaldo(5000);
        System.out.println("Su nuevo saldo es: $" + nuevaCuenta2.getSaldo());
    nuevaCuenta2.setTitular("Camila");
        System.out.println("El nombre del titular es: " + nuevaCuenta2.getTitular());
        System.out.println("");
    
    nuevaCuenta1.abonar(7500000);
    nuevaCuenta2.abonar(500);
        System.out.println("");
    nuevaCuenta1.abonar(0);
    nuevaCuenta2.abonar(0);
        System.out.println("");
        
    nuevaCuenta1.cargar(50);
    nuevaCuenta2.cargar(75);
        System.out.println("");
    nuevaCuenta1.cargar(10000000);
    nuevaCuenta2.cargar(10000000);
        
        
        
        
        
    }
}
