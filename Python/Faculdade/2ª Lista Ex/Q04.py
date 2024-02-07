menor = float(input('Informe um valor de um produto: '))
for i in range (2):
    preço = float(input('Informe um valor de um produto: '))
    if preço < menor:
        menor = preço
print('O menor preço é', menor)