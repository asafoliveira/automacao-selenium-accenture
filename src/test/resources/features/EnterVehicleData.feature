#language: pt
#encoding: UTF-8

@PreencherDadosProduto
Funcionalidade: Preencher os dados do produto 

	@PreencherDadosVeículoSucesso @SmokeTest
	Cenario: Preencher dados do veiculo com sucesso
		Dado que o usuario acione o campo Make
		Quando for selecionada a Opcao Audi
		E for acionado o campo Model
		E for selecionada a opcao Scooter
		E for preenchido o campo Cylinder Capacity com "1000"
		E for preenchido o campo Engine Performance com "1999"
		E for acionado o botao do campo Date of Manufacture 
		E for acionado o botao de voltar um mes no calendario
		E for selecionada a data um de julho de dois mil e vinte e tres
		E for acionado o primeiro campo Number of seats
		E for selecionada a opcao um
		E for selecionada a opcao Yes no campo Right Hand Drive
		E for acionado o segundo campo Number of seats
		E for selecionada a primeira opcao
		E for acionado o campo Fuel Type
		E for selecionada a opcao Petrol
		E for preenchido o campo Payload com "200"
		E for preenchido o campo Total Weight com "500"
		E for preenchido o campo List Price com "35000"
		E for preenchido o campo License Plate Number com "K@3!90"
		E for preenchido o campo Annual Mileage com "70000"
		E for acionado o primeiro botao Next 
		Entao o sistema direciona o usuario para a tela Enter Insurance Data   
		