#include <iostream>
using namespace std;

float area(float base, float altura) {
    return base * altura;
}

int main() {
    float base, altura;
    cout << "Digite a base: ";
    cin >> base;
    
    cout << "Digite a altura: ";
    cin >> altura;

    cout << "Área: " << area(base, altura) << endl;

    return 0;
}