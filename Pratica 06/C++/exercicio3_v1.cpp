#include <iostream>
using namespace std;

int main() {
    string senha = "";

    while (senha.length() < 8) {
        cout << "Digite uma senha: ";
        cin >> senha;
    }

    cout << "Senha válida!";
    return 0;
}