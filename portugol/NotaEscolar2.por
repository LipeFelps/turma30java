programa
{
	inteiro nota1, nota2, notaFinal
	funcao inicio()
	{
		escreva("\n", "_____________________________________")
		escreva("\n", "                                     ")
		escreva("\n", "	        NOTA FINAL"               )
		escreva("\n", "_____________________________________")

 		escreva("\n", "_____________________________________")
		escreva("\n", "                                     ")
		escreva("\n","Qual é a sua nota de português? ")
		leia(nota1)
		escreva("\n","Qual é sua nota de matematica? ")
		leia(nota2)
		escreva("\n", "_____________________________________")
		
		escreva("\n", "_____________________________________")
		escreva("\n", "                                     ")
		notaFinal= (nota1 + nota2)/2
		escreva("\n", " Sua media final é ", notaFinal)
		se (notaFinal >=10)
		escreva("\n", " Então, sua nota final é A")
	senao
		se ( notaFinal == 8)
		escreva("\n", " Então, sua nota final é B")
	senao
		se ( notaFinal == 7)
			escreva("\n", " Então, sua nota final é C")
	senao
		se ( notaFinal == 6)
			escreva("\n", " Então, sua nota final é D")
	senao
		se (notaFinal == 5)
			escreva("\n", " Então, sua nota final é E")
	senao
	escreva("\n", " Então, sua nota final é F, você reprovou")
		
		escreva("\n", "_____________________________________")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 809; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */