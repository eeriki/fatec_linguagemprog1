#include <iostream> // Biblioteca para entrada e saída de dados
#include <iomanip> // Biblioteca para formatar a saída de casas decimais
using namespace std;

int main(){
    // Passo 1: Declaração de variáveis (Tipagem Estática)
    int numero1 = 0, numero2 = 0, soma, subtracao, multiplicacao;
    float divisao;

    // Passo 2: Entrada de dados
    cout << "Digite o primeiro número: "; cin >> numero1;
    cout << "Digite o segundo número: "; cin >> numero2;

    // Passo 3: Processamento (Cálculos Aritméticos)
    soma = numero1 + numero2;
    subtracao = numero1 - numero2;
    multiplicacao = numero1 * numero2;
    divisao = numero1 / numero2;

    // Passo 4: Saída de resultados formatados
    cout << fixed << setprecision(2);
    cout << "Soma: " << soma << endl;
    cout << "Subtração: " << subtracao << endl;
    cout << "Multiplicação: " << multiplicacao << endl;
    cout << "Divisão: " << divisao << endl;

    return 0; // Indica que o programa terminou com sucesso
}
