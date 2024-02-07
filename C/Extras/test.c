

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
  char nome[40];
  char telefone[15];
  char celular[15];
  char email[40];
  struct cadastro *prox;
} cadastro;

cadastro *cria_agenda() { return NULL; }

cadastro *insere_contato(cadastro *lista, char nome[40], char telefone[15],
                         char celular[15], char email[40]) {
  cadastro *novo = (cadastro *)malloc(sizeof(cadastro));

  strcpy(novo->nome, nome);
  strcpy(novo->telefone, telefone);
  strcpy(novo->celular, celular);
  strcpy(novo->email, email);
  novo->prox = lista;
  return novo;
}
cadastro *lista_contatos(cadastro *lista) {
  cadastro *p = lista;

  while (p != NULL) {
    printf("\nNome: %s ", p->nome);
    printf("\nTelefone: %s ", p->telefone);
    printf("\nCelular: %s ", p->celular);
    printf("\nEmail: %s\n", p->email);
    p = p->prox;
  }
}

cadastro *busca_contato (cadastro* lista, char nome[40]){
  cadastro* p;
  for (p = lista; p != NULL; p = p->prox) {
    if (strcmp(p->nome, nome) == 0){
      return p;
    }
  }
  return NULL;
}

cadastro *lista_retira(cadastro* lista, char nome[40]){
  cadastro* a = NULL; 
  cadastro* p = lista; 
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

int main(void) {
  char pessoa[40];
  char numte[15];
  char numce[15];
  char email[40];
  cadastro *lista;
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
      printf("Insira seu nome: ");
      setbuf(stdin, NULL);
      scanf("%[^\n]", pessoa);
      printf("Insira seu telefone: "); 
      setbuf(stdin, NULL);
      scanf("%[^\n]", numte);
      printf("Insira seu celular: ");
      setbuf(stdin, NULL);
      scanf("%[^\n]", numce);
      printf("Insira seu email: ");
      setbuf(stdin, NULL);
      scanf("%[^\n]", email);
      lista = insere_contato(lista, pessoa, numte, numce, email);
    } else if (op == 2) {
      printf("\nA lista de contatos:\n");
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
    arquivo = fopen("ArquivoSalvo.txt","wb");
    cadastro *aux = lista;
    while (aux!=NULL){
      fwrite(aux, sizeof(cadastro), 1, arquivo);
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
