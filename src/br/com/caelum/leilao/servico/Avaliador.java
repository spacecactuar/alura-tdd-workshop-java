package br.com.caelum.leilao.servico;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

class Avaliador {

    private double maiorDeTodos = Double.NEGATIVE_INFINITY;

    public void avalia(Leilao leilao) {
        for(Lance lance : leilao.getLances()) {
            if(lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();
            if(lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
        }

        maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size());
        Collections.sort(maiores, new Comparator<Lance>() {

            public int compare(Lance o1, Lance o2) {
                if(o1.getValor() < o2.getValor()) return 1;
                if(o1.getValor() > o2.getValor()) return -1;
                return 0;
            }
        });
        maiores = maiores.subList(0, 3);
    }

    public List<Lance> getTresMaiores() {
        return this.maiores;
    }
    
    public double getMaiorLance() {
        return maiorDeTodos;
    }

    public double getMenorLance() {
        return menorDeTodos;
    }
}