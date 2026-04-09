#include <iostream>
using namespace std;

int main() {
    int nota;
    cout << "Digite a nota de 0 a 100: ";
    cin >> nota;

    if (nota >= 90 and nota <= 100) cout << "A";
    else if (nota >= 80 and nota < 90) cout << "B";
    else if (nota >= 70 and nota < 80) cout << "C";
    else if (nota >= 60 and nota < 70) cout << "D";
    else if (nota >= 0 and nota < 60) cout << "E";
    else cout << "Nota inválida!";

    return 0;
}