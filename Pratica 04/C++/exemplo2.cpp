#include <iostream>
#include <vector>

int main(){
    //Usamos 'std::vector' para representar os vetores
    std::vector<int> matriz_A(15);
    std::vector<int> matriz_B(15);

    std::cout << "--- Preenchendo a matriz A ---" << std::endl;
    for(int i = 0; i < 15; i++){
        while (true) {
            std::cout << "Digite o " << i + 1 << "o elemento para a matriz A: ";
            if (std::cin >> matriz_A[i]) {
                break;
            } else {
                std::cout << "Entrada inválida. Por favor, digite um número inteiro." << std::endl;
                std::cin.clear();
                std::cin.ignore(10000, '\n');
            }
        }
    }

    //Construir a Matriz B com os quadrados de A
    for(int i = 0; i < 15; i++){
        matriz_B[i] = matriz_A[i] * matriz_A[i];
    }

    //Apresentar os resultados
    std::cout << "\n--- Matriz A ---" << std::endl;
    for (int elemento : matriz_A) {
        std::cout << elemento << " ";
    }
    std::cout << std::endl;

    std::cout << "\n--- Matriz B (Quadrados de A) ---" << std::endl;
    for (int elemento : matriz_B) {
        std::cout << elemento << " ";
    }
    std::cout << std::endl;
    return 0;
}