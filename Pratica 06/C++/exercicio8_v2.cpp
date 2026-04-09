#include <iostream>
using namespace std;

string tipo(float lado_a, float lado_b, float lado_c) {
    if (lado_a == lado_b && lado_b == lado_c) return "Equilátero";
    else if (lado_a == lado_b || lado_a == lado_c || lado_b == lado_c) return "Isósceles";
    else return "Escaleno";
}

int main() {
    float lado_a, lado_b, lado_c;
    cout << "Digite o valor do lado A: ";
    cin >> lado_a;
    cout << "Digite o valor do lado B: ";
    cin >> lado_b;
    cout << "Digite o valor do lado C: ";
    cin >> lado_c;

    cout << tipo(lado_a, lado_b, lado_c);
    return 0;
}