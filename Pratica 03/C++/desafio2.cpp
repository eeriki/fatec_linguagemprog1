#include <iostream>
using namespace std;

int main() {
    int numero = 0;

    while (numero <= 10) {
        cout << "Digite um número: ";
        cin >> numero;
    }

    cout << "Obrigado! Você digitou um número maior que 10." << endl;

    return 0;
}