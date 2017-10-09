import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorInstanciasAleatorio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter escribidor=null;
		BufferedWriter os=null;
		int L;
		int N;
		Random aleatorio=new Random(5);
		int pisoDesde;
		try {
			L=6;
			N=6;
			escribidor = new FileWriter("Ej2InstanciasAleatorio.in");
			os= new BufferedWriter(escribidor);
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<10;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			
			L=15;
			N=1000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<1500;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			
			L=6;
			N=5000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<6000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			
			L=6;
			N=10000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<11000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			
			L=6;
			N=15000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<16000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			
			L=21;
			N=29000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<40000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			L=12;
			N=52000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<72000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			L=6;
			N=75000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<76000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			L=6;
			N=100000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<110000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			L=7;
			N=127000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<150000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			
			L=7;
			N=160000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<200000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			L=8;
			N=180000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<200000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			L=10;
			N=190000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<220000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			L=8;
			N=195000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<280000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			
			L=13;
			N=200000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<250000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
			L=16;
			N=205000;
			
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<290000;i++){
				pisoDesde=aleatorio.nextInt(N);
				os.write(Integer.toString(pisoDesde));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
				os.write(" ");
				os.write(Integer.toString(aleatorio.nextInt(L+1)));
				os.write(";");
			}
			
			pisoDesde=aleatorio.nextInt(N);
			os.write(Integer.toString(pisoDesde));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(N-pisoDesde)+pisoDesde+1));
			os.write(" ");
			os.write(Integer.toString(aleatorio.nextInt(L+1)));
			os.write("\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				os.close();
				escribidor.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("finn");
		
		

	}
	

}
