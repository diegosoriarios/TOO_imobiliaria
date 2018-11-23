/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vanes
 */
public class Terreno extends Imovel{
    
    public Terreno(double valor, double areaGlobal) {
        super(valor, areaGlobal);
    }

    @Override
    public void valorizar(double metro) {
        valor+=(areaGlobal*metro);
    }
    
}
