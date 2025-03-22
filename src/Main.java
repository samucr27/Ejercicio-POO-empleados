import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Empleado> lstEmp = new ArrayList<>();
        int op;

        do {
            System.out.println("""
                    MENU DE OPCIONES
                    1. Registar empleado planta
                    2. Registrar empleado por horas
                    3. Mostrar todos los empleadoss
                    4. Salario de los empleados
                    5. Salir
                    """);
            op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombrePlanta = teclado.nextLine();
                    System.out.print("Edad: ");
                    int edadPlanta = teclado.nextInt();
                    System.out.print("Salario fijo: ");
                    int salFijo = teclado.nextInt();

                    EmpleadoPlanta empPlanta = new EmpleadoPlanta(nombrePlanta, edadPlanta, salFijo);
                    lstEmp.add(empPlanta);
                    System.out.println("Empleado de planta agregado correctamente.");
                }

                case 2 -> {
                    System.out.print("Nombre: ");
                    String nombreHoras = teclado.nextLine();
                    System.out.print("Edad: ");
                    int edadHoras = teclado.nextInt();
                    System.out.print("Horas trabajadas: ");
                    int hrsTrab = teclado.nextInt();

                    EmpleadoPorHoras empHoras = new EmpleadoPorHoras(nombreHoras, edadHoras, hrsTrab);
                    lstEmp.add(empHoras);
                    System.out.println("Empleado por horas agregado correctamente.");
                }

                case 3 -> {
                    if (lstEmp.isEmpty()) {
                        System.out.println("No hay empleados registrados");
                    } else {
                        System.out.println("Lista de Empleados");
                        for (Empleado emp : lstEmp) {
                            System.out.println(emp.toString());

                            if (emp instanceof EmpleadoPorHoras eHoras) {
                                System.out.println("Salario total: " + (eHoras.getPagoHrs() * eHoras.getHrsTrab()));
                            }

                            if (emp instanceof EmpleadoPlanta ePlanta) {
                                System.out.println("Salario fijo: " + ePlanta.getSalFijo());
                            }
                        }
                    }
                }

                case 4 -> {
                    double totalSalarios = 0;
                    for (Empleado emp : lstEmp) {
                        if (emp instanceof EmpleadoPorHoras eHoras) {
                            totalSalarios += eHoras.getPagoHrs() * eHoras.getHrsTrab();
                        } else if (emp instanceof EmpleadoPlanta ePlanta) {
                            totalSalarios += ePlanta.getSalFijo();
                        }
                    }
                    System.out.println("Salario total de todos los empleados: " + totalSalarios);
                }

                case 5 -> {
                    System.out.println("Saliendo");
                }

                default -> {
                    System.out.println("Opción invalida.");
                }
            }

        } while (op != 5);

        teclado.close();
    }
}
