package udla.allanos.excepciones;

import javax.swing.*;

public class Main {
        public static void main(String[] args) {
            //Excepciones lenguajes de programación de alto nivel no se dedican a problemas del sistema
            //La excepciones es a manera de programación o código y solo se dan en tiempo de ejecución
            //Hacer un debug para evitar problemas para codigos pequeños
            //resumen: solo se da en tiempo de ejecución y solo son errores de programación

            //Separar el codigo que gestiona los errores del código principal del programa
            //Nos permita manejar el error y continuar con la ejecución del programa
            //Agrupar y diferenciar entre diferentestipos de errores
            //Propagar errores hacia arriba en la pila de llamadas (StackTrace)

            //Normalmente se aplica un monton la recursividad

            //try es donde se ingresan los datos
            //catch captura los errores (si y solo si se tratan de errores de programación)
            //finally (Es ocpional pero SIEMPRE se ejecuta)

            //NumberFormatException nfe

            //Tipos de excepciones
            //Chequadas: si en el UML dice Exception (Checked) tenemos que controlar
            //No chequeadas: Si dice RuntimeException es opcional controlar (si dice Unchecked en el UML no se tiene que controlar)
            //Si sale Error en un UML es un error del sistema

            Calculadora cal = new Calculadora();
            String valor = JOptionPane.showInputDialog("Ingrese un número: ");
            int denominador = Integer.parseInt(valor);


            try {
                //int division = 10/0;
                //divisor = Integer.parseInt(valor);
                //int division = 10/divisor;
                double division = cal.dividir(10,denominador);
                System.out.println(division);

            }catch (DivisionPorCeroException ae){
                System.out.println("Captura el error en matematico: " /*+ ae.getMessage()*/);
                main(args);
            }
            /*catch (ArithmeticException ae){
                System.out.println("Captura el error en matematico: " + ae.getMessage());
                main(args);
            }catch (NumberFormatException nfe){
                System.out.println("Captura el error de formato" + nfe.getMessage());
                main(args);//Esto llama al main otra vez es como un bucle
            }
            /*finally {
                System.out.println("Es opcional y se ejecuta siempre...");
            }
            System.out.println("Continuamos con el flujo de aplicación ");*/

        }
}

