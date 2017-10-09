




int main(){
	
	//Primero deberia leer los portales e ir agregando a la matriz los portales..
	//El problema esta resuelto con programacion dinamica, la forma bottom up, primero empezaremos llenandola con los datos que tenemos.
	//Y luego recorriendola, de forma diagonal, y ya sabiendo que cualquier dato que necesitamos ya lo tenemos precalculado.
	int matriz[n][n];
	
	//La lleno con 0, ya que si tiene un 0 quiere decir que no puede llegar, y luego vamos a leer los portales..
	int i=0,j=0;
	for(i = 0; i < n;i++){
		for(j = 0,j < n; j++){
			matriz[i][j] = 0;
		}
	}
	

}
