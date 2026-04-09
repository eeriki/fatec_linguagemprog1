#include <iostream>
using namespace std;

int main() {
    int quantidade;
    cout << "Digite a quantidade em estoque: ";
    cin >> quantidade;

    //usando a estrutura 'if'
    if (quantidade < 5) {
        cout << "AVISO: O estoque deste produto está baixo!" << endl;
    }
    
    return 0;
}