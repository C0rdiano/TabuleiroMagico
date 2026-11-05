import java.util.Random; //[cite: 1]
import java.util.Scanner; //[cite: 1]

public class TabuleiroMagico {

    public static void main(String[] args) {
        System.out.println("=== MISSÕES DO TABULEIRO MÁGICO ==="); //[cite: 1]

        int[] posicoes = new int[5]; //
        String[] jogadores = new String[5]; //[cite: 2]
        Scanner scanner = new Scanner(System.in); //[cite: 2]

        for (int i = 0; i < jogadores.length; i++) { //[cite: 2]
            System.out.print("Digite o nome do jogador " + (i + 1) + ": "); //[cite: 2]
            jogadores[i] = scanner.nextLine(); //[cite: 2]
        }

        String[] missoes = new String[51]; //[cite: 4, 10]
        int[] efeitos = new int[51]; //[cite: 4, 10]
        preencherMissoes(missoes); //[cite: 10]
        preencherEfeitos(efeitos); //[cite: 10]

        boolean terminou = false; //[cite: 6]
        int jogadorAtual = 0; //[cite: 6]

        while (!terminou) { //[cite: 6]
            System.out.println("\nVez de " + jogadores[jogadorAtual]); //[cite: 6]
            int dado = lancarDado(); //[cite: 6]
            System.out.println("Dado: " + dado); //[cite: 6]

            posicoes[jogadorAtual] = moverJogador(posicoes[jogadorAtual], dado); //[cite: 6]
            mostrarMissao(posicoes[jogadorAtual], missoes); //[cite: 6]
            posicoes[jogadorAtual] = aplicarEfeito(posicoes[jogadorAtual], efeitos); //[cite: 6]
            mostrarPosicoes(jogadores, posicoes); //[cite: 6]

            if (verificarVencedor(posicoes[jogadorAtual])) { //[cite: 6]
                System.out.println("\nPARABÉNS! " + jogadores[jogadorAtual] + " venceu o jogo!"); //[cite: 7]
                terminou = true; //[cite: 7]
            } else {
                jogadorAtual++; //[cite: 7]
                if (jogadorAtual == jogadores.length) { //[cite: 7]
                    jogadorAtual = 0; //[cite: 7]
                }
            }
        }
    }

    public static int lancarDado() {
        Random random = new Random(); //[cite: 3]
        return random.nextInt(6) + 1; //[cite: 3]
    }

    public static int moverJogador(int posicaoAtual, int dado) {
        if (posicaoAtual + dado <= 50) { //[cite: 3]
            return posicaoAtual + dado; //
        }
        return posicaoAtual; //[cite: 4]
    }

    public static void mostrarMissao(int casa, String[] missoes) {
        System.out.println("Missão: " + missoes[casa]); //[cite: 4]
    }

    public static int aplicarEfeito(int posicao, int[] efeitos) {
        int novaPosicao = posicao + efeitos[posicao]; //
        if (novaPosicao < 0) { //
            novaPosicao = 0; //[cite: 5]
        }
        if (novaPosicao > 50) { //[cite: 5]
            novaPosicao = 50; //[cite: 5]
        }
        return novaPosicao; //[cite: 5]
    }

    public static void mostrarPosicoes(String[] jogadores, int[] posicoes) {
        System.out.println("\n--- POSIÇÕES ---"); //[cite: 5]
        for (int i = 0; i < jogadores.length; i++) { //[cite: 5]
            System.out.println(jogadores[i] + " -> casa " + posicoes[i]); //[cite: 5]
        }
    }

    public static boolean verificarVencedor(int posicao) {
        return posicao == 50; //[cite: 5]
    }

    public static void preencherMissoes(String[] missoes) {
        missoes[1] = "Diga o nome de uma linguagem de programação."; //[cite: 9]
        missoes[2] = "Faça uma pose de super-herói."; //[cite: 9]
        missoes[3] = "Qual operador representa o resto da divisão em Java?"; //[cite: 9]
        missoes[4] = "Conte uma piada rápida."; //[cite: 9]
        missoes[5] = "Avance 2 casas."; //[cite: 9]
        missoes[6] = "Diga um exemplo de variável do tipo int."; //[cite: 9]
        missoes[7] = "Imite um robô por 5 segundos."; //[cite: 9]
        missoes[8] = "Qual comando utilizamos para uma decisão simples em Java?"; //[cite: 9]
        missoes[9] = "Bata palmas 5 vezes."; //[cite: 9]
        missoes[10] = "Volte 2 casas."; //[cite: 9]
        missoes[11] = "Diga o nome de um aplicativo que você usa todos os dias."; //[cite: 9]
        missoes[12] = "Qual estrutura pode repetir comandos várias vezes?"; //[cite: 9]
        missoes[13] = "Faça um som de animal."; //[cite: 9]
        missoes[14] = "Diga um exemplo de valor boolean."; //[cite: 9]
        missoes[15] = "Avance 3 casas."; //[cite: 9]
        missoes[16] = "Diga o nome de três tipos primitivos de Java."; //[cite: 9]
        missoes[17] = "Faça uma pose de estátua por 5 segundos."; //[cite: 9]
        missoes[18] = "Para que serve Scanner em nossos programas?"; //[cite: 9]
        missoes[19] = "Fale uma palavra relacionada à tecnologia."; //[cite: 9]
        missoes[20] = "Volte 3 casas."; //[cite: 9]
        missoes[21] = "Qual índice representa o primeiro elemento de um vetor?"; //[cite: 9]
        missoes[22] = "Faça uma comemoração de gol."; //[cite: 9]
        missoes[23] = "O que significa vetor.length?"; //[cite: 9]
        missoes[24] = "Diga o nome de um jogo digital."; //[cite: 9]
        missoes[25] = "Avance 2 casas."; //[cite: 9]
        missoes[26] = "Qual comando usamos para exibir uma mensagem no console?"; //[cite: 9]
        missoes[27] = "Imite alguém digitando muito rápido."; //[cite: 9]
        missoes[28] = "Qual palavra usamos para devolver um valor de uma função?"; //[cite: 9]
        missoes[29] = "Diga uma curiosidade sobre tecnologia."; //[cite: 9]
        missoes[30] = "Volte 2 casas."; //[cite: 9]
        missoes[31] = "Se int[] numeros = new int[5], quantos elementos existem?"; //[cite: 9]
        missoes[32] = "Faça uma dança de 5 segundos."; //[cite: 9]
        missoes[33] = "Qual é o último índice de um vetor com 5 elementos?"; //[cite: 9]
        missoes[34] = "Diga o nome de uma profissão da área de tecnologia."; //[cite: 9]
        missoes[35] = "Avance 3 casas."; //[cite: 9]
        missoes[36] = "O que uma função void devolve?"; //[cite: 9]
        missoes[37] = "Faça uma pose de personagem de filme."; //[cite: 9]
        missoes[38] = "Para que servem parâmetros de uma função?"; //[cite: 9]
        missoes[39] = "Diga uma vantagem de usar funções."; //[cite: 9]
        missoes[40] = "Volte 2 casas."; //[cite: 9]
        missoes[41] = "Como acessamos o elemento de indice 2 do vetor numeros?"; //[cite: 9]
        missoes[42] = "Faça um cumprimento criativo para a turma."; //[cite: 9]
        missoes[43] = "Qual laço usamos nesta aula para percorrer os jogadores?"; //[cite: 9]
        missoes[44] = "Diga uma vantagem de usar vetores."; //[cite: 9]
        missoes[45] = "Avance 2 casas."; //[cite: 9]
        missoes[46] = "Explique com suas palavras o que é um índice."; //[cite: 9]
        missoes[47] = "Imite um computador iniciando."; //[cite: 9]
        missoes[48] = "Explique com suas palavras o que é uma função."; //[cite: 9]
        missoes[49] = "Escolha um colega para dizer o que aprendeu nesta aula."; //[cite: 9]
        missoes[50] = "CHEGADA! Você concluiu o Tabuleiro Mágico."; //[cite: 9]
    }

    public static void preencherEfeitos(int[] efeitos) {
        efeitos[5] = 2; //[cite: 9]
        efeitos[10] = -2; //[cite: 9]
        efeitos[15] = 3; //[cite: 9]
        efeitos[20] = -3; //[cite: 9]
        efeitos[25] = 2; //[cite: 10]
        efeitos[30] = -2; //[cite: 10]
        efeitos[35] = 3; //[cite: 10]
        efeitos[40] = -2; //[cite: 10]
        efeitos[45] = 2; //[cite: 10]
    }
}