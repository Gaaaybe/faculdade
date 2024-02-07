def listas(l1,l2):
    l1 = [0] * quantidade
    l2 = []
    quantidade = input('Tamanho da lista:')
    for i in range(quantidade):
        l1[i] = int(input('Diga um valor seu corno: '))
    while i <= (quantidade/2):
        l2.append(l1[i])
    return l2

l1 = []
l2 = []
l2 = listas(l1,l2)


print(l2)