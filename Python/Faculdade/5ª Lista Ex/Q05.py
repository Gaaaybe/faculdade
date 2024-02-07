quant = 3
gabarito = [0]*quant

for i in range(quant):
    print('Questão', i+1,':')
    gabarito[i] = input()
quant_alunos = int(input('Quantos alunos? '))

for i in range(quant_alunos):
    print('Aluno', i+1)
    gaba_aluno = [0] * quant
    for i2 in range(quant):
         print('Questão', i2+1,':')
         gaba_aluno[i2] = input()
         acertos = 0
         for i3 in range(quant):
            if gaba_aluno[i3] == gabarito[i3]:
                acertos = acertos + 1
    print(f'Aluno {i+1}, acertou {acertos} questões ')