import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Turma {
    private String codigo;
    public String nome;
    private ArrayList<Aluno> scanMembro = new ArrayList<>();
    private ArrayList<Quadro> cronograma = new ArrayList<>();


    public void cadastrar(String codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }

    public void cadastrar(Aluno membro){
        scanMembro.add(membro);
    }

    public void cadastrar(Quadro diaHora){
        cronograma.add(diaHora);
    }

    public void setMembroFreq(Frequencia frequencia){
        for(int i=0;i<scanMembro.size();i++){
            scanMembro.get(i).registroDiasHoras(frequencia);
        }
    }

    public void frequenciaAlunos(String data, String hora){
        for(int i=0;i< cronograma.size();i++){
            if(Objects.equals(cronograma.get(i).data, data)){
                if(Objects.equals(cronograma.get(i).horario, hora)){
                    for(int a=0;a< scanMembro.size();a++){
                        Scanner ler = new Scanner(System.in);
                        System.out.println(scanMembro.get(i).nome + " presente? (sim/nao)");
                        String resp = ler.nextLine();
                        if(resp == "sim"){
                            for(int o=0;o< scanMembro.get(i).status)
                        }
                    }
                }
            }
        }
    }

    public void avaliacao(){
        for(int i=0;i<scanMembro.size();i++){
            Scanner ler = new Scanner(System.in);
            System.out.println("Nota de " + scanMembro.get(i).nome + ": ");
            scanMembro.get(i).scanNota(ler.nextInt());

        }
    }

}


