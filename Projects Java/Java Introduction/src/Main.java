import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] nums = new int[2];
        int result;
        int count = 0;
        Boolean condicao = true;
        String operacao = "";

        while(count < 2) {
            System.out.println("informe o " + (count+1) + "º número");
            nums[count] = scanner.nextInt();
            if(condicao) {
                System.out.println("informe a operação");
                operacao = scanner.next();
                condicao = !condicao;
            }
            count++;
        }

        Operacoes operacoes = new Operacoes();

        operacoes.fazerOperacao(operacao, nums[0], nums[1]);
        System.out.println(nums[0] + " " + operacao + " " + nums[1] + " " + "=" + " " + operacoes.resultado);
    }
}
