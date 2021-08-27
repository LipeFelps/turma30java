programa
{
	caracter nome
	real salario, NovoSalario
	inteiro dependentes
	funcao inicio()
	{
		escreva("nome do funcionario: ")
		leia(nome)
		escreva("Salario: R$ ")
		leia(salario)
		escreva("quantidade de dependentes: ")
		leia(dependentes)

	escolha (dependentes) {
	caso 0:
			NovoSalario = salario + (salario*5/100)
	pare
	caso 1:
			NovoSalario = salario + (salario*10/100)
	pare
	caso 2:
			NovoSalario = salario + (salario*10/100)
	pare
	caso 3:
			NovoSalario = salario + (salario*10/100)
	pare
	caso 4:
			NovoSalario = salario + (salario*15/100)
	pare
	caso 5:
			NovoSalario = salario + (salario*15/100)
	pare
	caso 6:
			NovoSalario = salario + (salario*15/100)
	pare
	caso contrario:
			NovoSalario = salario + (salario*18/100)
	}

			escreva("\n", "O novo salario de ", nome, " sera de R$", NovoSalario)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 23; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */