import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    static ArrayList<Aluno> listAluno = new ArrayList<>();
    static ArrayList<Turma> listTurma = new ArrayList<>();

    private static int cabecalho(){
        Scanner ler = new Scanner(System.in);
        System.out.println("-".repeat(40));
        System.out.println("-".repeat(10));
        System.out.print("SystemClock");
        System.out.print("-".repeat(10));
        System.out.println("-".repeat(40));
        System.out.println("\n");
        System.out.println("-".repeat(40));
        System.out.println("0. Sair");
        System.out.println("1. Cadastros");
        System.out.println("2. Registros");
        System.out.println("3. listagem");
        System.out.println("-".repeat(40));
        return ler.nextInt();
    }

    private static int cabecalhoCadastro(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("-".repeat(40));
        System.out.println("1. Aluno");
        System.out.println("2. Turma");
        System.out.println("3. Escala data e horário");
        System.out.println("-".repeat(40));
        return ler.nextInt();
    }

    private static int cabecalhoRegistro(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("-".repeat(40));
        System.out.println("1. Registrar notas");
        System.out.println("2. Registrar presenças");
        System.out.println("-".repeat(40));
        return ler.nextInt();
    }

    private static int cabecalhoListagem(){
        Scanner ler = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("-".repeat(40));
        System.out.println("1. Listar turmas");
        System.out.println("2. Listar alunos por turma");
        System.out.println("3. Listar notas de alunos por turma");
        System.out.println("4. Listar frequencia de alunos por turma");
        System.out.println("-".repeat(40));
        return ler.nextInt();
    }

    public static void listarTurmas(){
        for
    }

    public static void main(String[] args){
        int num=1;
        do{
            if(cabecalho() == 0){
                System.out.println("\n");
                System.out.println("Encerrando o sistema!");
            }else if(cabecalho() == 1){
                if(cabecalhoCadastro() == 1){
                    Scanner ler = new Scanner(System.in);
                    Aluno aluno = new Aluno();
                    System.out.println("Nome completo: ");
                    String nome = ler.nextLine();
                    System.out.println("Matrícula: (somente número!)");
                    int matricula = ler.nextInt();
                    System.out.println("Data de nascimento: ");
                    String data = ler.nextLine();
                    aluno.cadastrar(nome, matricula, data);
                    listAluno.add(aluno);
                }
                else if(cabecalhoCadastro() == 2){
                    Scanner ler = new Scanner(System.in);
                    Turma turma = new Turma();
                    System.out.println("Nome da Turma: ");
                    String nome = ler.nextLine();
                    System.out.println("Código: ");
                    String code = ler.nextLine();
                    turma.cadastrar(code, nome);
                }
                else if(cabecalhoCadastro() == 3){
                    Scanner ler = new Scanner(System.in);
                    Quadro dataHora = new Quadro();
                    System.out.println("Data: ");
                    String data = ler.nextLine();
                    System.out.println("Horário: ");
                    String hora = ler.nextLine();
                    System.out.println("Nome da Turma: ");
                    String turma = ler.nextLine();
                    dataHora.registrar(data, hora, turma);
                    String resp = "s";
                }
            }else if(cabecalho() == 2){
                if(cabecalhoRegistro() == 1){
                    Scanner resposta = new Scanner(System.in);
                    System.out.println("Qual data da aula: ");
                    String data = resposta.nextLine();
                    System.out.println("Qual horário: ");
                    String hora = resposta.nextLine();

                }
                else if(cabecalhoRegistro() == 2){

                }
            }
            else if(cabecalho() == 3){
                if(cabecalhoListagem() == 1){

                }
                else if(cabecalhoListagem() == 2){

                }
                else if(cabecalhoListagem() == 3){

                }else if(cabecalhoListagem() == 4){

                }
            }
        }while(num != 0);

    }
}
