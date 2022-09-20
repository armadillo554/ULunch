import java.util.Scanner;

public class ULunch {
    public static void main(String[] args) {
        String[][] menuComida=new String[5][8];
        menuComida[0][0]="Nombre";
        menuComida[0][1]="Precio";
        menuComida[0][2]="Plato Entrada";
        menuComida[0][3]="Plato Fondo";
        menuComida[0][4]="Pan";
        menuComida[0][5]="Jugo";
        menuComida[0][6]="Postre";
        menuComida[0][7]="Casino";
        menu(menuComida);
    }

    public static void menu(String[][] menuComida){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. INICIAR SESIÓN");
            System.out.println("2. ENTRAR COMO INVITADO");
            System.out.println("3. SALIR");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion: Iniciar Sesión");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion: Entrar como Invitado");
                        imprimirMenu(menuComida);
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Escriba sólo números entre 1 y 3");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }



    public static void imprimirMenu(String[][] menu) {
        for (int x = 0; x < menu.length; x++) {
            System.out.print("|");
            for (int y = 0; y < menu[x].length; y++) {
                System.out.print(menu[x][y]);
                if (y != menu[x].length - 1) System.out.print("\t");
                }
                System.out.println("|");
            }
        }
    }


