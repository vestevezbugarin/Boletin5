package boletin5;

import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {
        Scanner tl = new Scanner(System.in);
        Conta contaActual = new Conta("Ana", "x0121", 1171.97);
        Conta conta2 = new Conta("Xurxo", "x0122", 527.95);

        boolean aceptado;
        int a;

        do {
            System.out.println("\n**************************************************************"
                    + "\n*                          ¡ Benvid@ !                       *"
                    + "\n*          Accedeu ao sistema de telebancos                  *"
                    + "\n**************************************************************"
                    + "\n*                   Introduce a opción desexada:             *"
                    + "\n**************************************************************"
                    + "\n 1.- Ingresar unha cantidade      2.- Retirar unha cantidade "
                    + "\n 3.- Transferencias               4.- Detalles da Conta      "
                    + "\n**************************************************************"
                    + "\n*                       Pulse 0 para sair.                   *");
            a = tl.nextInt();

            switch (a) {
                case 0:
                    System.out.println("Grazas por usar o noso sistemas de telebanco. Adeus");
                    break;
                case 1:
                    aceptado = false;
                    System.out.println("\n*************************************************************"
                            + "\n*                      Sistema de Ingresos                  *"
                            + "\n*************************************************************");
                    while (aceptado) {

                        System.out.println("\nIntroduce cantidade a ingresar:");
                        aceptado = contaActual.ingreso(tl.nextFloat());
                    }
                    break;
                case 2:
                    aceptado = false;
                    System.out.println("\n*************************************************************"
                            + "\n*                    Sistema de Retiradas                   *"
                            + "\n*************************************************************");
                    while (aceptado) {

                        System.out.println("\nIntroduce cantidade a retirar:");
                        aceptado = contaActual.reintegro(tl.nextFloat());
                    }
                    break;
                case 3:
                    aceptado = false;
                    System.out.println("\n*************************************************************"
                            + "\n*                   Sistema de Transferencias               *"
                            + "\n*************************************************************");
                    while (aceptado) {

                        System.out.println("\nIntroduce cantidade a transferir:");
                        aceptado = contaActual.transferencia(conta2, tl.nextFloat());
                    }
                    break;
                case 4:
                    contaActual.visualizar();
                    break;
                default:
                    System.out.println("A opción elixida non está contemplada.");
                    break;
            }
        } while (a != 0);

    }

}
