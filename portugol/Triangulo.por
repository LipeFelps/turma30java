programa
{
	
 	real L1, L2, L3
 	logico EQ, ES, TRI
 		
	funcao inicio()
	{
	escreva(" Digite o primeiro lado: ")
	leia(L1)
	escreva(" Digite o segundo lado: ")
	leia(L2)
	escreva(" Digite o terceiro lado: ")
	leia(L3)
	TRI = (L1 < L2 + L3) e (L2< L1 + L3) e (L3<L1)
	EQ = (L1 == L2) e (L2 == L3)
	ES = (L1 != L2) e (L2 != L3) e (L1 != L3)
	escreva("\n", "Pode formar um trinagulo? ", TRI)
	escreva("\n", "O triangulo o EQUILATERO? ", EQ)
	escreva("\n", "O triangulo e ESCALENO? ", ES)
	
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */