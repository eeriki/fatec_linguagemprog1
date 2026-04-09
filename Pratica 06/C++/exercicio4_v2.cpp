#include <iostream>
using namespace std;

string mensagem(string nome, int idade) {
    return "Bem-vindo " + nome + ", você tem " + to_string(idade) + " anos!";
}

int main() {
    string nome;
    int idade;

    cout << "Digite o nome: ";
    cin >> nome;
    cout << "Digite a idade: ";
    cin >> idade;

    cout << mensagem(nome, idade);

    return 0;
}