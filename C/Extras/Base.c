#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
  char nome[40];
  char telefone[15];
  char celular[15];
  char email[40];
  struct contato *jun;
}
 contato;

contato *cria_agenda() {
   return NULL;

   }

contato *insere_contato(contato *lista, char nome[40], char telefone[15], char celular[15], char email[40]){
  contato *n = (contato *)malloc(sizeof(contato));

  printf("Insira seu Nome: ");
  setbuf(stdin, NULL);
  scanf("%[^\n]", nome);

  printf("Insira seu telefone: "); 
  setbuf(stdin, NULL);
  scanf("%[^\n]", telefone);

  printf("Insira seu celular: ");
  setbuf(stdin, NULL);
  scanf("%[^\n]", celular);
  
  printf("Insira seu email: ");
  setbuf(stdin, NULL);
  scanf("%[^\n]", email);

  strcpy(n->nome, nome);
  strcpy(n->telefone, telefone);
  strcpy(n->celular, celular);
  strcpy(n->email, email);
  n->jun = lista;
  return n;
}
contato *lista_contatos(contato *lista) {
  contato *s = lista;
  printf("\nA lista de contatos:\n");

  while (s != NULL) {
    printf("\nNome: %s ", s->nome);
    printf("\nTelefone: %s ", s->telefone);
    printf("\nCelular: %s ", s->celular);
    printf("\nEmail: %s\n", s->email);
    s = s->jun;
  }
}

contato *busca_contato (contato* lista, char nome[40]){
  contato* s;
  for (s = lista; s != NULL; s = s->jun) {
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
    s = s->jun;
  }

  if (s == NULL){
    return lista;
  }

  if (r == NULL){
    lista = s->jun;
    free(s);
  }

  else{
    r->jun = s->jun; 
    free(s);
  }

  return lista;
}

int main(void) {
  char pessoa[40];
  char tel[15];
  char cel[15];
  char email[40];
  contato *lista;
  int a = 1;
  lista = cria_agenda();
  while (a != 99) { 

    printf("\nAgenda Telefica v0.1 by Gabzin, Aniekoi e Rotape\n----------\n\nDigite o numero correspondente a sua opção: \n\n");
    printf("[1] - Inserir contato\n");
    printf("[2] - Listar contatos\n");
    printf("[3] - Buscar contato\n");
    printf("[4] - Deletar contato\n");
    printf("[5] - Salvar como arquivo.txt\n");
    printf("[99] - Sair\n\n");
    printf ("\n----------\n");
    printf("Sua opção: ");
    scanf("%d", &a);

     switch(a){
      case 1:
        
      lista = insere_contato(lista, pessoa, tel, cel, email);

      case 2:
        
      lista_contatos(lista);

      case 3:
        
      char nome[40];
      printf("Digite o nome que deve ser encontrado: ");
      scanf("%s",nome);
      if(busca_contato(lista, nome)==NULL){
        printf("\nContato não encontrado.\n");
        }
      else{
        printf("\nContato encontrado.\n");
      }

     case 4:
       
        char nome[40];
        printf("Informe o contato que será apagado: ");
        scanf("%s", nome);
        lista = lista_retira(lista, nome);
        printf("Contato apagado.");
        lista_contatos(lista);
    case 5:
      
    FILE *arquivo;
    arquivo = fopen("ArquivoSalvo.txt","wb");
    contato *aux = lista;
    while (aux!=NULL){
      fwrite(aux, sizeof(contato), 1, arquivo);
      aux = aux->jun;
     }
    printf("\nO arquivo foi salvo com sucesso!\n");
    
     case 99:
    printf("\n\tSaindo...");
        break;
            default:
            printf("Opção inválida!");

    }
  }

  return 0;
}
