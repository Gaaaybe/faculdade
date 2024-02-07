int main(void) {
float p1, p2, p3, media;
  
printf("Insira a prova 1: ");
scanf("%f",&p1);
  
printf("Insira a prova 2: ");
scanf("%f",&p2);
  
media = (p1+p2)/2;

if (media>=5&&p1>=3&&p2>=3){
  printf("Parabens voce foi aprovado seu inutil \n");

}
printf("media: %.2f",media);
  
  return 0;
}