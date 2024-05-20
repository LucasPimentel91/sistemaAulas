import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    public String nome;
    private int matricula;
    private String dataNascimento;
    private int nota;
    private ArrayList<Frequencia> statusPresenca = new ArrayList<>();

    Scanner ler = new Scanner(System.in);

    public void cadastrar(String nome, int matricula, String data){
        this.nome=nome;
        this.matricula=matricula;
        this.dataNascimento=data;
    }
    public void registroDiasHoras(Frequencia frequencia){
        statusPresenca.add(frequencia);
    }

    public void scanNota(int nota){
        this.nota = nota;
    }

    public Frequencia setDiaHora(String data, String hora){
        for(int a=0;a<statusPresenca.size();a++){
            if
        }
    }

}

