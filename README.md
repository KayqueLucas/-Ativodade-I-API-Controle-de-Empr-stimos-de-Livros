API de Controle de Empréstimos de Livros
========================================

Este projeto consiste na criação de uma API para controle de empréstimos de livros, desenvolvida em grupo conforme as especificações fornecidas.

Tecnologias Utilizadas
----------------------

*   Java
*   Spring Boot
*   Spring Data JPA
*   Flyway
*   Banco de Dados PostgreSQL

Configuração do Projeto
-----------------------

1.  O projeto inicial foi criado utilizando a ferramenta "initializr" disponível em [https://start.spring.io/](https://start.spring.io/). Certifique-se de escolher um nome único para o Artifact do projeto.
2.  As dependências utilizadas são as mesmas da API Biblioteca desenvolvida em conjunto nas aulas.
3.  Para gerenciamento da estrutura do banco de dados, foi utilizada a ferramenta Flyway, com os scripts disponíveis em [https://github.com/aopaixao/residencia\_api\_restful/tree/main/flyway](https://github.com/aopaixao/residencia_api_restful/tree/main/flyway).
4.  Certifique-se de criar um novo banco de dados diretamente no DBeaver e utilizar o Flyway para aplicar as migrações necessárias.

Modelagem de Dados
------------------

O banco de dados foi modelado considerando as seguintes regras de cardinalidade:

1.  **Aluno - Emprestimo:**
    
    *   1 Aluno pode realizar N Empréstimos.
    *   N Empréstimos podem ser realizados por 1 Aluno.
2.  **Emprestimo - Livro:**
    
    *   N Empréstimos podem ser realizados para 1 Livro.
    *   1 Livro pode estar em N Empréstimos.
3.  **Livro - Editora:**
    
    *   N Livros podem ser publicados por 1 Editora.
    *   1 Editora pode publicar N Livros.
4.  **Perfil - Usuario:**
    
    *   1 Perfil pode ser atribuído a N Usuários.
    *   N Usuários podem ser atribuídos a 1 Perfil.

Entrega do Trabalho
-------------------

O trabalho deverá ser entregue a partir do endereço do repositório Git de um dos membros de cada grupo. Todos os membros do Grupo deverão publicar o único link em questão no Google Classroom como entrega da atividade em questão.

Para quaisquer dúvidas ou problemas, entre em contato com \[nome do membro responsável pelo Git do grupo\].

* * *

_Este projeto foi desenvolvido como parte de uma atividade em grupo. Todos os direitos reservados._
