package modelo;

public class ValorizarImoveis {
    private int cont;

    public double getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void valorizarImoveis(Imovel i){
        cont++;
        if(i instanceof Terreno){
            valor+=(areaGlobal*metro);
        }else instanceof(i instanceof Construido){
            valor+= (areaGlobal*metro)+(areaPrivativa*(metro/2));
        }
    }

    public String getInfo(){
        String aux = "";
        aux += "Quantidade de imoveis valorizados: " + cont;
        return aux;
    }
}
