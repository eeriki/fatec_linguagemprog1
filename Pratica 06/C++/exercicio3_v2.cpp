#include <iostream>
using namespace std;

bool validar(string senha) {
    return senha.length() >= 8;
}

int main() {
    string senha = "";

    while (!validar(senha)) {
        cout << "Digite uma senha: ";
        cin >> senha;
    }

    cout << "Senha válida!";
    return 0;
}