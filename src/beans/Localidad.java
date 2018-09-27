package beans;

public class Localidad {

	private int codigo;
	private String nombre;
	private int poblacion;

	public Localidad(int codigo, String nombre, int poblacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.poblacion = poblacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

}
