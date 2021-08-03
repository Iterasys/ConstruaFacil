Feature: Comprar Curso POEN
  Scenario: Pesquisar Curso com Clique e Incluir no Carrinho POEN
    Given que acesso o site da Iterasys  POEN
    When pesquiso por "Mantis" POEN
    And clico na Lupa POEN
    Then vejo a lista de resultados para o curso "Mantis" POEN
    Given clico em Matricule-se POEN
    Then confirmo o nome do curso como "Mantis" e o preco de "R$ 49,99" POEN