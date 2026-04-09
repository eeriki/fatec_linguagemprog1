def exibir_menu():
    print("-" * 30)
    print("     SORVETERIA     ")
    print("-" * 30)

def verificar_estoque_critico(qtd):
    if qtd < 5:
        return "[REPOSIÇÃO NECESSÁRIA]"
    else:
        return ""

nomes_insumos = []
quantidades = []

for i in range(3):
    nome = input(f"Digite o nome do produto {i+1}: ")
    qtd = int(input(f"Digite a quantidade de {nome}: "))

    nomes_insumos.append(nome)
    quantidades.append(qtd)

exibir_menu()

for i in range(3):
    aviso = verificar_estoque_critico(quantidades[i])
    
    print(f"Produto: {nomes_insumos[i]} | Estoque: {quantidades[i]} unidades {aviso}")