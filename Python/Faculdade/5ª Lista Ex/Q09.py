quantidade = int(input('Tamanho de uma lista: '))
lista1 = [0] * quantidade
pares = []
impares = []
for i in range(quantidade):
    lista1[i] = int(input('Digite um numero inteiro seu corno: '))
    if (lista1[i] % 2) == 0:
        pares.append(lista1[i])
    elif lista1[i] == 0:
        print('Esse numero é nulo')
    else:
        impares.append(lista1[i])
print(f'Os impares são {impares} e os pares são {pares}')