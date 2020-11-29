package br.com.caelum.leilao.teste;

import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Avaliador;

class TesteDoAvaliador {
    @Test
    public static void main() {
        // 1. Cenarios
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(joao, 300.0));
        leilao.propoe(new Lance(jose, 400.0));
        leilao.propoe(new Lance(maria, 250.0));

        // 2. Acao
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        // 3. Validacao
        double maiorEsperado = 400;
        double menorEsperado = 250;

        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance() 0.0001);
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance() 0.0001);
    }
}