public abstract class Empleado {
    private String informacionPersonal;
    private Integer sueldo;

    public Empleado(String informacionPersonal, Integer sueldo) {
        this.informacionPersonal = informacionPersonal;
        this.sueldo = sueldo;
    }
}
