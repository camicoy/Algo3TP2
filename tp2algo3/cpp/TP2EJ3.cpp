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

class Arista{
	private:
		unsigned int _nod1, _nod2;
		int _peso;
		
	public:
		Arista(unsigned int n1, unsigned int n2, int p) : _nod1(n1), _nod2(n2), _peso(p) {}
		int peso() const { return _peso; }
		unsigned int nodo1() const { return _nod1; }
		unsigned int nodo2() const { return _nod2; }
		
		bool operator<(const Arista &ar) const {
			if(peso() != ar.peso()) return peso() < ar.peso();
			if(nodo1() != ar.nodo1()) return nodo1() < ar.nodo1();
			return nodo2() < ar.nodo2();
		}

};

class UnionFind{
	private:
		vector<unsigned int> _parent, _rank;
		
	public:
		UnionFind(unsigned int n){
			for(unsigned int i = 0; i < n; i++){
				_parent.push_back(i);
				_rank.push_back(0);
			}
		}
		
		unsigned int findSet(unsigned int i){ 
			if(_parent[i] == i){
				return i;
			}else{
				_parent[i] = findSet(_parent[i]);
				return _parent[i];
			}
		}
		
		bool isSameSet(unsigned int i, unsigned int j){
			return findSet(i) == findSet(j);
			
		}
		
		void unionSet(unsigned int i, unsigned int j){
			if( !isSameSet(i,j) ){
				unsigned int jParent = findSet(j);
				unsigned int iParent = findSet(i);
				if(_rank[iParent] > _rank[jParent]){
					_parent[jParent] = iParent;
				}else if(_rank[iParent] < _rank[jParent]){
					_parent[iParent] = jParent;
				}else{
					_parent[jParent] = iParent;
					_rank[iParent]++; 
				}
			}
		}
};

int kruskalModificado(int n, vector<Arista> todas){
	sort(todas.begin(), todas.end());
	reverse(todas.begin(), todas.end());
	UnionFind arbol = UnionFind(n);
	int peso = 0;
	for(unsigned int i = 0; i < todas.size(); i++){
		if( !arbol.isSameSet(todas[i].nodo1(), todas[i].nodo2()) ){
			arbol.unionSet(todas[i].nodo1(), todas[i].nodo2());
		}else{
			peso = peso + todas[i].peso();
		}
	}
	return peso;
}

class Ejercicio3{
public:
    int solve(int N, vector<Arista> &pasillos)
    {
		return kruskalModificado(N,pasillos);
    }
};

ostream &operator<<(ostream &stream, const Arista& ar){
	stringstream output;
	output << "[(" << ar.nodo1() << "," << ar.nodo2() << ") " << ar.peso() << "]";
	stream << output.str();
	return stream;
}

void peorCaso(){
	ofstream file;
	file.open("TiempoPeorEj3.txt");
	for(int n = 100; n <= 2000; n = n + 100){
		Ejercicio3 e;
		vector<Arista> problema = vector<Arista>();
		for(int i = 1; i <= n; i++){
			for(int j = i+1; j <= n; j++){
				int peso = rand() %100 +1;
				Arista ars = Arista(i, j, peso);
				problema.push_back(ars);
			}
		}
		float todos[100];
		float desStd[100];
		clock_t ini, fin;
		float prom, std, total;
		prom = 0;
		for (int i = 0; i < 100; i++) {
			ini = clock();
			e.solve(n, problema);
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

void mejorCaso(){
	ofstream file;
	file.open("TiempoMejorEj3.txt");
	for(int n = 1000; n <= 20000; n = n + 1000){
		Ejercicio3 e;
		vector<Arista> problema = vector<Arista>();
		for(int i = 1; i <= n; i++){
			Arista ars = Arista(i, i+1, i);
			problema.push_back(ars);
		}
		float todos[100];
		float desStd[100];
		clock_t ini, fin;
		float prom, std, total;
		prom = 0;
		for (int i = 0; i < 100; i++) {
			ini = clock();
			e.solve(n, problema);
			fin = clock() - ini;
			fin = fin*100000;
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
	file.open("TiempoPromedioEj3.txt");
	for(int n = 100; n <= 2000; n = n + 100){
		Ejercicio3 e;
		vector<Arista> problema = vector<Arista>();
		for(int i = 1; i <= n; i++){
			int peso = rand() %100 +1;
			Arista ars = Arista(i, i+1, peso);
			problema.push_back(ars);
		}
		int m = n * (n - 1);
		m = m/2;
		m = m - n + 1;
		int hasta = rand() % m;
		vector<int> a, b;
		for(int j = 0; j <= hasta; j++){
			int num1 = rand() % hasta +1;
			int num2 = rand() % hasta +1;
			if(num1 == num2 || num1 == num2+1 || num1 == num2-1){
				j--;
			}else if(yaEsta(a, b, num1, num2)){
				j--;
			}else{
				int peso = rand() %1000 +1;
				a.push_back(num1);
				b.push_back(num2);
				Arista ars = Arista(num1, num2, peso);
				problema.push_back(ars);
			}
		}
		float todos[100];
		float desStd[100];
		clock_t ini, fin;
		float prom, std, total;
		prom = 0;
		for (int i = 0; i < 40; i++) {
			ini = clock();
			e.solve(n, problema);
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

int main(int argc, char *argv[])
{
	int x = atoi(argv[1]);
	if(x==1){
		string line;
		ifstream file ("../../Tp2Ej3.in");
		ofstream salida;
		salida.open("TP2Ej3nuestro.out");
		if (file.is_open()){
			while (getline(file, line)){
				Ejercicio3 e;
				int voy = 1;
				vector<Arista> pabellon = vector<Arista>();
				int n1, n2, p, cant = 0;
				char puncoma = ';';
				char esp = ' ';
				for(char& c : line){
					if(c != esp && c != puncoma){
						if(voy == 1){
							n1 = atoi(&c);
							n1++;
							cant = max(cant, n1);
							voy++;
						}else if(voy == 2){
							n2 = atoi(&c);
							n2++;
							cant = max(cant, n2);
							voy++;
						}else if(voy == 3){
							p =  atoi(&c);
							Arista ars = Arista(n1, n2, p);
							pabellon.push_back(ars);
							voy++;
						}
					}
					if(c == puncoma){
						voy = 1;
					}
				}
				cout << "nodos=" << cant <<endl;
				for(unsigned int j = 0; j< pabellon.size(); j++){
					if (cant == 5)cout << pabellon[j] <<endl;
				}//estoy intrigada de porque haciendo esto me da 52 y comentandolo me da 105
				salida << e.solve(cant, pabellon) << '\n';
			}
			salida.close();
			file.close();
		}else{
			cout << "Unable to open file"; 
		}
	}else if(x == 2){
		peorCaso();
		mejorCaso();
		//casoPromedio();
	}else{
		cout << "Como primer parametro entrar 1 o 2.\nSi es dos no pasar ningun otro parametro.\nSi es uno pasar el nombre del archivo" <<endl;
	}
}
