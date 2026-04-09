#include <iostream>
using namespace std;

int main() {
    int matriz_A[8] = {2, 4, 6, 8, 10, 12, 14, 16};
    int matriz_B[8];

    for (int i = 0; i < 8; i++) {
        matriz_B[i] = matriz_A[i] * 3;
    }

    cout << "Matriz B: ";
    for (int i = 0; i < 8; i++) {
        cout << matriz_B[i] << " ";
    }

    return 0;
}