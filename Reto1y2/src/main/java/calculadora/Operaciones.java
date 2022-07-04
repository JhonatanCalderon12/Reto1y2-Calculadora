package calculadora;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Operaciones {

    double resultado;
    DecimalFormat formato = new DecimalFormat("#.00");

    public Operaciones() {
    }

    public String suma(double numero1, double numero2) {
        resultado = numero1 + numero2;
        return formato.format(resultado);
    }

    public String resta(double numero1, double numero2) {
        resultado = numero1 - numero2;
        return formato.format(resultado);
    }

    public String multiplicacion(double numero1, double numero2) {
        resultado = numero1 * numero2;
        return formato.format(resultado);
    }

    public String division(double numero1, double numero2) {
        if (numero2 == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0, ingrese otro numero");
            return "NO";
        } else {
            resultado = numero1 / numero2;
        }
        return formato.format(resultado);
    }

    public String potencia(double numero1, double numero2) {
        resultado = Math.pow(numero1, numero2);
        return formato.format(resultado);
    }

    public String raizCuadrada(double numero1) {
        resultado = Math.sqrt(numero1);
        return formato.format(resultado);
    }

    public boolean validarNumerico(String valorIngresado) {

        //123
        //caracter = 1
        boolean esNumero = true;
        char caracter;
        for (int i = 0; i < valorIngresado.length(); i++) {
            caracter = valorIngresado.charAt(i);
            if ((caracter >= 48 && caracter <= 57) || caracter == 45) {
                esNumero = true;
            } else {
                esNumero = false;
                break;
            }
        }
        return esNumero;
    }

    public static void main(String[] args) {
        System.out.println("pruebaasd");

        double ejemplo = 2.4567 + 3.45657;
        DecimalFormat formato = new DecimalFormat("#.00");
        //formato.format(ejemplo);

        System.out.println("resultado = " + formato.format(ejemplo));
    }
}
