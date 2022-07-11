import javax.swing.*;
class ModulosEMatrizes
{
    public static void main(String entrada[])
    {
        int vetor[] = { 1, 2, 3, 4, 5 };
        int soma;
        for (int i = 0; i < vetor.length; i++)
        {
            vetor[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite um número inteiro para o vetor na posição " + i));
        }
        soma = somatoria(vetor);
        JOptionPane.showMessageDialog(null, "Resultado da soma é: " + soma);
        produtoria(vetor);
        System.exit(0);
    }

    private static void produtoria(int[] vetor)
    {
        int produto = 1;
        for (int i = 0; i < vetor.length; i++)
        {
            produto *= vetor[i];
        }
        JOptionPane.showMessageDialog(null, "Resultado da produto é: " + produto);
    }

    private static int somatoria(int[] vetor)
    {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++)
        {
            soma += vetor[i];
        }
        return soma;
    }
}