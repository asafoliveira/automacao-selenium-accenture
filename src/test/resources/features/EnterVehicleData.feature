#language: pt
#encoding: UTF-8

@EnterVehicleData
Funcionalidade: Preencher os dados do meu veiculo 

	@PreencherDadosDoVeículoComSucesso
	Cenario: Enter Vehicle Data Sucessfuly
		Dado que eu acione o campo Make
		Quando eu selecionar a Opcao Audi
		E acionar o campo Model
		E selecionar a opcao Scooter
		E preencher o campo Cylinder Capacity com "1000"
		E preencher o campo Engine Performance com "1999"
		E acionar o botao do campo Date of Manufacture 
		E acionar o botao de voltar um mes no calendario
		E selecionar a data um de julho de dois mil e vinte e tres
		E acionar o primeiro campo Number of seats
		E escolher a opcao um
		E escolher a opcao Yes no campo Right Hand Drive
		E acionar o segundo campo Number of seats
		E selecionar a primeira opcao
		E acessar o campo Fuel Type
		E selecionar a opcao Petrol
		E preencher o campo Payload com "200"
		E preencher o campo Total Weight com "500"
		E preencher o campo List Price com "35000"
		E preencher o campo License Plate Number com "K@3!90"
		E preencher o campo Annual Mileage com "70000"
		E acionar o primeiro botao Next 
		Entao o sistema me direciona para a tela Enter Insurance Data   
		