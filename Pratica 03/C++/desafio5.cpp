#include <iostream>
using namespace std;

int main() {

    cout << "Digite o nome do usário: ";
    string nome;
    cin >> nome;
    string senha_correta = "senha123";
    string senha = "";

    while (senha != senha_correta) {
        cout << "Digite a senha: ";
        cin >> senha;
    }

    cout << "Bem-vindo, " << nome << "!" << endl;

    return 0;
}