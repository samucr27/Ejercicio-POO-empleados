public class EmpleadoPorHoras extends Empleado{
    private double pagoHrs;
    private int HrsTrab;

    public EmpleadoPorHoras(String nombre, int edad, int hrsTrab) {
        super(nombre, edad);
        this.pagoHrs = 98000;
        HrsTrab = hrsTrab;
    }

    public double getPagoHrs() {
        return pagoHrs;
    }

    public void setPagoHrs(double pagoHrs) {
        this.pagoHrs = pagoHrs;
    }

    public int getHrsTrab() {
        return HrsTrab;
    }

    public void setHrsTrab(int hrsTrab) {
        HrsTrab = hrsTrab;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" +
                "pagoHrs=" + pagoHrs +
                ", HrsTrab=" + HrsTrab +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}
