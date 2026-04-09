#include <iostream>
#include <vector>

int main() {
    //Em C++, usamos o 'std::vector' para uma lista dinâmica
    std::vector<int> quadrados;

    //Laço 'for' para percorrer os números de 15 a 200
    for (int i = 15; i <= 200; i++) {
        int quadrado = i * i;
        quadrados.push_back(quadrado);
    }

    //Apresentar os resultados usando p laço 'for'
    std::cout << "Quadrados dos números de 15 a 200:" << std::endl;
    for (int i = 0; i < quadrados.size(); i++) {
        std::cout << "O quadrado do número " << (i + 15) << " é " << quadrados[i] << std::endl;
    }

    return 0;
}