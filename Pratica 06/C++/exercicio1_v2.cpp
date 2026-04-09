#include <iostream>
using namespace std;

void verificarPar(int num) {
    if (num % 2 == 0)
        cout << "Par";
    else
        cout << "Ímpar";
}

int main() {
    int n;
    cout << "Digite um número inteiro: ";
    cin >> n;
    verificarPar(n);
    return 0;
}