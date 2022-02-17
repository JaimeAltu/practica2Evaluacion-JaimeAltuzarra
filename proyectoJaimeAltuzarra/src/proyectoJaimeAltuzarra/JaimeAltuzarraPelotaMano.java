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

	public void setPelotaMano(String pelotaMano) {
		this.pelotaMano = pelotaMano;
	}
	private static void imprimirNombre(String pelotaMano) {
		for(int i=0;i<1000;i++) {
			System.out.println(pelotaMano);
			
		}
	}
	public static void main(String[] args) {
		imprimirNombre("PelotaVasca");
		
	}
}
