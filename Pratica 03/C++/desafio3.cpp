#include <iostream>
using namespace std;

int main() {
    float soma = 0, nota;

    for (int i = 1; i <= 5; i++) {
        cout << "Digite a nota " << i << ": ";
        cin >> nota;
        soma += nota;
    }

    float media = soma / 5;
    cout << "Média final: " << media << endl;

    return 0;
}