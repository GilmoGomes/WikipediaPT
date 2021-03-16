
 # Funcionalidade: Consulta
    #Cenario: Consulta Ovo de Pascoa
    #Dado que acesso o Wikipedia em Portugues
    #Quando pesquiso por "Ovo de Páscoa"
    #Entao Exibe a expressao "Ovo de Páscoa" no titulo da guia



Feature:  Consulta
  Scenario: Consulta Ovo de Pascoa
    Given que acesso o Wikipedia em Portugues
    When pesquiso por "Ovo de Páscoa"
    Then Exibe a expressao "Ovo de Páscoa" no titulo da guia
