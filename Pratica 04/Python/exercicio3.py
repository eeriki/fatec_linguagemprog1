matriz_A = []
matriz_B = []

print("Digite 15 números inteiros:")
for i in range(15):
    valor = int(input(f"matriz_ A[{i}]: "))
    matriz_A.append(valor)

for i in range(15):
    matriz_B.append(matriz_A[i] ** 2)

print("Matriz A:", matriz_A)
print("Matriz B (quadrados):", matriz_B)