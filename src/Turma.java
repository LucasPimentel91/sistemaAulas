import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Turma {
    private String codigo;
    public String nome;
    private ArrayList<Aluno> scanMembro = new ArrayList<>();
    private ArrayList<Quadro> cronograma = new ArrayList<>();


    public String setCodigo(){
        return codigo;
    }

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

    public void listarAlunos(){
        for(int i=0;i<scanMembro.size();i++){
            System.out.println(scanMembro.get(i).nome);
        }
    }
    public void listarNotas(){
        for(int i=0;i<scanMembro.size();i++){
            System.out.println(scanMembro.get(i).nome + "- nota: " + scanMembro.get(i).setNota());
        }
    }

    public void frequenciaAlunos(){
        for(int i=0;i< cronograma.size();i++){
            System.out.println(cronograma.get(i).data + " " + cronograma.get(i).horario);
            for(int a=0;a< scanMembro.size();a++){
                        Scanner ler = new Scanner(System.in);
                        System.out.println(scanMembro.get(i).nome + " presente? (sim/nao)");
                        String resp = ler.nextLine();
                        if(resp == "sim"){
                            scanMembro.get(a).setDiaHora(cronograma.get(i));
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


