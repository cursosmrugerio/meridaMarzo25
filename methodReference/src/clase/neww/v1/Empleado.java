package clase.neww.v1;

public class Empleado {
	
	String nombre;
	
	public Empleado() {}

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}

}
