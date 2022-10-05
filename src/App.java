import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor que ganha por hora: ");
        double vH = sc.nextDouble();

        System.out.print("Informe a quantidade de horas trabalhadas no mes: ");
        double qH = sc.nextDouble();

        sc.close();

        double total = vH * qH;

        System.out.printf("O salario desse mes é: R$%.2f.",total );


    }
}
