
package cuentas;


public class CuentaCorriente {
    
    //---------------ATRIBUTOS---------------//
    
    public String titular;
    private int numeroCuenta;
    private int saldo;
    
    //----------------METODOS----------------//

    // constructor sin saldo 
    public CuentaCorriente(String titular, int numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    // constructor con saldo 
    public CuentaCorriente(String titular, int numeroCuenta, int saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // get n set todo atributos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    //tostring sobrecarga
    @Override
    public String toString() {
        return "CuentaCorriente{" + "titular=" + titular + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }
    
    // abonar
    public void abonar(int abono) {
        if (abono <= 0) {
            System.out.println("ERROR 876-12.A: Debe ingresar un monto mayor a $0 para abonar en su cuenta, intente nuevamente.");
    
        } else {
            saldo = saldo + abono;
            System.out.println("Se abono: $" + abono + ", su saldo actual ahora es: $" + saldo);
            }
    }
    
    //cargar
    public void cargar(int carga) {
        saldo = saldo - carga;
        if (saldo <= 0) {
            saldo = 0;
            System.out.println("Se cargo un monto de: $" + carga);
            System.out.println("ERROR 8777-13.B: El cargo supera el balance de cuenta, su nuevo saldo es: $" + saldo);
        } else {
            System.out.println("Se cargo un monto de: $" + carga + ", Su nuevo saldo es: $" + saldo);
        }
            
    }
    
}
