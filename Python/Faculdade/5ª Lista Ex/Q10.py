quantidade = int(input('Tamanho da lista: '))
lista = [0] * quantidade
for i in range(quantidade):
    lista[i] = int(input('Digite um numero inteiro: '))

valores = []
repetidos = set()
for i in lista:
    if i not in valores:
        valores.append(i)
    else:
        repetidos.add(i)

print(valores, repetidos)
