import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Ej2Tiempos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ejercicio2 tiempos");
		
		FileInputStream entrada =null;  
		BufferedReader reader =null;
		FileWriter escribidor=null;
		
		try{
			entrada = new FileInputStream(args[0]);
			reader = new BufferedReader(new InputStreamReader(entrada));
			escribidor= new FileWriter("Ej2Tiempos.out");				
			String line=null;	
			int L;
			int N;	
			String[] LyN;
			String[] portales;
			Nodo[] nodosGrafo;
			long antes;
			long duracion;
			long promedio=0;
			long[] tiempos= new long[300];
			while(true){
				
				line=reader.readLine();
				if (line==null) break;

				LyN=line.split(" ");
				L=Integer.parseInt(LyN[0]);
				N=Integer.parseInt(LyN[1]);
				
				line=reader.readLine();
				portales=line.split(";");
				
				for(int v=0;v<300;v++){
					System.gc();
					antes=System.currentTimeMillis();
					nodosGrafo= new Nodo[(L+1)*(N+1)+portales.length];// almacenamos en este arreglo los nodos correspondiendose el indice con el id del nodo
					
					//creamos los nodos
					for(int i=0;i<(L+1)*(N+1);i++){
						Nodo nuevo=new Nodo(i);
						nodosGrafo[i]=nuevo;
					}
					
					//asignamos los sucesores de los nodos
					for(int i=0;i<(L+1)*(N+1);i++){
						if(i%(L+1)==0) nodosGrafo[i].addSucesor(nodosGrafo[i+1]);
						else if(i%(L+1)==L) nodosGrafo[i].addSucesor(nodosGrafo[i-1]);
						else{
							nodosGrafo[i].addSucesor(nodosGrafo[i+1]);
							nodosGrafo[i].addSucesor(nodosGrafo[i-1]);
						}
					}
					
					//asignamos los sucesores de los portales
					int pisoDesde;
					int baldosaDesde;
					int pisoHasta;
					int baldosaHasta;
					String[] parametrosPortales;
					for(int i=0;i<portales.length;i++){
						int idp=(L+1)*(N+1)+i;
						Nodo nodoPortal=new Nodo(idp);
						nodosGrafo[idp] =nodoPortal;
						parametrosPortales=portales[i].trim().split(" ");
					//	System.out.println(parametrosPortales);
						
						pisoDesde=Integer.parseInt(parametrosPortales[0]);
						baldosaDesde=Integer.parseInt(parametrosPortales[1]);
						pisoHasta=Integer.parseInt(parametrosPortales[2]);
						baldosaHasta=Integer.parseInt(parametrosPortales[3]);
					//	System.out.println("[ "+ pisoDesde+" "+ baldosaDesde + " "+pisoHasta+" "+ baldosaHasta+"]" );
	
						nodoPortal.addSucesor(nodosGrafo[pisoDesde*(L+1)+baldosaDesde]);
						nodosGrafo[pisoDesde*(L+1)+baldosaDesde].addSucesor(nodoPortal);
						
						nodoPortal.addSucesor(nodosGrafo[pisoHasta*(L+1)+baldosaHasta]);
						nodosGrafo[pisoHasta*(L+1)+baldosaHasta].addSucesor(nodoPortal);
					}
					//aplicamos bfs
					
					Queue<Nodo> cola= new LinkedList<Nodo>();
					cola.add(nodosGrafo[0]);
					nodosGrafo[0].marcar();
					bfs:
					while(!(cola.isEmpty())){
						Nodo w=cola.remove();
						for(Nodo z : w.getSucesores()){
							if(z.getId()==(N+1)*(L+1)-1){
							//	System.out.println(w.getDistancia()+1);
							
								
								duracion=System.currentTimeMillis()-antes;
								tiempos[v] = duracion;
								promedio+=duracion;
								//System.out.println("L es "+L +" N es "+N);
								break bfs;
							}	
							if(!(z.isMarcado())){
								z.marcar();
								cola.add(z);
								z.setDistancia(w.getDistancia()+1);
							}
						}
					}
				}
				
				promedio = promedio/300;
				long desvio = 0;
				long[] var= new long[300];
				for(int j = 0;j < 300;j++){
					var[j] = tiempos[j] - promedio;
					var[j] = var[j] * var[j];
					desvio = desvio + var[j];
				}
				desvio = desvio/300;
				desvio = (long)Math.sqrt(desvio);
				long promedio2 = 0;
				int cant = 0;
				for(int k = 0;k < 300;k++){
					if(tiempos[k] < promedio-desvio){
						tiempos[k] = 0;
						cant--;
					}else if(tiempos[k] > promedio + desvio){
						tiempos[k] = 0;
						cant--;
					}
					promedio2 = promedio2 + tiempos[k];
					cant++;
				}
				System.out.println(promedio2/cant);
				escribidor.write(Double.toString((double)promedio2/cant));						
				escribidor.write("\n");
				promedio=0;
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				reader.close();
				entrada.close();
				escribidor.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
