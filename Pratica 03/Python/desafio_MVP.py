produtos = []

while True:
    print("----MENU----")
    print("1 - Adicionar produto")
    print("2 - Listar produtos")
    print("3 - Sair")

    opcao = input("Escolha uma opção: ")

    if opcao == "1":
        nome_prod = input("Nome do produto: ")
        quant_est = int(input("Quantidade em estoque: "))
        preco_unit = float(input("Preço unitário: R$ "))

        if quant_est < 0:
            print("ERRO: A quantidade não pode ser um valor negativo. Por favor, tente novamente.")
        else:
            produto = {
                "nome": nome_prod,
                "quantidade": quant_est,
                "preco": preco_unit
            }

        produtos.append(produto)
        print("Produto cadastrado com sucesso!")

    elif opcao == "2":
        print("----ESTOQUE----")
        for i in produtos:
            print(f"Produto: {i['nome']} | Qtd: {i['quantidade']} | R$ {i['preco']:.2f}")

    elif opcao == "3":
        print("Saindo do sistema...")
        break

    else:
        print("Opção inválida!")