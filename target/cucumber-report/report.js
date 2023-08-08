$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SendQuote.feature");
formatter.feature({
  "name": "enviar comentarios",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@EnviarComentarios"
    }
  ]
});
formatter.scenarioOutline({
  "name": "enviar comentarios com sucesso",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@EnviarComentariosComSucesso"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "que o usuario esteja acessando a tela de enviar comentarios",
  "keyword": "Dado "
});
formatter.step({
  "name": "for preenchido o campo e-mail com \u003cemail\u003e",
  "keyword": "Quando "
});
formatter.step({
  "name": "for preenchido o campo Phone com \u003cphone\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "for preencido o campo Username com \u003cusername\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "for preencido o campo Password com \u003cpassword\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "for preencido o campo Confirm Password com \u003cconfirmPassword\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "for preencido o campo Comments com \u003ccomments\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "for acionado o ultimo Botao Send",
  "keyword": "E "
});
formatter.step({
  "name": "o sistema exibe a mensagem de e-mail enviado com sucesso",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "email",
        "phone",
        "username",
        "password",
        "confirmPassword",
        "comments"
      ]
    },
    {
      "cells": [
        "\"automacaotestes@mail.com\"",
        "\"12345678\"",
        "\"AsafQAccenture\"",
        "\"senhaForte123@$\"",
        "\"senhaForte123@$\"",
        "\"Comentarios adicionados\""
      ]
    },
    {
      "cells": [
        "\"%texto%@teste.te\"",
        "\"123456789012345\"",
        "\"AsafQAccenture123\"",
        "\"Test3!\"",
        "\"Test3!\"",
        "\"Comentarios adicionados123\""
      ]
    },
    {
      "cells": [
        "\"12345@teste.te\"",
        "\"00000000\"",
        "\"underscore_teste\"",
        "\"userName7\u0026\"",
        "\"userName7\u0026\"",
        "\"Comentarios adicionados123@$\""
      ]
    },
    {
      "cells": [
        "\"asd123@d#at.co\"",
        "\"999999999999999\"",
        "\"a___\"",
        "\"!@#Aa1\"",
        "\"!@#Aa1\"",
        "\"TestesAutomatizadosJava12345!@#$%\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "enviar comentarios com sucesso",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@EnviarComentarios"
    },
    {
      "name": "@EnviarComentariosComSucesso"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario esteja acessando a tela de enviar comentarios",
  "keyword": "Dado "
});
formatter.match({
  "location": "SendQuoteSteps.queOUsuarioEstejaAcessandoATelaDeEnviarComentarios()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo e-mail com \"automacaotestes@mail.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "SendQuoteSteps.forPreenchidoOCampoEMailCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Phone com \"12345678\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreenchidoOCampoPhoneCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preencido o campo Username com \"AsafQAccenture\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreencidoOCampoUsernameCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preencido o campo Password com \"senhaForte123@$\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreencidoOCampoPasswordCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preencido o campo Confirm Password com \"senhaForte123@$\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreencidoOCampoConfirmPasswordCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preencido o campo Comments com \"Comentarios adicionados\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreencidoOCampoCommentsCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o ultimo Botao Send",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forAcionadoOUltimoBotaoSend()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe a mensagem de e-mail enviado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "SendQuoteSteps.oSistemaExibeAMensagemDeEMailEnviadoComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "enviar comentarios com sucesso",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@EnviarComentarios"
    },
    {
      "name": "@EnviarComentariosComSucesso"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario esteja acessando a tela de enviar comentarios",
  "keyword": "Dado "
});
formatter.match({
  "location": "SendQuoteSteps.queOUsuarioEstejaAcessandoATelaDeEnviarComentarios()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo e-mail com \"%texto%@teste.te\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "SendQuoteSteps.forPreenchidoOCampoEMailCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Phone com \"123456789012345\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreenchidoOCampoPhoneCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preencido o campo Username com \"AsafQAccenture123\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreencidoOCampoUsernameCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preencido o campo Password com \"Test3!\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreencidoOCampoPasswordCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preencido o campo Confirm Password com \"Test3!\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreencidoOCampoConfirmPasswordCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preencido o campo Comments com \"Comentarios adicionados123\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forPreencidoOCampoCommentsCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o ultimo Botao Send",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.forAcionadoOUltimoBotaoSend()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe a mensagem de e-mail enviado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "SendQuoteSteps.oSistemaExibeAMensagemDeEMailEnviadoComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "enviar comentarios com sucesso",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@EnviarComentarios"
    },
    {
      "name": "@EnviarComentariosComSucesso"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
