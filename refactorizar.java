import java.util.*;

public class Inventario {
    static ArrayList<String> nombres = new ArrayList<>();
    static ArrayList<Integer> cantidades = new ArrayList<>();
    static ArrayList<Double> precios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 1) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                System.out.print("Precio: ");
                double precio = sc.nextDouble();
                nombres.add(nombre);
                cantidades.add(cantidad);
                precios.add(precio);
            } else if (opcion == 2) {
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println(nombres.get(i) + " - " + cantidades.get(i) + " unidades - $" + precios.get(i));
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}
