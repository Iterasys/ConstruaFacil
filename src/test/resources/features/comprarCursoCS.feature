#language: pt
Funcionalidade: Comprar Curso CS
  Cenario: Pesquisar Curso com Clique e Incluir no Carrinho
    Dado que acesso o site da Iterasys
    Quando pesquiso por "Mantis"
    E clico na Lupa
    Entao vejo a lista de resultados para o curso "Mantis"
    Quando clico em Matricule-se
    Entao confirmo o nome do curso como "Mantis" e o preco de "R$ 49,99"

  Cenario: Pesquisar Curso com Enter e Incluir no Carrinho
    Dado que acesso o site da Iterasys
    Quando pesquiso por "Mantis"
    E pressiono Enter
    Entao vejo a lista de resultados para o curso "Mantis"
    Quando clico em Matricule-se
    Entao confirmo o nome do curso como "Mantis" e o preco de "R$ 49,99"

  Esquema do Cenario: Pesquisar Curso com Enter e Incluir no Carrinho
    Dado que acesso o site da Iterasys
    Quando pesquiso por <curso>
    E pressiono Enter
    Entao vejo a lista de resultados para o curso <curso>
    Quando clico em Matricule-se
    Entao confirmo o nome do curso como <curso> e o preco de <preco>
    Exemplos:
      | curso               |  preco      |
      | "Mantis"            | "R$ 49,99"  |
      | "Preparatório CTFL" | "R$ 169,00" |

    Cenario: Ver Detalhes de Um Curso
      Dado que acesso o site da Iterasys
      E clico no botao Ok do popup da LGPD
      Quando clico na imagem de um curso
      Entao vejo a pagina com detalhes do curso
