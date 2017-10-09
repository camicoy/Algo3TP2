#include <iostream>
#include <cassert>
#include <vector>
#include <queue>
#include <algorithm>
#include <sstream>
#include <fstream>
#include <string>
#include <time.h> 
using namespace std;

struct Portal{
    int pisoDesde,pisoHasta;
};

class Ejercicio1{
public:
    int solve(int n, vector<Portal> &portales)
    {
		//Primero deberia leer los portales e ir agregando a la matriz los portales..
		//El problema esta resuelto con programacion dinamica, la forma bottom up, primero empezaremos llenandola con los datos que tenemos.
		//Y luego recorriendola, de forma diagonal, y ya sabiendo que cualquier dato que necesitamos ya lo tenemos precalculado.
		int matriz[n][n];
		
		//La lleno con 0, ya que si tiene un 0 quiere decir que no puede llegar, y luego vamos a leer los portales..
		int i=0,j=0;
		for(i = 0; i < n;i++){
			for(j = 0;j < n; j++){
				matriz[i][j] = 0;
			}
		}
		int pisoD,pisoH,suma;
		Portal p1;
		
		//En este for ingreso los portales..
		for(i =0;i< portales.size();i++){
			p1 = portales[i];
			pisoD = p1.pisoDesde;
			pisoH = p1.pisoHasta;
			matriz[pisoD-1][pisoH-1] = 1;
		}
		//Ahora vamos a empezar a recorrer de forma diagonal
		for(i = 1;i<n;i++){ //Voy a hacer este for n veces, lo de adentro del for es del orden: O(n-i+i) => O(n) => O(n*n)
			int max = 0;
			for(j =0;j<i;j++){ //Voy a hacer este for i veces, y lo de adentro es del orden de O(1) => tarda O(i)
				if(matriz[j][i] > max){
					max = matriz[j][i];
				}
			}
			//Tengo el maximo de mi columna, lo que quiere decir que es lo que tardo en llegar hasta mi piso.
			matriz[i][i] = max;
			for(j = i+1;j<n;j++){ //Este for va a iterar n-i veces y lo de adentro lo hace en O(1) => tarda O(n-i)
				if(max == 0){
					matriz[i][j] = 0;
				}else{
					//Tengo que sumarle lo que tardo en llegar a mi piso, si es que ese piso (m [i][j] es accesible, osea tiene un 1)
					if(matriz[i][j] != 0){
						matriz[i][j] = max +1;
					}
				}
			}
		}

		return matriz[n-1][n-1];
    }
};

class Test{
public:
    void test0()
    {
        Ejercicio1 e;
        vector<Portal> portales;
        Portal p1;
        p1.pisoDesde = 1;
        p1.pisoHasta = 1500;
        portales.push_back(p1);
        //cout << "Uso: " <<e.solve(10,portales)<< " portales"<<endl;

        assert(e.solve(1500,portales) == 1);
    }
    void test3()
    {
        Ejercicio1 e;
        vector<Portal> portales;
        Portal p1;
        p1.pisoDesde = 1;
        p1.pisoHasta = 2000;
        portales.push_back(p1);
        //cout << "Uso: " <<e.solve(10,portales)<< " portales"<<endl;

        assert(e.solve(2000,portales) == 1);
    }
    void test1()
    {
        Ejercicio1 e;
        vector<Portal> portales;
        Portal p1,p2,p3,p4;
        p1.pisoDesde = 1;
        p1.pisoHasta = 6;
        p2.pisoDesde = 2;
        p2.pisoHasta = 7;
        p3.pisoDesde = 3;
        p3.pisoHasta = 8;
        p4.pisoDesde = 6;
        p4.pisoHasta = 10;
        portales.push_back(p1);
        portales.push_back(p2);
        portales.push_back(p3);
        portales.push_back(p4);
		//cout << "Uso: " <<e.solve(10,portales)<< " portales"<<endl;
        assert(e.solve(10,portales) == 2);
    }
    void test2()
    {
        Ejercicio1 e;
        vector<Portal> portales;
        Portal p1,p2,p3,p4,p5,p6,p7;
        p1.pisoDesde = 1;
        p6.pisoDesde = 1;
        p1.pisoHasta = 3;
        p6.pisoHasta = 7;
        p2.pisoDesde = 1;
        p2.pisoHasta = 5;
        p3.pisoDesde = 2;
        p3.pisoHasta = 3;
        p4.pisoDesde = 4;
        p4.pisoHasta = 6;
        p7.pisoDesde = 6;
        p5.pisoDesde = 3;
        p7.pisoHasta = 7;
        p5.pisoHasta = 4;
        portales.push_back(p1);
        portales.push_back(p2);
        portales.push_back(p3);
        portales.push_back(p4);
        portales.push_back(p5);
        portales.push_back(p6);
        portales.push_back(p7);
		//cout << "Uso: " <<e.solve(6,portales)<< " portales"<<endl;
        assert(e.solve(7,portales) == 4);
    }
};

void mejorCaso(){
	ofstream file;
	file.open("TiempoMejorEj1.txt");
	for(int n = 200; n <= 1400; n = n + 100){
		Ejercicio1 e;
		vector<Portal> portales;
		Portal p1;
		p1.pisoDesde = 1;
		p1.pisoHasta = n;
		portales.push_back(p1);
		float todos[100];
		float desStd[100];
		clock_t ini, fin;
		float prom, std, total;
		prom = 0;
		for (int i = 0; i < 100; i++) {
			ini = clock();
			e.solve(n, portales);
			fin = clock() - ini;
			cout << fin <<endl;
			fin = fin*1000;
			fin = (float)fin / CLOCKS_PER_SEC;
			prom = prom + fin;
			todos[i] = (float)fin;
			desStd[i] = (float)fin;
		}
		prom = prom/100;
		std = 0;
		for(int j = 0; j < 100; j++){
			desStd[j] = desStd[j] - prom;
			desStd[j] = desStd[j] * desStd[j];
			std = std + desStd[j];
		}
		std = std/100;
		std = sqrt(std);
		total = 0;
		for(int k = 0; k < 100; k++){
			if(todos[k] <= prom+std || todos[k] >= prom-std){
				total = total + todos[k];
			}
		}
		total = total/100;
		file << total << '\n';
	}
	file.close();
}



void peorCaso(){
	ofstream file;
	file.open("TiempoPeorEj1.txt");
	for(int n = 100; n <= 1400; n = n + 100){
		Ejercicio1 e;
		vector<Portal> portales = vector<Portal>();
		for(int i = 1; i <= n; i++){
			for(int j = i+1; j <= n; j++){
				Portal p1;
				p1.pisoDesde = i;
				p1.pisoHasta = j;
				portales.push_back(p1);
			}
		}
		float todos[100];
		float desStd[100];
		clock_t ini, fin;
		float prom, std, total;
		prom = 0;
		for (int i = 0; i < 100; i++) {
			ini = clock();
			e.solve(n, portales);
			fin = clock() - ini;
			fin = fin*1000;
			fin = (float)fin / CLOCKS_PER_SEC;
			prom = prom + fin;
			todos[i] = (float)fin;
			desStd[i] = (float)fin;
		}
		prom = prom/100;
		std = 0;
		for(int j = 0; j < 100; j++){
			desStd[j] = desStd[j] - prom;
			desStd[j] = desStd[j] * desStd[j];
			std = std + desStd[j];
		}
		std = std/100;
		std = sqrt(std);
		total = 0;
		for(int k = 0; k < 100; k++){
			if(todos[k] <= prom+std || todos[k] >= prom-std){
				total = total + todos[k];
			}
		}
		total = total/100;
		file << total << '\n';
	}
	file.close();
}

bool yaEsta(vector<int> a, vector<int> b, int num1, int num2){
	for(unsigned int i = 0; i < a.size(); i++){
		if(a[i] == num1 || a[i] == num2){
			if(b[i] == num1 || b[i] == num2){
				return true;
			}
		}
	}
	return false;
}

void casoPromedio(){
	ofstream file;
	file.open("TiempoPromedioEj1.txt");
	for(int n = 100; n <= 1400; n = n + 100){
		Ejercicio1 e;
		vector<Portal> portales = vector<Portal>();
		for(int i = 1; i <= n; i++){
			Portal p1;
			p1.pisoDesde = i;
			p1.pisoHasta = i+1;
			portales.push_back(p1);
		}
		int m = n * (n - 1);
		m = m/2;
		m = m - n;
		int hasta = rand() % m;
		vector<int> a, b;
		for(int j = 0; j <= hasta; j++){
			int num1 = rand() % hasta +1;
			int num2 = rand() % hasta +1;
			if(num1 == num2 || num1 == num2+1 || num1 == num2-1){
				j--;
			}else if(yaEsta(a, b, num1, num2) || num1 >= num2){
				j--;
			}else{
				a.push_back(num1);
				b.push_back(num2);
				Portal p2;
				p2.pisoDesde = num1;
				p2.pisoHasta = num2;
				portales.push_back(p2);
			}
		}
		float todos[100];
		float desStd[100];
		clock_t ini, fin;
		float prom, std, total;
		prom = 0;
		for (int i = 0; i < 40; i++) {
			ini = clock();
			e.solve(n, portales);
			fin = clock() - ini;
			fin = fin*1000;
			fin = (float)fin / CLOCKS_PER_SEC;
			prom = prom + fin;
			todos[i] = (float)fin;
			desStd[i] = (float)fin;
		}
		prom = prom/100;
		std = 0;
		for(int j = 0; j < 100; j++){
			desStd[j] = desStd[j] - prom;
			desStd[j] = desStd[j] * desStd[j];
			std = std + desStd[j];
		}
		std = std/100;
		std = sqrt(std);
		total = 0;
		for(int k = 0; k < 100; k++){
			if(todos[k] <= prom+std || todos[k] >= prom-std){
				total = total + todos[k];
			}
		}
		total = total/100;
		file << total << '\n';
	}
	file.close();
}

int main()
{
	Test t;
	t.test0();
	t.test1();
	t.test2();
	//t.test3();
	mejorCaso();
	//peorCaso();
	//casoPromedio();
	
	
}
