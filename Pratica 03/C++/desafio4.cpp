#include <iostream>
using namespace std;

int main() {

    int numero_secreto = 7;
    int palpite = 0;

    while (palpite != numero_secreto) {
        cout << "Adivinhe o número: ";
        cin >> palpite;

        if (palpite > numero_secreto) {
            cout << "Tente um número menor!" << endl;
        } else if (palpite < numero_secreto) {
            cout << "Tente um número maior!" << endl;
        }
    }

    cout << "Parabéns! Você acertou!" << endl;

    return 0;
}