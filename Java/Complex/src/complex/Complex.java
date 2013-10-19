/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author alumno
 */
public class Complex {
    private double real;
    private double imaginary;
    
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public double getReal() {
        return this.real;
    }
    
    public void setReal(double real) {
        this.real = real;
    }
    
    public double getImaginary() {
        return this.imaginary;
    }
    
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    
    public Complex getComplex() {
        return new Complex(this.real, this.imaginary);
    }
    
    public void Show() {
        System.out.println("Real: " + real);
        System.out.println("Imaginary: " + imaginary);
    }
    
    public void Sum(Complex b) {
        this.real += b.real;
        this.imaginary += b.imaginary;
    }    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // in Tests
    }
}