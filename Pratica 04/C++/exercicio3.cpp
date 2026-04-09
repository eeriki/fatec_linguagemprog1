#include <iostream>
using namespace std;

int main() {
    int matriz_A[15], matriz_B[15];

    cout << "Digite 15 números:\n";
    for (int i = 0; i < 15; i++) {
        cin >> matriz_A[i];
    }

    for (int i = 0; i < 15; i++) {
        matriz_B[i] = matriz_A[i] * matriz_A[i];
    }

    cout << "Matriz A:\n";
    for (int i = 0; i < 15; i++) {
        cout << matriz_A[i] << " ";
    }

    cout << "Matriz B: ";
    for (int i = 0; i < 15; i++) {
        cout << matriz_B[i] << " ";
    }

    return 0;
}