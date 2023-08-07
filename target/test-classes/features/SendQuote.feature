#language: pt
#encoding: UTF-8

@EnviarComentarios
Funcionalidade: Preencher os meus dados pessoais

	@EnviarComentariosComSucesso @SmokeTest
	Cenario: Selecionar Opcoes de Preco com Sucesso opcao Silver
		Dado que o usuario esteja acessando a tela de enviar comentarios
		Quando for preenchido o campo e-mail com "automacaotestes@mail.com"
		E for preenchido o campo Phone com "1234567890"
		E for preencido o campo Username com "AsafQAccenture"
		E for preencido o campo Password com "senhaForte123@"
		E for preencido o campo Confirm Password com "senhaForte123@"
		E for preencido o campo Comments com "Comentarios adicionados"
		E for acionado o ultimo Botao Send 
		Entao o sistema exibe a mensagem de e-mail enviado com sucesso