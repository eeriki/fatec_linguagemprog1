codigo_status = int(input("Digite o código de status: (1=Disponível, 2=Em reposição, 3=Descontinuado) "))

match codigo_status:
    case 1:
        print("Status: Disponível.")
    case 2:
        print("Status: Em reposição.")
    case 3:
        print("Status: Descontinuado")
    case _:
        print("Código de status inválido")