#include <iostream>
#include <vector>
#include <string>

int main(){
    //Usamos o 'std::vector' para uma lista dinâmica de strings
    std::vector<std::string> matriz_A(10);

   std::cout << "--- Digite 10 nomes ---:" << std::endl;
   for (int i = 0; i < 10; i++) {
       std::cout << "Digite o " << i + 1 << "o nome: ";
       std::getline(std::cin, matriz_A[i]);
   }

   //Apresentar os nomes
   std::cout << "\n--- Nomes Inseridos ---" << std::endl;
   for (const auto& nome : matriz_A) {
       std::cout << nome << std::endl;
   }
   
    return 0;
}