#language: pt
#encoding: UTF-8

@PreencherDadosProduto
Funcionalidade: Preencher os dados do produto

	@PreencherDadosProdutoComSucesso @SmokeTest
	Cenario: Preencher os dados do produto com sucesso
		Dado que o usuario esteja acessando a tela de preencher dados do produto
		Quando for acionado o botao do campo Start Date
		E for acionado o botao de avancar um mes no calendario
		E for selecionada a data Vinte e Nove de Setembro de Dois Mil e Vinte e Tres
		E for acionado o campo Insurance Sum
		E for selecionada a opcao Quinze Milhoes
		E for acionado o campo Merit Rating
		E for selecionada a opcao Malus Doze
		E for acionado o campo Damage Insurance
		E for selecionada a opcao Partial Coverage
		E forem seleciondas as todas as opcoes do campo Optional Products
		E for acionado o campo Courtesy Car
		E for selecionada a opcao Yes
		E for acionado o terceiro botao Next
		Entao o sistema me direciona para a tela de Opcoes de selecao de Preco
		
	@NãoPreencherDadosProduto @SmokeTest
  Cenario: Nao preencher os dados do produto
  	Dado que o usuario esteja acessando a tela de preencher dados do produto
    E que o usuario nao preencha os dados do produto
    Quando for acionado o terceiro botao Next
    Entao o sistema nao direciona o usuario para a tela de selecao de opcoes de preco