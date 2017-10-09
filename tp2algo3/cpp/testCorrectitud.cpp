#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main(int argc, char *argv[]){
	bool res;
	string line1;
	string line2;
	ifstream file1 (argv[1]);
	ifstream file2 (argv[2]);
	if (file1.is_open()){
		if (file2.is_open()){
			while (getline(file1, line1) && getline(file2, line2)){
				if(line1 == line2){
					res = true;
				}else{
					res = false;
					break;
				}
			}
			file1.close();
			file2.close();
		}else{
			cout << "Unable to open file2"<<endl; 
		}
	}else{
		cout << "Unable to open file1"<<endl; 
	}
	if(res == true){
		cout << "Las respuestas son iguales" <<endl;
	}else{
		cout << "Las respuestas son distintas" <<endl;
	}
	return 0;
}
