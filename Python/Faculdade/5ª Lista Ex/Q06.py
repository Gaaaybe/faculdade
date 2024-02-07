#Ler um vetor de 10 elementos. Crie um segundo vetor, com todos os elementos na
#ordem inversa, ou seja, o último elemento passará a ser o primeiro, o penúltimo 
#será o segundo e assim por diante. Imprima os dois vetores. 

vetor = [0] * 10 
rotev = [0] * 10
for i in range(10):
    vetor[i] = int(input('Insira um elemento: '))
print(vetor)
rotev = vetor.reverse()
print(vetor)
