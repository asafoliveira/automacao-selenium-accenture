$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EnterInsurantData.feature");
formatter.feature({
  "name": "Preencher os dados pessoais",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@PreencherDadosPessoais"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Preencher os dados pessoais do usuario com sucesso",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@PreencherDadosPessoaisSucesso"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "que o usuario esteja acessando a pagina de inserir dados pessoais",
  "keyword": "Dado "
});
formatter.step({
  "name": "for preenchido o campo First Name com \"\u003cfirstName\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "for preenchido o campo Last Name \"\u003clastName\u003e\"",
  "keyword": "E "
});
formatter.step({
  "name": "for preenchido o campo Date of Birth com \u003cdate\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "for selecionada a opcao Male no campo Gender",
  "keyword": "E "
});
formatter.step({
  "name": "for preenchido o campo Street Address com \u003cstreetAdress\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "for acionado o campo Country",
  "keyword": "E "
});
formatter.step({
  "name": "for selecionada a opcao Brazil",
  "keyword": "E "
});
formatter.step({
  "name": "for preenchido o campo Zip Code com \"\u003czipCode\u003e\"",
  "keyword": "E "
});
formatter.step({
  "name": "for preenchido o campo City com \u003ccity\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "for acionado o campo Occupation",
  "keyword": "E "
});
formatter.step({
  "name": "for selecionada a opcao employee",
  "keyword": "E "
});
formatter.step({
  "name": "forem selecionadas todas as opcoes do campo Hobbies",
  "keyword": "E "
});
formatter.step({
  "name": "for preenchido o campo Website com \"\u003cwebsite\u003e\"",
  "keyword": "E "
});
formatter.step({
  "name": "for acionado o segundo botao Next",
  "keyword": "E "
});
formatter.step({
  "name": "o sistema direciona o usuario para a tela de inserir dados do produto",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "date",
        "streetAdress",
        "zipCode",
        "city",
        "website"
      ]
    },
    {
      "cells": [
        "Tester",
        "Automation",
        "\"07/25/2005\"",
        "\"Rua Automacao, Av da Qualidade\"",
        "9876",
        "\"Belém do Pará\"",
        "QAccenture.will"
      ]
    },
    {
      "cells": [
        "Accenture",
        "Challenge",
        "\"08/25/1953\"",
        "\"Rua 123 Teste 456\"",
        "87654321",
        "\"Goianésia\"",
        "QAccenture123.will.co.br.ds.te.ty"
      ]
    },
    {
      "cells": [
        "QA",
        "PL",
        "\"10/07/2000\"",
        "\"Rua\"",
        "0000",
        "\"Cidade123\"",
        "QA.co/teste/automacao/asaf"
      ]
    },
    {
      "cells": [
        "manutencao",
        "sistemica",
        "\"08/10/1953\"",
        "\"Rua 123, Av 456, \u0026%$@#\"",
        "99999999",
        "\"Cidade123@$\"",
        "ca.te"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Preencher os dados pessoais do usuario com sucesso",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@PreencherDadosPessoais"
    },
    {
      "name": "@PreencherDadosPessoaisSucesso"
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
  "name": "que o usuario esteja acessando a pagina de inserir dados pessoais",
  "keyword": "Dado "
});
formatter.match({
  "location": "EnterInsurantDataSteps.queOUsuarioEstejaAcessandoAPaginaDeInserirDadosPessoais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo First Name com \"Tester\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoFirstNameCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Last Name \"Automation\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Date of Birth com \"07/25/2005\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoDateOfBirthCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Male no campo Gender",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoMaleNoCampoGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Street Address com \"Rua Automacao, Av da Qualidade\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoStreetAddressCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Country",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOCampoCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Brazil",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoBrazil()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Zip Code com \"9876\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoZipCodeCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo City com \"Belém do Pará\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoCityCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Occupation",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOCampoOccupation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao employee",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoEmployee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "forem selecionadas todas as opcoes do campo Hobbies",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.foremSelecionadasTodasAsOpcoesDoCampoHobbies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Website com \"QAccenture.will\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoWebsiteCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o segundo botao Next",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOSegundoBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema direciona o usuario para a tela de inserir dados do produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "EnterInsurantDataSteps.oSistemaDirecionaOUsuarioParaATelaDeInserirDadosDoProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Preencher os dados pessoais do usuario com sucesso",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@PreencherDadosPessoais"
    },
    {
      "name": "@PreencherDadosPessoaisSucesso"
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
  "name": "que o usuario esteja acessando a pagina de inserir dados pessoais",
  "keyword": "Dado "
});
formatter.match({
  "location": "EnterInsurantDataSteps.queOUsuarioEstejaAcessandoAPaginaDeInserirDadosPessoais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo First Name com \"Accenture\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoFirstNameCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Last Name \"Challenge\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Date of Birth com \"08/25/1953\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoDateOfBirthCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Male no campo Gender",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoMaleNoCampoGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Street Address com \"Rua 123 Teste 456\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoStreetAddressCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Country",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOCampoCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Brazil",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoBrazil()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Zip Code com \"87654321\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoZipCodeCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo City com \"Goianésia\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoCityCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Occupation",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOCampoOccupation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao employee",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoEmployee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "forem selecionadas todas as opcoes do campo Hobbies",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.foremSelecionadasTodasAsOpcoesDoCampoHobbies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Website com \"QAccenture123.will.co.br.ds.te.ty\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoWebsiteCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o segundo botao Next",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOSegundoBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema direciona o usuario para a tela de inserir dados do produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "EnterInsurantDataSteps.oSistemaDirecionaOUsuarioParaATelaDeInserirDadosDoProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Preencher os dados pessoais do usuario com sucesso",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@PreencherDadosPessoais"
    },
    {
      "name": "@PreencherDadosPessoaisSucesso"
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
  "name": "que o usuario esteja acessando a pagina de inserir dados pessoais",
  "keyword": "Dado "
});
formatter.match({
  "location": "EnterInsurantDataSteps.queOUsuarioEstejaAcessandoAPaginaDeInserirDadosPessoais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo First Name com \"QA\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoFirstNameCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Last Name \"PL\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Date of Birth com \"10/07/2000\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoDateOfBirthCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Male no campo Gender",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoMaleNoCampoGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Street Address com \"Rua\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoStreetAddressCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Country",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOCampoCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Brazil",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoBrazil()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Zip Code com \"0000\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoZipCodeCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo City com \"Cidade123\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoCityCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Occupation",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOCampoOccupation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao employee",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoEmployee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "forem selecionadas todas as opcoes do campo Hobbies",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.foremSelecionadasTodasAsOpcoesDoCampoHobbies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Website com \"QA.co/teste/automacao/asaf\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoWebsiteCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o segundo botao Next",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOSegundoBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema direciona o usuario para a tela de inserir dados do produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "EnterInsurantDataSteps.oSistemaDirecionaOUsuarioParaATelaDeInserirDadosDoProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Preencher os dados pessoais do usuario com sucesso",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@PreencherDadosPessoais"
    },
    {
      "name": "@PreencherDadosPessoaisSucesso"
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
  "name": "que o usuario esteja acessando a pagina de inserir dados pessoais",
  "keyword": "Dado "
});
formatter.match({
  "location": "EnterInsurantDataSteps.queOUsuarioEstejaAcessandoAPaginaDeInserirDadosPessoais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo First Name com \"manutencao\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoFirstNameCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Last Name \"sistemica\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Date of Birth com \"08/10/1953\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoDateOfBirthCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Male no campo Gender",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoMaleNoCampoGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Street Address com \"Rua 123, Av 456, \u0026%$@#\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoStreetAddressCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Country",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOCampoCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Brazil",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoBrazil()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Zip Code com \"99999999\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoZipCodeCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo City com \"Cidade123@$\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoCityCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Occupation",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOCampoOccupation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao employee",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forSelecionadaAOpcaoEmployee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "forem selecionadas todas as opcoes do campo Hobbies",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.foremSelecionadasTodasAsOpcoesDoCampoHobbies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for preenchido o campo Website com \"ca.te\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forPreenchidoOCampoWebsiteCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o segundo botao Next",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.forAcionadoOSegundoBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema direciona o usuario para a tela de inserir dados do produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "EnterInsurantDataSteps.oSistemaDirecionaOUsuarioParaATelaDeInserirDadosDoProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
});