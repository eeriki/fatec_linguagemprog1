# Regra: quantidade em estoque não pode ser negativa

# funçao que pergunta e valida quantidade em estoque
def perguntaQuantidade():

    # Solicitação (entrada)
    quantidade = int(input("Quantidade do produto em estoque: "))

    # Validação
    if(quantidade< 0):
        print("Erro: A quantidade não pode ser um valor negativo. Por favor, tente novamente.")
        perguntaQuantidade();

    return quantidade

# declaração variáveis
nome_produto = str(input("Digite o nome do produto: "))
quantidade_produto = perguntaQuantidade()
preco_unitario = float(input("Digite o preço do produto: "))

# saída
print()
print("-=" * 13)
print(f"""Nome: {nome_produto}
Quantidade em estoque: {quantidade_produto}
Preço Unitário: R${preco_unitario:.2f}""")
print("-=" * 13)