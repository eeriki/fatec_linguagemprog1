#include <iostream>
#include <vector>
using namespace std;

int main() {

    vector<vector<string>> produtos;

    while (true) {
        cout << "\n----MENU----" << endl;
        cout << "1 - Adicionar produto" << endl;
        cout << "2 - Listar produtos" << endl;
        cout << "3 - Sair" << endl;

        string opcao;
        cout << "Escolha uma opção: ";
        cin >> opcao;

        if (opcao == "1") {
            string nome;
            int quant;
            float preco;

            cout << "Nome do produto: ";
            cin >> nome;

            cout << "Quantidade em estoque: ";
            cin >> quant;

            cout << "Preço unitário: R$ ";
            cin >> preco;

            if (quant < 0) {
                cout << "ERRO: quantidade não pode ser negativa." << endl;
            } else {
                vector<string> produto = {
                    nome,
                    to_string(quant),
                    to_string(preco)
                };

                produtos.push_back(produto);
                cout << "Produto cadastrado com sucesso!" << endl;
            }

        } else if (opcao == "2") {
            cout << "\n----ESTOQUE----" << endl;

            for (int i = 0; i < produtos.size(); i++) {
                cout << "Produto: " << produtos[i][0]
                     << " | Qtd: " << produtos[i][1]
                     << " | R$ " << produtos[i][2] << endl;
            }

        } else if (opcao == "3") {
            cout << "Saindo do sistema..." << endl;
            break;

        } else {
            cout << "Opção inválida!" << endl;
        }
    }

    return 0;
}