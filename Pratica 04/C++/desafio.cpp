#include <iostream>
using namespace std;

int main() {
    string nomes_insumos[3];
    int quantidades[3];

    for (int i = 0; i < 3; i++) {
        cout << "Digite o nome do produto " << (i + 1) << ": ";
        cin >> nomes_insumos[i];

        cout << "Digite a quantidade de " << nomes_insumos[i] << ": ";
        cin >> quantidades[i];
    }

    cout << "---- RELATORIO ----";

    for (int i = 0; i < 3; i++) {
        if (quantidades[i] < 5) {
            cout << "\nProduto: " << nomes_insumos[i]
                 << " | Estoque: " << quantidades[i]
                 << " [REPOSICAO NECESSARIA]";
        } else {
            cout << "\nProduto: " << nomes_insumos[i]
                 << " | Estoque: " << quantidades[i] << " unidades";
        }
    }

    return 0;
}