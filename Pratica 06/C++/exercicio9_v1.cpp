#include <iostream>
using namespace std;

int main() {
    string texto;
    cout << "Digite um texto: ";
    cin >> texto;

    int cont = 0;

    for (char c : texto) {
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            cont++;
    }

    cout <<"Vogais: " << cont;
    return 0;
}