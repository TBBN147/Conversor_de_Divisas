import Divisas.Consulta;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Variables
        Scanner lectura = new Scanner(System.in);
        int opcion = 0 ;
        Consulta consulta = new Consulta();
//        System.out.println(consulta.consultaDelCliente("USD", "HNL", 56.00));
        //Captura

        String menu = """
                *****************************************
                Sea Bienvenido/a al Conversor de Divisas,
                Seleccione una opción. \n
                1)Dólar =>> Peso Argentino
                2)Peso Argentino =>> Dólar
                3)Dólar =>> Real Brasileño
                4)Real Brasileño =>> Dólar
                5)Dólar =>> Peso Colombiano
                6)Peso Colombiano =>> Dólar
                7)Dólar =>> Lempira
                8)Lempira =>> Dólar
                9)Salir \n
                *****************************************
                """;

        while (opcion != 9){
            System.out.println(menu);
            String input = lectura.nextLine();
//            opcion = lectura.nextInt();

            try{
                opcion = Integer.parseInt(input);
            }
            catch (NumberFormatException e){
//                System.out.println("No has ingresado un número válido. Puedes escribir un texto o un número.");
                opcion = 0;
            }
            if (opcion >= 1 && opcion <= 8) {
                switch (opcion) {
                    case 1:
                        System.out.println("Digite los valores");
                //consulta.consultaDelCliente("USD","HNL",lectura.nextDouble());
                //consulta.consultaDelCliente("USD","HNL",1.00);
                        System.out.println(consulta.consultaDelCliente("USD", "ARS", lectura.nextDouble()));//ver como resolver esto para poder mandar a llamar a consulta bien.
                        lectura.nextLine();
                        break;
                    case 2:
                        System.out.println("Digite los valores");
                        System.out.println(consulta.consultaDelCliente("USD", "USD", lectura.nextDouble()));
                        lectura.nextLine();
                        break;
                    case 3:
                        System.out.println("Digite los valores");
                        System.out.println(consulta.consultaDelCliente("USD", "BRL", lectura.nextDouble()));
                        lectura.nextLine();
                        break;
                    case 4:
                        System.out.println("Digite los valores");
                        System.out.println(consulta.consultaDelCliente("BRL", "USD", lectura.nextDouble()));
                        lectura.nextLine();
                        break;
                    case 5:
                        System.out.println("Digite los valores");
                        System.out.println(consulta.consultaDelCliente("USD", "COP", lectura.nextDouble()));
                        lectura.nextLine();
                        break;
                    case 6:
                        System.out.println("Digite los valores");
                        System.out.println(consulta.consultaDelCliente("COP", "USD", lectura.nextDouble()));
                        lectura.nextLine();
                        break;
                    case 7:
                        System.out.println("Digite los valores");
                        System.out.println(consulta.consultaDelCliente("USD", "HNL", lectura.nextDouble()));
                        lectura.nextLine();
                        break;
                    case 8:
                        System.out.println("Digite los valores");
                        System.out.println(consulta.consultaDelCliente("HNL", "USD", lectura.nextDouble()));
                        lectura.nextLine();
                        break;
//                    case 9:
//                        System.out.println("Gracias por usar :3");
//                        break;
                    default:
//                        System.out.println("Opcion no valida");
                        break;

                }
            } else if (opcion == 9) {
                System.out.println("Gracias por usar :3");
            } else {
                // Si la opción no está en el rango válido (1-8)
                System.out.println("Opción no válida");
            }
//        if (mayor > menor) {
//            System.out.println("Es mayor");
//        } else {
//            System.out.println("Es menor");
//        }

            /*opcion = lectura.nextInt();*/

        //Salida

//        System.out.println(opcion);
    }
 }
}