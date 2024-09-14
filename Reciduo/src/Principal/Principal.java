/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import clases.Empresa;
import java.util.*;

/**
 *
 * @author Clara Isabel Initola
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String entrada;
        String entrada2;
        System.out.println("hola mundo");
        System.out.println("Ingresa el nombre de tu empresa");
        entrada = leer.nextLine();
        System.out.println("Ingresa direccion de la empresa");
        entrada2 = leer.nextLine();
        Empresa mEmpresa = new Empresa (entrada,entrada2);
        mEmpresa.mostrarInformacion();
    }
    
}
