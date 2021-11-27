package elpuig.dam;

public class Casa {

    private String foto;
    private int parenoel, follet, ren;

    public Casa(String foto) {
        this.foto = foto;
        this.parenoel = 0;
        this.follet = 0;
        this.ren = 0;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getParenoel() {
        return parenoel;
    }

    public void setParenoel() {
        this.parenoel++;
    }

    public int getFollet() {
        return follet;
    }

    public void setFollet() {
        this.follet ++;
    }

    public int getRen() {
        return ren;
    }

    public void setRen() {
        this.ren ++;
    }


    @Override
    public String toString() {
        String resultat="";
        if (parenoel>0) resultat+= "Pare Noel ("+parenoel+") ";
        if (ren>0) resultat+= "Ren ("+ren+") ";
        if (follet>0) resultat+= "Follet ("+follet+") ";
        return resultat;
    }

    public void treuElFollet() {

        follet-=parenoel;
    }
}
