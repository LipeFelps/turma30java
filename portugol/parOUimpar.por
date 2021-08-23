programa
{
	inteiro N, N1, N2
	funcao inicio()
	{
		
		
		escreva("Jogador numero 1: ")
		leia(N1)
		escreva("Jogador numero 2: ")
		leia(N2)
		N = N1 + N2
		se (N % 2 == 0)
		escreva(N, " é um numero par, então jogador 1 ganhou ")
		senao
		escreva (N, " é um numero impar, então jogador dois ganhou ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 57; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */