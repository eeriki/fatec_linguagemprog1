// Programa para calculo do ROI

// ROI = ((Ganho - Investimento)/Investimento)*100

#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    // Declaração das variáveis
    int ganho = 0, investimento = 0;
    float roi;

    // Entradas
    cout << " --- Simulador Financeiro (C++) --- " << endl;
    
    cout << "Informe o Ganho: "; cin >> ganho;
    cout << "Informe o Investimento: "; cin >> investimento;
    
    // bloqueio para caso o investimento = 0, evita erros de calculo
     if (investimento == 0){
        cout << "Investimento não pode ser igual a zero" << endl;
        return 0;
    }

    // Processamento
    roi = ((ganho - investimento) / investimento) * 100;

    // Saída
    cout << "Resultado = " << roi << endl;

    return 0;
}