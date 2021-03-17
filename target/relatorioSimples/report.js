$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "comments": [
    {
      "line": 2,
      "value": "# Funcionalidade: Consulta"
    },
    {
      "line": 3,
      "value": "#Cenario: Consulta Ovo de Pascoa"
    },
    {
      "line": 4,
      "value": "#Dado que acesso o Wikipedia em Portugues"
    },
    {
      "line": 5,
      "value": "#Quando pesquiso por \"Ovo de Páscoa\""
    },
    {
      "line": 6,
      "value": "#Entao Exibe a expressao \"Ovo de Páscoa\" no titulo da guia"
    }
  ],
  "line": 10,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1708873800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Consulta Ovo de Pascoa",
  "description": "",
  "id": "consulta;consulta-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "que acesso o Wikipedia em Portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "pesquiso por \"Ovo de Páscoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Exibe a expressao \"Ovo de Páscoa\" no titulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoOWikipediaEmPortugues()"
});
formatter.result({
  "duration": 2101286500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 14
    }
  ],
  "location": "Post.pesquisoPor(String)"
});
formatter.result({
  "duration": 1291723900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 19
    }
  ],
  "location": "Post.exibeAExpressaoNoTituloDaGuia(String)"
});
formatter.result({
  "duration": 17017100,
  "status": "passed"
});
formatter.after({
  "duration": 604759300,
  "status": "passed"
});
});