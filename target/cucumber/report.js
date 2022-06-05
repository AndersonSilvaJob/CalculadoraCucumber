$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Calc.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Calc",
  "description": " Como usuario entrar com dois valores\r\n Com o bjetivo de obter um resultado",
  "id": "calc",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 6,
  "name": "Somar",
  "description": "",
  "id": "calc;somar",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 7,
  "name": "que eu escolha somar",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "eu preencho o primeiro numero com o valor \u00271\u0027",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "eu preencho o segundo numero com \u00271\u0027",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "eu devo ver o resultado como \u00272\u0027",
  "keyword": "Então "
});
formatter.match({
  "location": "CalcSteps.que_eu_escolha_somar()"
});
formatter.result({
  "duration": 239949900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});