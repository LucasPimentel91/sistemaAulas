public class Aluno {
    public String nome;
    public String matricula;
    private String dataNascimento;
    public boolean presenca;

    public void cadastrar(String nome, String matricula, String data){
        this.nome=nome;
        this.matricula=matricula;
        this.dataNascimento=data;
    }
}

