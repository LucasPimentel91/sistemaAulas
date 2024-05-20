import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private String dataNascimento;
    private String turmaMembro;

    Scanner ler = new Scanner(System.in);

    public void cadastrar(String nome, int matricula, String data){
        this.nome=nome;
        this.matricula=matricula;
        this.dataNascimento=data;
    }
    public void cadastrarTurma (String turma){
        this.turmaMembro = turma;
    }

}

