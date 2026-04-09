#include <iostream>
using namespace std;

int contar(string texto) {
    int cont = 0;
    for (char c : texto) {
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            cont++;
    }
    return cont;
}

int main() {
    string texto;
    cout << "Digite um texto: ";
    cin >> texto;

    cout << "Vogais: " << contar(texto);
    return 0;
}