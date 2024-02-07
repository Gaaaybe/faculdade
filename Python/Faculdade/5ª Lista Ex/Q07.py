lista1 = [1,2,3,4,5,6,7,8,9,0] 
lista2 = [11,12,13,14,15,16,17,18,19,20]
dif = [0] * 10
mult = [0] * 10
soma =[0] * 10
for i in range(10):
    dif[i] = lista1[i] - lista2[i]
    mult[i] = lista1[i] * lista2[i]
    soma[i] = lista1[i] + lista2[i]
print(dif, mult, soma)

