package clase.neww.v2;

public class Empleado {
	
	String nombre;
	int edad;
	
	public Empleado() {}

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
