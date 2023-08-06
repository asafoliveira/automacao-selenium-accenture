$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EnterProductData.feature");
formatter.feature({
  "name": "Preencher os meus dados pessoais",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@implementar"
    }
  ]
});
formatter.scenario({
  "name": "Preencher os dados do produto com sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@implementar"
    },
    {
      "name": "@PreencherDadosDoProdutoComSucesso"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario esteja acessando a tela de Preencher Dados do Produto",
  "keyword": "Dado "
});
formatter.match({
  "location": "EnterProductDataSteps.queOUsuarioEstejaAcessandoATelaDePreencherDadosDoProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o botao do campo Start Date",
  "keyword": "Quando "
});
formatter.match({
  "location": "EnterProductDataSteps.forAcionadoOBotaoDoCampoStartDate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o botao de avancar um mes no calendario",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forAcionadoOBotaoDeAvancarUmMesNoCalendario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a data Vinte e Nove de Setembro de Dois Mil e Vinte e Tres",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forSelecionadaADataVinteENoveDeSetembroDeDoisMilEVinteETres()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Insurance Sum",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forAcionadoOCampoInsuranceSum()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Quinze Milhoes",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forSelecionadaAOpcaoQuinzeMilhoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Merit Rating",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forAcionadoOCampoMeritRating()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Malus Doze",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forSelecionadaAOpcaoMalusDoze()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Damage Insurance",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forAcionadoOCampoDamageInsurance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Partial Coverage",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forSelecionadaAOpcaoPartialCoverage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "forem seleciondas as todas as opcoes do campo Optional Products",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.foremSeleciondasAsTodasAsOpcoesDoCampoOptionalProducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o campo Courtesy Car",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forAcionadoOCampoCourtesyCar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for selecionada a opcao Yes",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forSelecionadaAOpcaoYes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "for acionado o terceiro botao Next",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.forAcionadoOTerceiroBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema me direciona para a tela de Opcoes de selecao de Preco",
  "keyword": "Entao "
});
formatter.match({
  "location": "EnterProductDataSteps.oSistemaMeDirecionaParaATelaDeOpcoesDeSelecaoDePreco()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});