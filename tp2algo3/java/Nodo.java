import java.util.LinkedList;
import java.util.List;

public class Nodo {
	
	private int id;
	private int distancia;
	private boolean marcado;
	private List<Nodo> sucesores;
	
	public Nodo(int id) {
		// TODO Auto-generated constructor stub		
		this.id=id;
		distancia=0;
		marcado=false;
		sucesores=new LinkedList<Nodo>();
	}
	
	public void addSucesor(Nodo n){
		sucesores.add(n);
	}

	public int getId() {
		return id;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public boolean isMarcado() {
		return marcado;
	}

	public void marcar() {
		marcado = true;
	}

	public List<Nodo> getSucesores() {
		return sucesores;
	}


}
