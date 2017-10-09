import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GeneradorInstanciasEj2MejorCaso {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter escribidor=null;
		BufferedWriter os=null;
		int L;
		int N;
		try {
			L=6;
			N=6;
			escribidor = new FileWriter("Ej2InstanciasMejorCaso.in");
			os= new BufferedWriter(escribidor);
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			L=6;
			N=15;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////

			L=6;
			N=50;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=80;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=150;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=300;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=600;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=1200;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=2400;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=5000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=10000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			
			L=6;
			N=12000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			
			
			L=6;
			N=15000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=20000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=25000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			
			L=6;
			N=75000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=100000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=125000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			
			L=6;
			N=150000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=175000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=200000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			
			L=6;
			N=225000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=6;
			N=250000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			//variando solo el L
			
			L=10;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=15;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=20;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			
			L=25;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
				
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=30;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=35;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=40;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			L=45;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			
			L=50;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
			os.write("\n");
			
			
			L=60;
			N=50000;
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write("\n");
			
			for(int i=0;i<N-1;i++){
				if(i==0){
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(" ");
					os.write(Integer.toString(N));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(";");
				}else{
					os.write(Integer.toString(i));
					os.write(" ");
					os.write(Integer.toString(L));
					os.write(" ");
					os.write(Integer.toString(i+1));
					os.write(" ");
					os.write(Integer.toString(0));
					os.write(";");
				}
			}
			
			os.write(Integer.toString(N-1));
			os.write(" ");
			os.write(Integer.toString(L));
			os.write(" ");
			os.write(Integer.toString(N));
			os.write(" ");
			os.write(Integer.toString(0));
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
