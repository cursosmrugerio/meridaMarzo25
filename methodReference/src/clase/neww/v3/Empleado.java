package clase.neww.v3;

public class Empleado {
	
	String nombre;
	int edad;
	double sueldo;
	
	public Empleado() {}

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}

}
