#include <iostream>
using namespace std;

void exibir_menu() {
    std::cout << "---------------------------------" << std::endl;
    std::cout << "     SORVETERIA     " << std::endl;
    std::cout << "---------------------------------" << std::endl;
}

void verificar_estoque(int quant) {
    if (quant < 5) {
        cout << " [REPOSICAO NECESSARIA]";
    } else {
        cout << " unidades";
    }
}

int main() {
    string nomes_insumos[3];
    int quantidades[3];

    for (int i = 0; i < 3; i++) {
        cout << "Digite o nome do produto " << (i + 1) << ": ";
        cin >> nomes_insumos[i];

        cout << "Digite a quantidade de " << nomes_insumos[i] << ": ";
        cin >> quantidades[i];
    }

    exibir_menu();

    for (int i = 0; i < 3; i++) {
        cout << "Produto: " << nomes_insumos[i] << " | Estoque: " << quantidades[i];
        verificar_estoque(quantidades[i]);
        cout << endl;
    }

    return 0;
}