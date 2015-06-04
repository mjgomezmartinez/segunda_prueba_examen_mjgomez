package paquete;

public class Segovia {
	private int i;
	private String cadena;

	@Override
	public String toString() {
		return "Segovia [i=" + i + ", cadena=" + cadena + "]";
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
