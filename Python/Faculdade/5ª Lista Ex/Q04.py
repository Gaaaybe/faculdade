valor = [0] * 3
maior = max(valor)
m_pos = 0
for i in range(len(valor)):
    valor[i] = int(input('Digite um valor inteiro: '))
    maior = max(valor)
    if valor[i] == maior:
        m_pos = i
print(f'Seus valores são {valor}, o maior é {maior} e sua posição é {m_pos+1}.')
