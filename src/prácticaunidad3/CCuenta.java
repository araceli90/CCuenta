/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticaunidad3;

/**
 *
 * @author Araceli Rodríguez López
 * @version 1
 */
public class CCuenta {


 /**definición de los atributos de la clase cuenta*/
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Constructor sin argumentos */
    public CCuenta ()
    {
    }
    /** Constructor con todos los argumentos
     * @param nom es el nombre del cliente
     * @param cue es la cuenta del cliente
     * @param sal es el saldo de la cuenta del cliente
     * @param tipo es el tipo de interés de la cuenta
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
   /** Sirve para establecer el nombre del titular de la cuenta bancaria
    * @param nom nombre 
    */
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    /** Sirve para devolver el nombre del titular de la cuenta
     *@return nombre 
     *
     */
    public String getNombre()
    {
        return nombre;
    }

    /** Este método devuelve el saldo de la cuenta bancaria en cada momento
     *@return saldo
     */
     public double getEstado ()
    {
        return getSaldo();
    }

    /** Este método sirve para sumar cantidades en la cuenta, modificando el saldo.
     * Este método va a ser probado con Junit
     * @param cantidad es el importe a ingresar
     * @throws Exception emite un mensaje indicando que no se puede ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /** Este método sirve para restar cantidades de la cuenta bancaria, modificando el saldo total.
     * Este método va a ser probado con Junit
     * @param cantidad retira esta cantidad de la cuenta bancaria
     * @throws Exception emite mensaje de excepción cuando el importe a retirar es inferior al saldo de la cuenta o negativo
     * @see getEstado() 
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /** Este método te devulve la cuenta bancaria 
     * @return cuenta
     */
    public String getCuenta ()
    {
        return cuenta;
    }

    /** Este método estable la cuenta
     * @param cuenta cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Este método devuelve el saldo bancario
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /** Este método establece el saldo bancario
     * @param saldo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** Este método devuelve el tipo de interés
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** Este método establece el tipo de interés
     * @param tipoInterés tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
