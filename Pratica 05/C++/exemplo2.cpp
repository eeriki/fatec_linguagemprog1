#include <iostream>
using namespace std;

void calcular_e_exibir_media(double nota1, double nota2) {
    double media = (nota1 + nota2) / 2;
    cout << "A média é: " << media << endl;
}
int main() {
    calcular_e_exibir_media(7.5, 8.0);
    calcular_e_exibir_media(6.0, 9.0);
    return 0;
}