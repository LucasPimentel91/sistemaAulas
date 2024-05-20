public class Frequencia {
    private Quadro diaHora;
    private Boolean status;

    public void cadastrar(Quadro diaHora){
        this.diaHora = diaHora;
    }
    public void cadastrar(Boolean status){
        this.status = status;
    }

    public Quadro setQuadro(){
        return diaHora;
    }
    public void validarFreq(){
        status = true;
    }
}
