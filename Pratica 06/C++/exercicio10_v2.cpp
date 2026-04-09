#include <iostream>
using namespace std;

void tabuada(int numero) {
    for (int i = 1; i <= 10; i++) {
        cout << numero << " x " << i << " = " << numero * i << endl;
    }
}

int main() {
    int numero;
    cout << "Digite um número inteiro: ";
    cin >> numero;

    tabuada(numero);
    return 0;
}