lista = [0]*10
pares = 0
qunt_list = len(lista)
for i in range(qunt_list):
    lista[i] = int(input('Digite um numero inteiro'))
    if (lista[i] % 2) == 0:
        pares = pares + 1
print(f'Sua lista possui {qunt_list} valores e {pares} deles são pares')