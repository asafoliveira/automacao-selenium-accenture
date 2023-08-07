#language: pt
#encoding: UTF-8
@PreencherDadosPessoais
Funcionalidade: Preencher os dados pessoais

  @PreencherDadosPessoaisSucesso @SmokeTest
  Esquema do Cenario: Preencher os dados pessoais do usuario com sucesso
    Dado que o usuario esteja acessando a pagina de inserir dados pessoais
    Quando for preenchido o campo First Name com "<firstName>"
    E for preenchido o campo Last Name "<lastName>"
    E for preenchido o campo Date of Birth com <date>
    E for selecionada a opcao Male no campo Gender
    E for preenchido o campo Street Address com <streetAdress>
    E for acionado o campo Country
    E for selecionada a opcao Brazil
    E for preenchido o campo Zip Code com "<zipCode>"
    E for preenchido o campo City com <city>
    E for acionado o campo Occupation
    E for selecionada a opcao employee
    E forem selecionadas todas as opcoes do campo Hobbies
    E for preenchido o campo Website com "<website>"
    E for acionado o segundo botao Next
    Entao o sistema direciona o usuario para a tela de inserir dados do produto

    Exemplos: 
      | firstName  | lastName   | date         | streetAdress                     | zipCode  | city            | website                           |
      | Tester     | Automation | "07/25/2005" | "Rua Automacao, Av da Qualidade" |     9876 | "Belém do Pará" | QAccenture.will                   |
      | Accenture  | Challenge  | "08/25/1953" | "Rua 123 Teste 456"              | 87654321 | "Goianésia"     | QAccenture123.will.co.br.ds.te.ty |
      | QA         | PL         | "10/07/2000" | "Rua"                            |     0000 | "Cidade123"     | QA.co/teste/automacao/asaf        |
      | manutencao | sistemica  | "08/10/1953" | "Rua 123, Av 456, &%$@#"         | 99999999 | "Cidade123@$"   | ca.te                             |

  @PreencherDadosPessoaisValoresIncorretos @SmokeTest
  Esquema do Cenario: Preencher os dados pessoais do usuario com valores incorretos
    Dado que o usuario esteja acessando a pagina de inserir dados pessoais
    E que o usuario nao preencha os campos de dropdown, radio e checkbox da pagina
    Quando for preenchido o campo First Name com <firstName>
    E for preenchido o campo Last Name <lastName>
    E for preenchido o campo Date of Birth com <date>
    E for preenchido o campo Street Address com <streetAdress>
    E for preenchido o campo Zip Code com "<zipCode>"
    E for preenchido o campo City com <city>
    E for preenchido o campo Website com "<website>"
    E for acionado o segundo botao Next
    Entao o sistema nao direciona o usuario para a tela de inserir dados do produto 

    Exemplos: 
      | firstName    | lastName      | date         | streetAdress     | zipCode   | city                      | website            |
      | "A"          | "Z"           | "08/07/2023" | "Dado Incorreto" |       123 | "https://url.com.br"      | siteFuncional      |
      | "12345678"   | "87654321"    | "12/29/2070" | "96547546"       | 987654321 | "A"                       | siteFuncional123.c |
      | "!@*($)_%"   | "@&*#$¨%)"    | "25/08/53"   | "$$$%%%!!!"      | ABC123    | "!!!!!!!!!!!!"            | site/funcional     |
      | "Teste123@$" | "Testou@1234" | "08/10/1952" | "a² + 2ab + b²"  | ABC123@$  | "2x² - y + 87 = 3y² - 42" | site@funcional     |

  @NãoPreencherDadosPessoais @SmokeTest
  Cenario: Nao preencher os dados pessoais
  	Dado que o usuario esteja acessando a pagina de inserir dados pessoais
    E que o usuario nao preencha os dados pessoais
    Quando for acionado o segundo botao Next
    Entao o sistema nao direciona o usuario para a tela de inserir dados do produto     