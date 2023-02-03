package cuentas;

/**
 * 
 * 
 * @author David Blanco Domínguez.
 *
 */
public class CCuenta {

	
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Constructor vacío.
	 */
	public CCuenta() {
	}
/**
 * Constructor con parámetros.
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * 
	 * 
	 * @return atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *Cambia el valor del atributo nombre.
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * 
	 * @return atributo cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Cambia el valor del atributo cuenta.
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * 
	 * 
	 * 
	 * @return saldo
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Cambia el valor del atributo saldo.
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return  atributo tipoInteres.
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	
	/**
	 * Cambia el valor del atributo tipoInterés.
	 * @param tipoInterés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	/**
	 * Ingresa una cantidad mayor que cero.
	 * @param cantidad
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}
/**
 * Retira el parámetro cantidad de la cuenta si este es válido.
 * @param cantidad
 * @throws Exception
 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
/**
 * Retira una cantidad de 2.300 e ingresa una de 695.
 * @throws Exception
 */
	public void operativa_cuenta() throws Exception {
		double saldoActual;

		saldoActual = this.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			this.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			this.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}

	}
/**
 * Retira el parametro introducido como cantidad y despues lo vuelve a ingresar. 
 * @param cantidad
 * @throws Exception
 */
	public void operativa_cuenta(float cantidad) throws Exception {
		System.out.println("El saldo actual es" + this.estado());

		try {
			this.retirar(cantidad);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			this.ingresar(cantidad);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}

	}
	
	}


