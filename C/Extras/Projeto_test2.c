#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
  char nome[40];
  char telefone[15];
  char celular[15];
  char email[40];
  struct contato *prox;
} contato;


contato *cria_agenda() {
   return NULL;

   }

contato *insere_contato(contato *lista, char nome[40], char telefone[15], char celular[15], char email[40]){
  contato *novo = (contato *)malloc(sizeof(contato));

  printf("Insira seu nome: ");
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

  strcpy(novo->nome, nome);
  strcpy(novo->telefone, telefone);
  strcpy(novo->celular, celular);
  strcpy(novo->email, email);
  novo->prox = lista;
  return novo;
}
contato *lista_contatos(contato *lista) {
  contato *p = lista;
  printf("\nA lista de contatos:\n");

  while (p != NULL) {
    printf("\nNome: %s ", p->nome);
    printf("\nTelefone: %s ", p->telefone);
    printf("\nCelular: %s ", p->celular);
    printf("\nEmail: %s\n", p->email);
    p = p->prox;
  }
}

contato *busca_contato (contato* lista, char nome[40]){
  contato* p;
  for (p = lista; p != NULL; p = p->prox) {
    if (strcmp(p->nome, nome) == 0){
      return p;
    }
  }
  return NULL;
}

contato *lista_retira(contato* lista, char nome[40]){
  contato* a = NULL; 
  contato* p = lista; 
  while ((p != NULL) && strcmp(p->nome, nome)!=0){
    a = p;
    p = p->prox;
  }
  if (p == NULL){
    return lista;
  }
  if (a == NULL){
    lista = p->prox;
    free(p);
  } else {
    a->prox = p->prox; 
    free(p);
  }
  
  return lista;
}

int leitor(){
    int opcao;

    printf("\n\tOpção escolhida: ");
    scanf("%d", &opcao);
    setbuf(stdin, NULL);

    return opcao;
}


int main(void) {
  char pessoa[40];
  char tel[15];
  char cel[15];
  char email[40];
  contato *lista;
  lista = cria_agenda();
  int op = 1;
  while (op != 6) { 

    printf("\n---MENU---\n\n");
    printf("1 - Inserir contato\n");
    printf("2 - Listar contatos\n");
    printf("3 - Buscar contato\n");
    printf("4 - Deletar contato\n");
    printf("5 - Salvar como arquivo.txt\n");
    printf("6 - Sair\n\n");
    printf("Digite uma opção: ");
    scanf("%d", &op);

    if (op == 1) {
      lista = insere_contato(lista, pessoa, tel, cel, email);

    } else if (op == 2) {
      lista_contatos(lista);

    } else if (op == 3){
      char nome[40];
      printf("Digite o nome que deve ser encontrado: ");
      scanf("%s",nome);
      if(busca_contato(lista, nome)==NULL){printf("\nContato não encontrado.\n");}
      else{
        printf("\nContato encontrado.\n");
      }
    } else if (op==4){
        char nome[40];
        printf("Informe o contato a ser deletado: ");
        scanf("%s", nome);
        lista = lista_retira(lista, nome);
        printf("Contato deletado.");
        lista_contatos(lista);
    }
     else if(op==5){
    FILE *arquivo;
    arquivo = fopen("ArquivoSalvo.txt","w+");
    contato *aux = lista;
    while (aux!=NULL){
      fwrite(aux, sizeof(contato), 1, arquivo);
      aux = aux->prox;
     }
    printf("\nO arquivo foi salvo!\n");
    }
    else if (op==6){
      
      break;
    }
  }

  return 0;
}