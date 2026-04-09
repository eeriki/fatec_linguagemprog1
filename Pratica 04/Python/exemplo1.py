#Em Python, usamos a 'list' para armazenar os números.
quadrados = []

#Laço 'for' para percorrer os números de 15 a 200
for numero in range(15, 201):
    quadrado = numero ** 2
    quadrados.append(quadrado)

#Apresentar os resultados usando outro laço 'for'   
print ("Quadrados dos números de 15 a 200:")
for i in range(len(quadrados)):
    print(f"O quadrado do número {i + 15} é {quadrados[i]}")