matriz_A = []
matriz_B = []
matriz_C = []

print("Digite 20 valores para A:")
for i in range(20):
    valor = float(input(f"A[{i}]: "))
    matriz_A.append(valor)

print("\nDigite 20 valores para B:")
for i in range(20):
    valor = float(input(f"B[{i}]: "))
    matriz_B.append(valor)

for i in range(20):
    matriz_C.append(matriz_A[i] - matriz_B[i])

print("Matriz C (A - B):")
print(matriz_C)