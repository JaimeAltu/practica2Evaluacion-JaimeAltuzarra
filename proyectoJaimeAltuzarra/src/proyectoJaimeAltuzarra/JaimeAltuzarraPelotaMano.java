package proyectoJaimeAltuzarra;

public class JaimeAltuzarraPelotaMano {
	public String categoriaPelota;
	public int numerosFronton;
	public String pelotaMano;
	
	public JaimeAltuzarraPelotaMano(String categoriaPelota, int numerosFronton, String pelotaMano) {
		super();
		this.categoriaPelota = categoriaPelota;
		this.numerosFronton = numerosFronton;
		this.pelotaMano = pelotaMano;
	}

	public String getCategoriaPelota() {
		return categoriaPelota;
	}

	public void setCategoriaPelota(String categoriaPelota) {
		this.categoriaPelota = categoriaPelota;
	}

	public int getNumerosFronton() {
		return numerosFronton;
	}

	public void setNumerosFronton(int numerosFronton) {
		this.numerosFronton = numerosFronton;
	}

	public String getPelotaMano() {
		return pelotaMano;
	}
	
}
