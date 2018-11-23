/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        lista.add("Teste");
//        lista.add(7);
//        lista.add(10.4);
//        lista.add(true);
        lista.add("Vanessa");
        lista.add("Maria");
        JOptionPane.showMessageDialog(null, lista);
        
        
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        
        for(String x: lista){
            System.out.println(x);
        }
        
        lista.isEmpty();
    }
}
