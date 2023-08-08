#language: pt
#encoding: UTF-8
@PreencherDadosVeiculo
Funcionalidade: Preencher os dados do veiculo

  @PreencherDadosVeiculoComSucesso @SmokeTest
  Esquema do Cenario: Preencher dados do veiculo com sucesso
    Dado que o usuario acione o campo Make
    Quando for selecionada a Opcao Audi
    E for acionado o campo Model
    E for selecionada a opcao Scooter
    E for preenchido o campo Cylinder Capacity com "<cylinderCapacity>"
    E for preenchido o campo engine performance com "<enginePerformance>"
    E for acionado o botao do campo Date of Manufacture
    E for acionado o botao de voltar um mes no calendario
    E for selecionada a data um de julho de dois mil e vinte e tres
    E for acionado o primeiro campo Number of Seats
    E for selecionada a opcao um
    E for selecionada a opcao Yes no campo Right Hand Drive
    E for acionado o segundo campo Number of Seats
    E for selecionada a primeira opcao
    E for acionado o campo Fuel Type
    E for selecionada a opcao Petrol
    E for preenchido o campo Payload com "<payload>"
    E for preenchido o campo Total Weight com "<totalWeight>"
    E for preenchido o campo List Price com "<listPrice>"
    E for preenchido o campo License Plate Number com <licensePlate>
    E for preenchido o campo Annual Mileage com "<annualMileage>"
    E for acionado o primeiro botao Next
    Entao o sistema direciona o usuario para a tela de inserir dados pessoais

    Exemplos: 
      | cylinderCapacity | enginePerformance | payload | totalWeight | listPrice | licensePlate | annualMileage |
      |                1 |              1000 |       1 |           1 |       100 | "12345"      |           100 |
      |             2000 |              1999 |     581 |         472 |     25000 | "PlacaNum"   |         33333 |
      |             1999 |              2000 |     999 |         999 |     49999 | "@#$%(&)!?;" |         99999 |
      |             1000 |                 1 |    1000 |        1000 |     50000 | "Teste123@$" |        100000 |

  @PreencherDadosVeiculoValoresIncorretos @SmokeTest
  Esquema do Cenario: Preencher dados do veiculo com valores incorretos
    Dado que o usuario nao preencha os campos de dropdown e radio da pagina
    Quando for preenchido o campo Cylinder Capacity com "<cylinderCapacity>"
    E for preenchido o campo engine performance com "<enginePerformance>"
    E for preenchido o campo Payload com "<payload>"
    E for preenchido o campo Total Weight com "<totalWeight>"
    E for preenchido o campo List Price com "<listPrice>"
    E for preenchido o campo License Plate Number com <licensePlate>
    E for preenchido o campo Annual Mileage com "<annualMileage>"
    E for acionado o primeiro botao Next
    Entao o sistema nao direciona o usuario para a tela de inserir dados pessoais

    Exemplos: 
      | cylinderCapacity | enginePerformance | payload | totalWeight | listPrice | licensePlate   | annualMileage |
      |                0 |            222222 |       0 |          99 |       499 | "TesteTamanho" |            99 |
      |             2001 |              2001 |    1001 |       50001 |    100001 | "123456789010" |        100001 |
      |            20000 |             20000 |   28957 |      499999 |    777777 | "!!!???###&&&" |      50000000 |
      |           222222 |                 0 | 2000000 |     5000000 |  50000000 | "Teste123@$!"  |             7 |

  @NãoPreencherDadosVeiculo @SmokeTest
  Cenario: Nao preencher os dados do veiculo
    Dado que o usuario nao preencha os dados do veiculo
    Quando for acionado o primeiro botao Next
    Entao o sistema nao direciona o usuario para a tela de inserir dados pessoais
