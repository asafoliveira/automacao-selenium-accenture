#language: pt
#encoding: UTF-8
@EnviarComentarios
Funcionalidade: enviar comentarios

  @EnviarComentariosComSucesso @SmokeTest
  Esquema do Cenario: enviar comentarios com sucesso
    Dado que o usuario esteja acessando a tela de enviar comentarios
    Quando for preenchido o campo e-mail com <email>
    E for preenchido o campo Phone com <phone>
    E for preencido o campo Username com <username>
    E for preencido o campo Password com <password>
    E for preencido o campo Confirm Password com <confirmPassword>
    E for preencido o campo Comments com <comments>
    E for acionado o ultimo Botao Send
    Entao o sistema exibe a mensagem de e-mail enviado com sucesso

    Exemplos: 
      | email                      | phone             | username            | password          | confirmPassword   | comments                            |
      | "automacaotestes@mail.com" | "12345678"        | "AsafQAccenture"    | "senhaForte123@$" | "senhaForte123@$" | "Comentarios adicionados"           |
      | "%texto%@teste.te"         | "123456789012345" | "AsafQAccenture123" | "Test3!"          | "Test3!"          | "Comentarios adicionados123"        |
      | "12345@teste.te"           | "00000000"        | "underscore_teste"  | "userName7&"      | "userName7&"      | "Comentarios adicionados123@$"      |
      | "asd123@d#at.co"           | "999999999999999" | "a___"              | "!@#Aa1"          | "!@#Aa1"          | "TestesAutomatizadosJava12345!@#$%" |

  @EnviarComentariosDadosIncorretos @SmokeTest
  Esquema do Cenario: enviar comentarios com valores incorretos nos campos
    Dado que o usuario esteja acessando a tela de enviar comentarios
    Quando for preenchido o campo e-mail com <email>
    E for preenchido o campo Phone com <phone>
    E for preencido o campo Username com <username>
    E for preencido o campo Password com <password>
    E for preencido o campo Confirm Password com <confirmPassword>
    E for preencido o campo Comments com <comments>
    E for acionado o ultimo Botao Send
    Entao o sistema informa o usuario que ha dados pendentes de preenchimento

    Exemplos: 
      | email                | phone              | username         | password          | confirmPassword  | comments                            |
      | "usuario123@"        | "1234567"          | "AsafQAccenture" | "senhaCerta123@$" | "senhaNao123@$"  | "Comentarios adicionados"           |
      | "usuario123@user.u"  | "1234567890123456" | "asaf.oliveira"  | "senhaSegura123"  | "senhaSegura123" | "Comentarios adicionados123"        |
      | "usario123@mail"     | "0000000"          | "_QAccenture"    | "@#Aa1"           | "@#Aa1"          | "Comentarios adicionados123@$"      |
      | "1#24$%&3@5@mail.co" | "9999999999999999" | "a__"            | "!@#Aa1"          | "!@#Aa1"         | "TestesAutomatizadosJava12345!@#$%" |

  @ValidarLimiteCaracteresCampoEmail @ComponentTest
  Cenario: Validar limite de caracteres do campo email
    Dado que o usuario esteja acessando a tela de enviar comentarios
    Quando for preenchido o campo email com um texto maior que trezentos caracteres "@mail.co"
    Entao o sistema informa que o campo email esta ok

  @ValidarLimiteCaracteresCampoUsername @ComponentTest
  Cenario: Validar limite de caracteres do campo Username
    Dado que o usuario esteja acessando a tela de enviar comentarios
    Quando for preenchido o campo Username com um texto maior que trinta e dois caracteres ""
    Entao o sistema exibe a mensagem de erro do campo Username

  @ValidarLimiteCaracteresCampoPassword @ComponentTest
  Cenario: Validar limite de caracteres do campo Password
    Dado que o usuario esteja acessando a tela de enviar comentarios
    Quando for preenchido o campo Password com um texto maior que trezentos caracteres "Teste123@"
    Entao o sistema informa que o campo Password esta ok

  @ValidarLimiteCaracteresCampoConfirmPassword @ComponentTest
  Cenario: Validar limite de caracteres do campo Confirm Password
    Dado que o usuario esteja acessando a tela de enviar comentarios
    Quando for preenchido o campo Confirm Password com um texto maior que trezentos caracteres "Teste123@"
    Entao o sistema informa que o campo Confirm Password esta ok

  @ValidarLimiteCaracteresCampoComments @ComponentTest
  Cenario: Validar limite de caracteres do campo Username
    Dado que o usuario esteja acessando a tela de enviar comentarios
    Quando for preenchido o campo Comments com um texto maior que trezentos caracteres "Comentario"
    Entao o sistema informa que o campo Comments esta ok
