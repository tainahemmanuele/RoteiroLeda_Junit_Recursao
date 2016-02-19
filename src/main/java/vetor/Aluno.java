package vetor;

public class Aluno implements Comparable <Aluno>{
	private String nome;
	private double media;
	
	public Aluno(String nome, double media) {
		super();
		this.nome = nome;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public int compareTo(Aluno o) {
		if (media > o.getMedia()){
			return 1;
		}else if (media< o.getMedia()){
			return -1;
		}else{
		return 0;
	}
	
	}
	
}
