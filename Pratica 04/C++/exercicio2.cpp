#include <iostream>
using namespace std;

int main() {
    double A[20], B[20], C[20];

    cout << "Digite os valores de A:";
    for (int i = 0; i < 20; i++) {
        cin >> A[i];
    }

    cout << "Digite os valores de B:";
    for (int i = 0; i < 20; i++) {
        cin >> B[i];
    }

    for (int i = 0; i < 20; i++) {
        C[i] = A[i] - B[i];
    }

    cout << "Matriz C: ";
    for (int i = 0; i < 20; i++) {
        cout << C[i] << " ";
    }

    return 0;
}