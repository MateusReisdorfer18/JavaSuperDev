import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();
        int numContinuar;
        boolean continuar = true;

        do {
            System.out.println("Deseja adicionar um novo aluno?\n* Digite 1 para continuar ou 2 para sair *");
            numContinuar = scanner.nextInt();

            if(numContinuar == 1) {
                String nomeAluno;
                int nota;
                int codigoSala;

                System.out.println("Digite o nome do Aluno");
                nomeAluno = scanner.next();
                System.out.println("Digite a nota do Aluno");
                nota = scanner.nextInt();
                System.out.println("Digite o codigo da sala do Aluno");
                codigoSala = scanner.nextInt();

                Aluno aluno = new Aluno(nomeAluno, nota, codigoSala);
                alunos.add(aluno);
            } else if (numContinuar == 2) {
                continuar = !continuar;
            } else {
                System.out.println("Número não reconhecido");
            }
        } while (continuar);

        for(Aluno a:alunos) {
            System.out.println(a.getNome());
        }
    }
}