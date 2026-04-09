#include <iostream>
#include <string>

void exibirMenu() {
    std::cout << "---------------------------------" << std::endl;
    std::cout << "     MENU DE ESTOQUE     " << std::endl;
    std::cout << "---------------------------------" << std::endl;
    std::cout << "1. Adicionar novo produto" << std::endl;
    std::cout << "2. Listar produtos em estoque" << std::endl;
    std::cout << "3. Sair" << std::endl;
    std::cout << "---------------------------------" << std::endl;
}//Bloco da função encolhida

int main() {
    std::string nome_produto1 = "";
    int quant_produto1 = 0;
    double preco_produto1 = 0.0;
    bool rodando = true;

    while (rodando) {
        exibirMenu(); //Chamada da função
        //continuação do programa
    }
}