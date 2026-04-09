#include <iostream>
using namespace std;

int main() {
    string nome;
    int idade;

    cout << "Digite o nome: ";
    cin >> nome;
    cout << "Digite a idade: ";
    cin >> idade;

    cout << "Bem-vindo " << nome << ", você tem " << idade << " anos!";

    return 0;
}