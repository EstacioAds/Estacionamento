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
        // TODO code application logic here
        Carro carroZe = new Carro("FRR555","C4", "Prata");
        carroZe.setPlaca("FRR777");
        
        System.out.println("PLACA:" +carroZe.getPlaca());
        
        Carro carroMaria = new Carro("iiiii7", "Golf", "Vermelho");
        
        System.out.println("PLACA:" + carroMaria.getPlaca());
        
        System.out.println("Total Carros: " + Carro.getTotalCarros());
              
    }
    
}

