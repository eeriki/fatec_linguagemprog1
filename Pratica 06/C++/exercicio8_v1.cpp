#include <iostream>
using namespace std;

int main() {
    float lado_a, lado_b, lado_c;
    cout << "Digite o valor do lado A: ";
    cin >> lado_a;
    cout << "Digite o valor do lado B: ";
    cin >> lado_b;
    cout << "Digite o valor do lado C: ";
    cin >> lado_c;

    if (lado_a == lado_b && lado_b == lado_c) cout << "Equilátero";
    else if (lado_a == lado_b || lado_a == lado_c || lado_b == lado_c) cout << "Isósceles";
    else cout << "Escaleno";

    return 0;
}