programa
{
	inteiro parcelas, emprestimo, valor_jurosSimples, valor_final
	funcao inicio()
	{
		escreva(" O quanto tu quer de emprestimo? R$ ")
		leia(emprestimo)
		valor_jurosSimples = emprestimo+200 //20% de juro
		escreva( " O valor com juros irá ficar: ", valor_jurosSimples)

		escreva("\n" , " Em quantas parcela? ")
		leia(parcelas)
		valor_final = valor_jurosSimples/parcelas
		escreva( " O valor final que tu ira pagar é ", valor_final,  " em 10x ")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */