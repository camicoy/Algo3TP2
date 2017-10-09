#include <iostream>
#include <fstream>
#include <vector>
#include <cstdlib>

using namespace std;

void peorCaso(){
	ofstream file;
	file.open("PeorCasoEj3.in");
	for(int n = 100; n <= 2000; n = n + 100){
		for(int i = 1; i <= n; i++){
			for(int j = i+1; j <= n; j++){
				int peso = rand() %100 +1;
				file << i << " ";
				file << j << " ";
				file << peso;
				if(i != n){
					file << "; ";
				}
			}
		}
		file << "\n";
	}
	file.close();
}

void mejorCaso(){
	ofstream file;
	file.open("MejorCasoEj3.in");
	for(int n = 1000; n <= 20000; n = n + 1000){
		for(int i = 1; i <= n; i++){
			file << i << " ";
			file << i+1 << " ";
			file << i;
			if(i != n){
				file << "; ";
			}
		}
		file << "\n";
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
	file.open("CasoPromedioEj3.in");
	for(int n = 100; n <= 2000; n = n + 100){
		for(int i = 1; i <= n; i++){
			int peso = rand() %100 +1;
			file << i << " ";
			file << i+1 << " ";
			file << peso << "; ";
		}
		int m = n * (n + 1);
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
				file << num1 << " ";
				file << num2 << " ";
				file << peso;
				if(j != hasta){
					file << "; ";
				}
			}
		}
		file << "\n";
	}
	file.close();
}

int main(){
	
	peorCaso();
	mejorCaso();
	casoPromedio();
	
	return 0;
}
