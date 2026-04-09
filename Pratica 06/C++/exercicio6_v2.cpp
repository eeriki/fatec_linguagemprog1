#include <iostream>
using namespace std;

float desconto(float valor, float desc) {
    return valor - (valor * desc / 100);
}

int main() {
    float valor, desc;
    cout << "Digite o valor do produto: ";
    cin >> valor;
    cout << "Digite o desconto (%): ";
    cin >> desc;

    cout << "O valor final é: R$ " << desconto(valor, desc);

    return 0;
}