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
public class Construido extends Imovel{
    private double areaPrivativa;
    private int quartos;
    private int boxGaragem;
    private String tipo;

    public Construido(double valor, double areaGlobal) {
        super(valor, areaGlobal);
    }
    public Construido(double valor, double areaGlobal, double areaP, String tipo) {
        super(valor, areaGlobal);
        areaPrivativa = areaP;
        this.tipo = tipo;
    }
    
    public double getAreaPrivativa() {
        return areaPrivativa;
    }

    public void setAreaPrivativa(double areaPrivativa) {
        this.areaPrivativa = areaPrivativa;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBoxGaragem() {
        return boxGaragem;
    }

    public void setBoxGaragem(int boxGaragem) {
        this.boxGaragem = boxGaragem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Demais métodos
    public void informarAmpliacao(double m, double valor){
        areaPrivativa += m;
        //informarBenfeitoria(v);
        super.valor += (valor*0.7);
    }
    public void informarBenfeitoria(double v){
        valor += (v*0.7);
    }
    

    @Override
    public String getInfo() {
        String aux = super.getInfo();
       if(areaPrivativa != 0)
           aux += "\nÁrea Privativa: "+areaPrivativa+" m²";
       if(boxGaragem != 0)
           aux += "\nBox de Garagem: "+boxGaragem;
       if(quartos != 0)
           aux += "\nQuantidade de Quartos: "+quartos;
       if(tipo != null)
           aux += "\nTipo: "+tipo;
       
       return aux;
    }

    @Override
    public void valorizar(double metro) {
        valor+= (areaGlobal*metro)+(areaPrivativa*(metro/2));
    }
    
    
    
    
}
