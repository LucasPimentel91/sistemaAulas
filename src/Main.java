public class Main {
    public static void main(String[] args){
        Aluno lucas = new Aluno();
        Turma POO = new Turma();
        Quadro quadro = new Quadro();
        QtdAlunos qtdAlunos = new QtdAlunos();
        lucas.cadastrar("Lucas", "2024116", "02/03/2002");
        POO.cadastar("211", "Programacao Orientada a Objeto");
        quadro.registrar("13/05/2024", "08:00", POO);
        POO.cronograma(quadro);
        POO.alunos(lucas,qtdAlunos);
        quadro.frequencia(POO, lucas,qtdAlunos);

    }
}
