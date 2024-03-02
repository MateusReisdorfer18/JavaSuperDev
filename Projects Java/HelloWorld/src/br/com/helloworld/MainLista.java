package br.com.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> alunos = new ArrayList<>();
        int indiceAlunoRemover;
        boolean exibir = true;

        alunos.add("Mateus");
        alunos.add("Yasmin");

        do {
            int opcaoEscolhida;
            System.out.println("Selecione uma opcao");
            System.out.println("[1] Exibir Lista\n[2] Novo Aluno\n[3] Remover Aluno\n[4] Alterar Aluno\n[0] Cancelar");
            opcaoEscolhida = scanner.nextInt();

            switch(opcaoEscolhida) {
                case 1:
                    for(int i=0;i<1;i++) {
                        System.out.println("Lista aluno");
                        for(String a:alunos) {
                            System.out.printf("Aluno: %s\n", a);
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    String novoAluno;

                    System.out.println("Digite o nome do Aluno");
                    novoAluno = scanner.next();
                    alunos.add(novoAluno);


                    break;
                case 3:
                    System.out.println("Digite o codigo do aluno que deseja remover");
                    indiceAlunoRemover = scanner.nextInt();

                    if(indiceAlunoRemover > -1 && indiceAlunoRemover < alunos.size()) {
                        alunos.remove(indiceAlunoRemover);
                    } else {
                        System.out.println("Aluno nao encontrado");
                    }

                    break;
                case 4:
                    int indiceAlunoAlterar;
                    String novoNomeAluno;

                    System.out.println("Digite o codigo do aluno que queira alterar");
                    indiceAlunoAlterar = scanner.nextInt();

                    System.out.println("Digite o novo nome do aluno");
                    novoNomeAluno = scanner.next();

                    alunos.set(indiceAlunoAlterar, novoNomeAluno);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    exibir = !exibir;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (exibir);
    }
}
