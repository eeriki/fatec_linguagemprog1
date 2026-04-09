nomes_insumos = []
quantidades = []

for i in range(3):
    nome = input(f"Digite o nome do produto {i+1}: ")
    qtd = int(input(f"Digite a quantidade de {nome}: "))

    nomes_insumos.append(nome)
    quantidades.append(qtd)

print("---- RELATÓRIO DE ESTOQUE ----")

for i in range(3):
    if quantidades[i] < 5:
        print(f"Produto: {nomes_insumos[i]} | Estoque: {quantidades[i]} unidades [REPOSIÇÃO NECESSÁRIA]")
    else:
        print(f"Produto: {nomes_insumos[i]} | Estoque: {quantidades[i]} unidades")