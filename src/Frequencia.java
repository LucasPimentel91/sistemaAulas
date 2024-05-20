import java.util.Scanner;

public class Frequencia {
    Scanner ler = new Scanner(System.in);

    private String[] estudantes;
    private String[] turma;
    private String[] frequencia;

    public void registrar(String[] alunos, String[] diaAula){
        String presenca;
        for(String aluno: alunos){
            for(int i=0;i<alunos.length;i++){
                System.out.print(aluno + "estava presente em" + diaAula[i] + "?");
                presenca = ler.nextLine();
                this.frequencia[i] = presenca;
            }
        }
    }
}
