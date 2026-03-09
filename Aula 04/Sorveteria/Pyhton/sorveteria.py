# Regra: quantidade em estoque não pode ser negativa


# funçao que pergunta e valida quantidade em estoque
def perguntaQuantidade():

    # Solicitação (entrada)
    quantidade_produto = int(input("Quantidade do produto em estoque: "))

    # Validação
    if(quantidade_produto < 0):
        print("Erro: A quantidade não pode ser um valor negativo. Por favor, tente novamente.")
        perguntaQuantidade();

    return quantidade_produto

# declaração
nome_produto = str(input("Digite o nome do produto: "))
quantidade_produto = perguntaQuantidade()
preco_unitario = float(input("Digite o preço do produto: "))

