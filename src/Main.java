import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem-vindo! Vamos calcular.");
        secondMethod(scan);
    }

    private static double soma(double op1, double op2)
    {
        double soma = op1 + op2;
        return soma;
    }

    private static double subtracao(double op1, double op2)
    {
        double subtracao = op1 - op2;
        return subtracao;
    }

    private static double multiplicacao(double op1, double op2)
    {
        double multiplicacao = op1 * op2;
        return multiplicacao;
    }

    private static double divisao(double op1, double op2)
    {
        double divisao = op1 / op2;
        return divisao;
    }
    private static void
    secondMethod(Scanner scan) {
        System.out.print("Digite o operador: ");
        double op1 = scan.nextDouble();

        System.out.print("Digite o segundo operador: ");
        double op2 = scan.nextDouble();

        int opcao = 0;
        do{
            System.out.println("(1)Soma");
            System.out.println("(2)Subtração");
            System.out.println("(3)Multiplicação");
            System.out.println("(4)Divisão");
            System.out.print("Digite a operação: ");
            opcao = scan.nextInt();
            if(opcao < 1 || opcao > 4)
            {
                System.out.println("Opção invalida. Tente novamente");
            }
        }while(opcao < 1 || opcao > 4);

        double resultado = 0;
        if(opcao == 1)
        {
            resultado = soma(op1, op2);
            System.out.println(op1+" + "+op2+" = "+resultado);
        }else if(opcao == 2)
        {
            resultado = subtracao(op1, op2);
            System.out.println(op1+" - "+op2+" = "+resultado);
        }else if(opcao == 3)
        {
            resultado = multiplicacao(op1, op2);
            System.out.println(op1+" * "+op2+" = "+resultado);
        }else if(opcao == 4) {
            resultado = divisao(op1, op2);
            System.out.println(op1 + " / " + op2 + " = "+resultado);
        }
        secondMethod(scan);
    }
}