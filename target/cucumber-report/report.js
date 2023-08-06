$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EnterInsurantData.feature");
formatter.feature({
  "name": "Preencher os meus dados pessoais",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@EnterInsurantData"
    }
  ]
});
formatter.scenario({
  "name": "Enter Insurant Data Sucessfuly",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@EnterInsurantData"
    },
    {
      "name": "@PreencherDadosPessoaisComSucesso"
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
  "name": "que eu esteja acessando a pagina de Enter Insurant Data",
  "keyword": "Dado "
});
formatter.match({
  "location": "EnterInsurantDataSteps.queEuEstejaAcessandoAPaginaDeEnterInsurantData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preencher o campo First Name com \"Tester123$%\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "EnterInsurantDataSteps.euPreencherOCampoFirstNameCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu preeencher o campo Last Name \"Automation456[]\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.euPreeencherOCampoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Date of Birth com \"08/25/1990\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencherOCampoDateOfBirthCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar a opcao Male no campo Gender",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.selecionarAOpcaoMaleNoCampoGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Street Address com \"Rua Automa��o, Av da Qualidade\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencherOCampoStreetAddressCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o campo Country",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.acionarOCampoCountry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar a opcao Brazil",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.selecionarAOpcaoBrazil()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Zip Code com \"35537667\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencherOCampoZipCodeCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo City com \"Itapecuru\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencherOCampoCityCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o campo Occupation",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.acionarOCampoOccupation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar a opcao Employee",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.selecionarAOpcaoEmployee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar todas as opcoes do campo Hobbies",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.selecionarTodasAsOpcoesDoCampoHobbies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo website com \"QAccenture.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencherOCampoWebsiteCom(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o segundo botao Next",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.acionarOSegundoBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema me direciona para a tela Enter Product Data",
  "keyword": "Entao "
});
formatter.match({
  "location": "EnterInsurantDataSteps.oSistemaMeDirecionaParaATelaEnterProductData()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});