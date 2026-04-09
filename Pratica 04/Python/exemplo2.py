#Usamos 'list' para representar as matrizes (vetores)
matriz_A = []
matriz_B = []

print("--- Preenchendo a Matriz A ---")
for i in range(15):
    while True:
        try:
            elemento = int(input(f"Digite o {i + 1}º elemento para a Matriz A: "))
            matriz_A.append(elemento)
            break
        except ValueError:
            print("Entrada inválida. Por favor, digite um número inteiro.")

#Construir a Matriz B com os quadrados de A
for elemento_a in matriz_A:
    matriz_B.append(elemento ** 2)

#Apresentar os resultados
print("\nMatriz A:")
print(matriz_A) 

print("\nMatriz B (Quadrados da Matriz A):")
print(matriz_B)