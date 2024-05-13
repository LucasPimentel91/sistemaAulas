import java.util.Scanner;

public class Quadro {
    public String data;
    public String horario;
    public Turma turma;

    public void registrar(String data, String horario, Turma turma){
        this.data=data;
        this.turma=turma;
        this.horario=horario;
    }

    public void frequencia(Turma turma, Aluno aluno){
        for(int i=0;i<turma.qtdAlunos;i++){
            if(turma.membros[i]==aluno.nome){
                System.out.println(aluno.nome + " estava presente no dia " + data + " às " + horario + "?");
                Scanner ler = new Scanner(System.in);
                String resp = ler.nextLine();
                if(resp == "sim"){
                    aluno.presenca = true;
                }else aluno.presenca = false;
            }
        }
    }
}

