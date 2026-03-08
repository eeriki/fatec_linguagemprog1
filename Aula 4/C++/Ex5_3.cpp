# include <iostream>
using namespace std;

int main() {
    int quantidade;
    cout << "Digite a quantidade em estoque: ";
    cin >> quantidade;

    // Usando a estutura 'if'
    if (quantidade < 5) {
        cout << "AVISO: O estoque deste produto está baixo!" << endl;
    } else {
        cout << "Estoque OK." << endl;
    }

    return 0;
}