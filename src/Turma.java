public class Turma {
    private String codigo;
    private String nome;
    private String dataAula;
    private String horaAula;
    public String[] membros;


    public void cadastar(String codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }
    public void cronograma(Quadro dataHora){
        this.dataAula=dataHora.data;
        this.horaAula=dataHora.horario;
    }
    public void alunos(Aluno aluno, QtdAlunos qtdAlunos){
        this.membros[qtdAlunos.qtdAlunos]=aluno.nome;
        qtdAlunos.qtdAlunos=qtdAlunos.aumentar();
    }
}


