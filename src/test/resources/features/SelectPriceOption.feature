#language: pt
#encoding: UTF-8

@SelecaoDeOpcoesDePreco
Funcionalidade: Preencher os meus dados pessoais

	@SelecionarOpcoesDePrecoSucessoOpcaoSilver @SmokeTest
	Cenario: Selecionar Opcoes de Preco com Sucesso opcao Silver
		Dado que o usuario esteja acessando a tela de Selecao de Opcoes de Preco
		Quando for selecionada a Opcao Silver no campo Select Option
		E for acionado o quarto botao Next
		Entao o sistema direciona o usuario para a tela de enviar comentarios 
		
	@SelecionarOpcoesDePrecoSucessoOpcaoGold @SmokeTest	
	Cenario: Selecionar Opcoes de Preco com Sucesso opcao Gold
		Dado que o usuario esteja acessando a tela de Selecao de Opcoes de Preco
		Quando for selecionada a Opcao Gold no campo Select Option
		E for acionado o quarto botao Next
		Entao o sistema direciona o usuario para a tela de enviar comentarios 
		
	@SelecionarOpcoesDePrecoSucessoOpcaoPlatinum @SmokeTest	
	Cenario: Selecionar Opcoes de Preco com Sucesso opcao Platinum
		Dado que o usuario esteja acessando a tela de Selecao de Opcoes de Preco
		Quando for selecionada a Opcao Platinum no campo Select Option
		E for acionado o quarto botao Next
		Entao o sistema direciona o usuario para a tela de enviar comentarios 
		
	@SelecionarOpcoesDePrecoSucessoOpcaoUltimate @SmokeTest	
	Cenario: Selecionar Opcoes de Preco com Sucesso opcao Ultimate
		Dado que o usuario esteja acessando a tela de Selecao de Opcoes de Preco
		Quando for selecionada a Opcao Ultimate no campo Select Option
		E for acionado o quarto botao Next
		Entao o sistema direciona o usuario para a tela de enviar comentarios  
		
	@NaoSelecionarOpcaoDePreco @SmokeTest	
	Cenario: Selecionar Opcoes de Preco com Sucesso opcao Ultimate
		Dado que o usuario esteja acessando a tela de Selecao de Opcoes de Preco
		Quando nao for selecionada uma Opcao de Preco
		Entao o sistema nao direciona o usuario para a tela de enviar comentarios
		