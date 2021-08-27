programa
{
	inteiro nota1, nota2, notaFinal
	funcao inicio()
	{
		escreva("Qual foi sua nota em portugues? ")
		leia(nota1)
		escreva("Qual foi sua nota em matematica? ")
		leia(nota2)
		notaFinal= (nota1 + nota2)/2
		se (notaFinal >=10)
		escreva(" Parabens você passou")
		senao
		se (notaFinal >=5 e notaFinal < 7)
		escreva(" Recuperação ")
		senao
		escreva(" Infelizmente você reprovou ")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */