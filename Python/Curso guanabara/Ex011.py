from time import altzone


altura = float(input('Digite a altura da parede: '))
largura = float(input('Digite a largura da parede: '))
area = altura * largura
lit = area / 2
print(f'Sua parede tem {altura:.1f}x{largura:.1f} de dimensão e sua area é de {area:.1f}m²')
print(f'Para pintar tal area você irá precisar de {lit:.1f} litros de tinta')