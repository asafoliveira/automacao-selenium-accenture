#language: pt
#encoding: UTF-8

@EnterInsurantData
Funcionalidade: Preencher os meus dados pessoais

	@PreencherDadosPessoaisComSucesso
	Cenario: Enter Insurant Data Sucessfuly
		Dado que eu esteja acessando a pagina de Enter Insurant Data
		Quando eu preencher o campo First Name com "Tester123$%"
		E eu preeencher o campo Last Name "Automation456[]"
		E preencher o campo Date of Birth com "08/25/1990"
		E selecionar a opcao Male no campo Gender
		E preencher o campo Street Address com "Rua Automação, Av da Qualidade"
		E acionar o campo Country 
		E selecionar a opcao Brazil
		E preencher o campo Zip Code com "35537667"
		E preencher o campo City com "Itapecuru"
		E acionar o campo Occupation 
		E selecionar a opcao Employee	
		E selecionar todas as opcoes do campo Hobbies 
		E preencher o campo website com "QAccenture.com"
		E acionar o segundo botao Next
		Entao o sistema me direciona para a tela Enter Product Data
		