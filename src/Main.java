import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;



public class Main {
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

    public static Turma searchTurmas(ArrayList<Turma> arr, String nome) {
        for (Turma turma:arr) {
            if (Objects.equals(turma.nome, nome)) {
                return turma;
            }
        }
        return null;
    }

    public static void listarTurmas(ArrayList<Turma> arr){
        for(Turma turma:arr){
            System.out.println(turma.nome + "- código: " + turma.setCodigo());
        }
    }

    public static void listarAlunos(ArrayList<Turma> arr){
        for(Turma turma:arr){
            System.out.println(turma.nome + ":");
            turma.listarAlunos();
        }
    }

    public static void listarNotas(ArrayList<Turma> arr){
        for(Turma turma:arr){
            System.out.println(turma.nome + ":");
            turma.listarNotas();
        }
    }
        public static void main(String[] args){
        int num=1;
        do{
            if(cabecalho() == 0){
                System.out.println("\n");
                System.out.println("Encerrando o sistema!");
            }else if(cabecalho() == 1){
                if(cabecalhoCadastro() == 1){
                    if(listTurma.isEmpty()){
                        System.out.println("EFETUE O CADASTRADO DE UMA TURMA PARA ADICIONAR ESSE ALUNO.");
                    }else {
                        Scanner ler = new Scanner(System.in);
                        Aluno aluno = new Aluno();
                        System.out.println("Nome completo: ");
                        String nomeTurma = ler.nextLine();
                        System.out.println("Matrícula: (somente número!)");
                        int matricula = ler.nextInt();
                        System.out.println("Data de nascimento: ");
                        String data = ler.nextLine();

                        aluno.cadastrar(nomeTurma, matricula, data);
                        String resp = "s";
                        do {
                            Scanner scan = new Scanner(System.in);
                            System.out.println("Digite o nome da turma: ");
                            String pesquisa = scan.nextLine();
                            searchTurmas(listTurma, pesquisa).cadastrar(aluno);
                            System.out.println("Digite -s- para cadastrar em outra turma: ");
                            resp = scan.nextLine();
                        } while (resp == "s");
                    }
                }
                else if(cabecalhoCadastro() == 2){
                    Scanner ler = new Scanner(System.in);
                    Turma turma = new Turma();
                    System.out.println("Nome da Turma: ");
                    String name = ler.nextLine();
                    System.out.println("Código: ");
                    String code = ler.nextLine();
                    turma.cadastrar(code, name);
                    listTurma.add(turma);
                }
                else if(cabecalhoCadastro() == 3){
                    Scanner ler = new Scanner(System.in);
                    Quadro quadro = new Quadro();
                    Frequencia frequencia = new Frequencia();
                    System.out.println("Data: ");
                    String data = ler.nextLine();
                    System.out.println("Horário: ");
                    String hora = ler.nextLine();
                    quadro.registrar(data, hora);
                    frequencia.cadastrar(quadro);
                    String resp = "s";
                    do{
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Digite o nome da turma desse quadro-horário: ");
                        String nomeTurma = scan.nextLine();
                        searchTurmas(listTurma, nomeTurma).cadastrar(quadro);
                        searchTurmas(listTurma, nomeTurma).setMembroFreq(frequencia);
                        System.out.println("Digite -s- para cadastrar em outra turma: ");
                        resp = scan.nextLine();
                    }while(resp == "s");
                }
            }else if(cabecalho() == 2){
                if(cabecalhoRegistro() == 1){
                    String resp = "s";
                    do{
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Digite o nome da turma desse quadro-horário: ");
                        String nomeTurma = scan.nextLine();
                        searchTurmas(listTurma, nomeTurma).avaliacao();
                        System.out.println("Digite -s- para avaliar outra turma: ");
                        resp = scan.nextLine();
                    }while(resp == "s");

                }
                else if(cabecalhoRegistro() == 2){
                    String resp = "s";
                    do{
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Digite o nome da turma desse quadro-horário: ");
                        String nomeTurma = scan.nextLine();
                        searchTurmas(listTurma, nomeTurma).frequenciaAlunos();
                        System.out.println("Digite -s- para avaliar outra turma: ");
                        resp = scan.nextLine();
                    }while(resp == "s");
                }
            }
            else if(cabecalho() == 3){
                if(cabecalhoListagem() == 1){
                    listarTurmas(listTurma);
                }
                else if(cabecalhoListagem() == 2){
                    listarAlunos(listTurma);
                }
                else if(cabecalhoListagem() == 3){
                    listarNotas(listTurma);
                }else if(cabecalhoListagem() == 4){

                }
            }
        }while(true);

    }
}
