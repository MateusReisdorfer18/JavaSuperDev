public class Operacoes {
    int resultado;
    private void somar(int num1,int num2) {
        resultado = num1 + num2;
    };

    private void subtrair(int num1, int num2) {
        resultado = num1 - num2;
    }

    private void multiplicar(int num1, int num2) {
        resultado = num1 * num2;
    }

    private void dividir(int num1, int num2) {
        resultado = num1 / num2;
    }
    public void fazerOperacao(String op, int num1, int num2) {
        switch (op) {
            case "+":
                this.somar(num1, num2);
                break;
            case "-":
                this.subtrair(num1, num2);
                break;
            case "x":
                this.multiplicar(num1, num2);
                break;
            case "/":
                this.dividir(num1, num2);
                break;
            default:
                break;
        }
    }
}
