public class Aluno {
    private String nome;
    private String matricula;
    private String dataNascimento;

    public void cadastrar(String nome, String matricula, String data){
        this.nome=nome;
        this.matricula=matricula;
        this.dataNascimento=data;
    }
}
