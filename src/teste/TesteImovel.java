/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.swing.JOptionPane;
import modelo.Construido;
import modelo.Imovel;
import modelo.Proprietario;
import modelo.Terreno;

/**
 *
 * @author vanes
 */
public class TesteImovel {
    public static void main(String[] args) {
//        Imovel i1 = new Imovel(100000, 500);
Construido i1 = new Construido(100000, 500);
        i1.setEndereco("Av. Brasil, 99");
//        i1.setAreaPrivativa(50);
//        i1.setTipo("casa");
        
        Proprietario p1 = new Proprietario("Juka");
        i1.setDono(p1);
        
        JOptionPane.showMessageDialog(null, i1.getInfo());
        
        i1.informarAmpliacao(20, 50000);
        JOptionPane.showMessageDialog(null, i1.getInfo());
        
        Terreno i2 = new Terreno(200000, 500);
//        i2.setDono(new Proprietario("Pedro"));
        i2.setDono(p1);
        //p1.listaImoveis.add(i2);
        //i2.informarBenfeitoria(100000);
        JOptionPane.showMessageDialog(null, i2);
        JOptionPane.showMessageDialog(null, p1.getInfo());
        
        ValorizarImoveis vi = new ValorizarImoveis();
        vi.ValorizarImoveis(i1);
        vi.ValorizarImoveis(i2);
        
        JOptionPane.showMessageDialog(null, i1.getInfo());
        JOptionPane.showMessageDialog(null, i2.getInfo());
        
        JOptionPane.showMessageDialog(null, vi.getInfo());
    }
}
