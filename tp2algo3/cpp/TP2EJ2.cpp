#include<iostream>
#include<cassert>
#include<vector>
#include<queue>

using namespace std;

struct Portal{
    int pisoDesde,pisoHasta,metrosDesde,metrosHasta;
};

class Ejercicio2{
public:
    int solve(int N, int L, vector<Portal> &portales)
    {

    }
};

class Test{
public:
    void test0()
    {
        Ejercicio2 e;
        vector<Portal> portales;
        Portal p1;
        p1.pisoDesde = 1;
        p1.pisoHasta = 10;
        p1.metrosDesde = 10;
        p1.metrosHasta = 1;
        portales.push_back(p1);
        assert(e.solve(10,10,portales) == 20);
    }
    void test1()
    {
        Ejercicio2 e;
        vector<Portal> portales;
        Portal p1,p2,p3,p4;
        p1.pisoDesde = 1;
        p1.pisoHasta = 2;
        p2.pisoDesde = 2;
        p2.pisoHasta = 3;
        p3.pisoDesde = 3;
        p3.pisoHasta = 4;
        p4.pisoDesde = 4;
        p4.pisoHasta = 5;
        p1.metrosDesde = 2;
        p1.metrosHasta = 3;
        p2.metrosDesde = 4;
        p2.metrosHasta = 2;
        p3.metrosDesde = 1;
        p3.metrosHasta = 5;
        p4.metrosDesde = 3;
        p4.metrosHasta = 2;
        portales.push_back(p1);
        portales.push_back(p2);
        portales.push_back(p3);
        portales.push_back(p4);
        assert(e.solve(5,5,portales) == 16);
    }
};

int main()
{
	Test t;
	t.test0();
	t.test1();
}
