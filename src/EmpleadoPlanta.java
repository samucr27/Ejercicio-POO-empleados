public class EmpleadoPlanta extends Empleado{

    private double salarioFijo = 2100000;

    public EmpleadoPlanta(String nombre, int edad, int salFijo) {
        super(nombre, edad);
        this.salarioFijo = salFijo;
    }

    public double getSalFijo() {
        return salarioFijo;
    }

    public void setSalFijo(double salFijo) {
        this.salarioFijo = salFijo;
    }

    @Override
    public String toString() {
        return "EmpleadoPlanta{" +
                "salarioFijo=" + salarioFijo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
