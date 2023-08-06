#language: pt
#encoding: UTF-8

@PreencherDadosPessoais
Funcionalidade: Preencher os dados pessoais

	@PreencherDadosPessoaisComSucesso @SmokeTest
	Cenario: Enter Insurant Data Sucessfuly
		Dado que o usuario esteja acessando a pagina de Inserir Dados Pessoais
		Quando for preenchido o campo First Name com "Tester"
		E for preenchido o campo Last Name "Automation"
		E for preenchido o campo Date of Birth com "08/25/1990"
		E for selecionada a opcao Male no campo Gender
		E for preenchido o campo Street Address com "Rua Automação, Av da Qualidade"
		E for acionado o campo Country 
		E for selecionada a opcao Brazil
		E for preenchido o campo Zip Code com "35537667"
		E for preenchido o campo City com "Itapecuru"
		E for acionado o campo Occupation 
		E for selecionada a opcao Employee	
		E forem selecionadas todas as opcoes do campo Hobbies 
		E for preenchido o campo website com "QAccenture.com"
		E for acionado o segundo botao Next
		Entao o sistema direciona o usuario para a tela Enter Product Data
		