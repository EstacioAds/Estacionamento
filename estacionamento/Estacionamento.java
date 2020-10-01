/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author franw
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int alturas[] = {180,170,150,145,192};
       System.out.println(alturas[2]);
       
      Carro ze = new Carro("X054");
      Carro maria = new Carro("TYR8");
      Carro joana = new Carro("DD77");
       
      Carro carros[] = {ze,maria,joana}; 
      System.out.println(carros[0].getPlaca());
      System.out.println(carros[1].getPlaca());
      System.out.println(carros[2].getPlaca());
      
      // Refazer a impressão de placas usando um laço for.
              
    }
    
}

