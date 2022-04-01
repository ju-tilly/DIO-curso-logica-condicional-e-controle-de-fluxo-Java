package br.com.github.juceduarte.controledefluxo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {

        ifSemFlecha();
        ifMenor();
        swithSemana();
        switchNumero();
        switchFerias();
    }

    private static void ifSemFlecha() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número equivalente ao mês: ");

        int mes = scan.nextInt();

        if(mes == 1){
            System.out.println("Janeiro");
        }else if(mes == 2){
            System.out.println("Fevereiro");
        }else if(mes == 3){
            System.out.println("Março");
        }else if(mes == 4){
            System.out.println("Abril");
        }else if(mes == 5){
            System.out.println("Maio");
        }else if(mes == 6){
            System.out.println("Junho");
        }else if(mes == 7){
            System.out.println("Julho");
        }else if(mes == 8){
            System.out.println("Agosto");
        }else if(mes == 9){
            System.out.println("Setembro");
        }else if(mes == 10){
            System.out.println("Outubro");
        }else if(mes == 11){
            System.out.println("Novembro");
        }else{
            System.out.println("Dezembro");
        }
    }

    private static void ifMenor() {

        double salarioMensal = 10600.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if((salarioBaixo) && (muitosDependentes)) { //usado mais podemos reduzir código ainda mais
                System.out.println("Funcionário deve receber auxílio.");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes); //Boa prática para uso de if-else

        if(recebeAuxilio) {
            System.out.println("Funcionário deve receber auxílio"); //false
        }else{
            System.out.println("Funcionário não deve receber auxílio");
        }
    }

    private static void swithSemana() {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String dia = leitor.next();

        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia indefinido!");
                break;
        }
    }

    private static void switchNumero() {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número para acertar: " );
        int numero = leitor.nextInt();

        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

    private static void switchFerias() {

        String mes = "Dezembro";
        switch (mes){
            case "Dezembro":
            case "Julho":
            case "Janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }
}
