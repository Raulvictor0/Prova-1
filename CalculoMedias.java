import java.util.Scanner;

public class CalculoMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada das notas bimestrais
        System.out.print("Digite a nota do 1º Bimestre: ");
        double b1 = sc.nextDouble();

        System.out.print("Digite a nota do 2º Bimestre: ");
        double b2 = sc.nextDouble();

        System.out.print("Digite a nota do 3º Bimestre: ");
        double b3 = sc.nextDouble();

        System.out.print("Digite a nota do 4º Bimestre: ");
        double b4 = sc.nextDouble();

        // Cálculo das médias
        double semestre1 = (b1 + b2) / 2.0;
        double semestre2 = (b3 + b4) / 2.0;
        double mediaFinal = (semestre1 + semestre2) / 2.0;

        // Saída formatada
        System.out.println("\nRESULTADOS:");
        System.out.printf("1º Bimestre: %.1f\n", b1);
        System.out.printf("2º Bimestre: %.1f\n", b2);
        System.out.printf("1º Semestre: %.1f\n", semestre1);

        System.out.printf("3º Bimestre: %.1f\n", b3);
        System.out.printf("4º Bimestre: %.1f\n", b4);
        System.out.printf("2º Semestre: %.1f\n", semestre2);

        System.out.printf("Média Final: %.1f\n", mediaFinal);

        sc.close();
    }
}