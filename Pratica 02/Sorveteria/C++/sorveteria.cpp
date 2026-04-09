#include <iostream>
#include <iomanip>
using namespace std;

int perguntaQuantidade(){
    int quantidade;
    cout << "Quantidade deste produto em estoque: ";
    cin >> quantidade;
    // verifica se é negativo ou não
    if(quantidade < 0){
        cout << "Erro. A quantidade não pode ser um valor negativo. Por favor, tente novamente." << endl;

        return perguntaQuantidade();
    }

    return quantidade;
}

int main(){
    // Declaração variáveis
    string nome_produto;
    int quantidade_produto;
    float preco_unitario = 0;

    // Entradas
    cout << "Informe o nome do produto: "; cin >> nome_produto;
    quantidade_produto = perguntaQuantidade();
    cout << "Informe o preço unitário: "; cin >> preco_unitario;

    // Saídas
    cout << " ----- Informações do produto -----" << endl;
    cout << "Nome: " << nome_produto << endl;
    cout << "Quantidade em estoque: " << quantidade_produto << endl;
    cout << "Preço unitário: R$" << fixed << setprecision(2) << preco_unitario << endl;

    return 0;
}

