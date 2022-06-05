package com.tdd.calculadora;


import static org.junit.Assert.assertEquals;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CalcSteps {
	
	//chamando classe Calc e definindo como calculadora
	Calc calculadora;
	//Criando duas variaveis
	int num1,num2;
	
	@Dado("^que eu escolha somar$")
	public void que_eu_escolha_somar(){	
		calculadora = new Calc();	
	}
	
	@Quando("^eu preencho o primeiro numero com o valor '(\\d+)'$")
	private void eu_preencho_o_primeiro_numero_com_o_valor(int arg1){
		//definindo os valores da variaveis
		num1=arg1;
	}
	
	@Quando("^eu preencho o segundo numero com '(\\d+)'$")
	private void eu_preencho_o_segundo_numero_com(int arg1) throws Throwable {
		//definindo os valores da variaveis
				num2=arg1;
	}
	
	
	@Entao("^eu devo ver o resultado como '(\\d+)'$")
	private void eu_devo_ver_o_resultado_como(int arg1) throws Throwable {
		//comparando valores
		assertEquals(num1 + num2, calculadora.somar(num1,num2));

	}
}
