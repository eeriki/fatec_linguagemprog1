#include <iostream>
using namespace std;

int main() {
    float valor, desc;
    cout << "Digite o valor do produto: ";
    cin >> valor;
    cout << "Digite o desconto (%): ";
    cin >> desc;

    float final = valor - (valor * desc / 100);
    cout << "O valor final é: R$ " << final;

    return 0;
}