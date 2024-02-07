/*
Questão 2(Agenda Telefonica) - Exercicio Listas encadeadas
Alunos: Gabriel Menezes Soares; João Pedro Souza Costa;
Turma: Manhã
Diciplina: Programação I
Professor: Pablo
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
  char nome[40];
  char telefone[15];
  char celular[15];
  char email[40];
  struct contato *junt;
}
contato;

int leitor();
contato *cria_agenda();
contato *insere_contato(contato *lista, char nome[40], char telefone[15], char celular[15], char email[40]);
contato *lista_contatos(contato *lista);
contato *busca_contato (contato* lista, char nome[40]);
contato *lista_retira(contato* lista, char nome[40]);


int main(void) {
  char pessoa[40];
  char tel[15];
  char cel[15];
  char email[40];
  contato *lista;
  lista = cria_agenda();
  int alternativa;
  while (alternativa != 6) { 

    printf("\nAgenda Telefonica v0.1 by (Gabzin, Aniekoi e Rotape) \n\n---------------------------------------------------- \n");
    printf("[1] - Adcionar contato.\n");
    printf("[2] - Listar contatos.\n");
    printf("[3] - Buscar contato.\n");
    printf("[4] - Salvar Agenda.\n");
    printf("[5] - Apagar contato.\n");
    printf("[6] - Sair...\n\n");
    printf("---------------------------------------------------- \n\n");

    alternativa = leitor();

    if (alternativa == 1) {
      lista = insere_contato(lista, pessoa, tel, cel, email);
    }

    else if (alternativa == 2){
      lista_contatos(lista);
    }

     else if (alternativa == 3){
      char nome[40];

      printf("Digite o nome que deve ser encontrado(Exato): ");
      scanf("%s",nome);

      if(busca_contato(lista, nome)==NULL){
        printf("\nContato não encontrado... ;-; \n");
        }

      else{
        printf("\nContato encontrado! :D \n");
      }
    }

    else if (alternativa==4){

      FILE *arquivo;
      arquivo = fopen("ArquivoSalvo.txt","wb");
      contato *aux = lista;

      while (aux!=NULL){
        fwrite(aux, sizeof(contato), 1, arquivo);
        aux = aux->junt;
      }

    printf("\nO arquivo foi salvo!\n");

    }

     else if(alternativa==5){
        char nome[40];

        printf("Informe um contato a ser apagado: ");
        scanf("%s", nome);

        lista = lista_retira(lista, nome);

        printf("Contato apagado com sucesso.");
        lista_contatos(lista);
     }

    else if (alternativa==6){
      printf("\n\tSaindo...");

    }
    else{
      printf("Opção inválida!");

      break;
    }

  }

  return 0;
}

int leitor(){
    int opcao;

    printf("\n\tOpção escolhida: ");
    scanf("%d", &opcao);
    setbuf(stdin, NULL);

    return opcao;
}

contato *cria_agenda() {
   return NULL;

   }

contato *insere_contato(contato *lista, char nome[40], char telefone[15], char celular[15], char email[40]){

  contato *new = (contato *)malloc(sizeof(contato));

  printf("Insira o nome: ");
  setbuf(stdin, NULL);
  scanf("%[^\n]", nome);

  printf("Insira o telefone: "); 
  setbuf(stdin, NULL);
  scanf("%[^\n]", telefone);

  printf("Insira o celular: ");
  setbuf(stdin, NULL);
  scanf("%[^\n]", celular);

  printf("Insira o email: ");
  setbuf(stdin, NULL);
  scanf("%[^\n]", email);

  strcpy(new->nome, nome);
  strcpy(new->telefone, telefone);
  strcpy(new->celular, celular);
  strcpy(new->email, email);
  new->junt = lista;

  printf("\nContato adcionado com sucesso!\n\n");
  return new;
}

contato *lista_contatos(contato *lista){
  contato *s = lista;
  printf("\n---LISTA DE CONTATOS---\n");

  while (s != NULL) {
    printf("\nNome: %s ", s->nome);
    printf("\nTelefone: %s ", s->telefone);
    printf("\nCelular: %s ", s->celular);
    printf("\nEmail: %s\n", s->email);
    s = s->junt;
  }
}

contato *busca_contato (contato* lista, char nome[40]){
  contato* s;
  for (s = lista; s != NULL; s = s->junt) {
    if (strcmp(s->nome, nome) == 0){
      return s;
    }
  }
  return NULL;
}

contato *lista_retira(contato* lista, char nome[40]){
  contato* r = NULL; 
  contato* s = lista; 
  while ((s != NULL) && strcmp(s->nome, nome)!=0){
    r = s;
    s = s->junt;
  }
  if (s == NULL){
    return lista;
  }
  if (r == NULL){
    lista = s->junt;
    free(s);
  } else {
    r->junt = s->junt; 
    free(s);
  }
  
  return lista;
}