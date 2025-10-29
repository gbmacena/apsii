package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private static class Entry {
        String nome;
        DataAniversario data;

        Entry(String nome, DataAniversario data) {
            this.nome = nome;
            this.data = data;
        }
    }

    private final ArrayList<Entry> lista = new ArrayList<>();

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        DataAniversario d = new DataAniversario(dia, mes);
        // evita duplicados: mesmo nome (case-insensitive) e mesma data
        for (Entry e : lista) {
            if (e.nome != null && e.nome.equalsIgnoreCase(nome) && e.data.equals(d)) {
                return;
            }
        }
        lista.add(new Entry(nome, d));
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> resultado = new ArrayList<>();
        for (Entry e : lista) {
            if (e.data != null && e.data.getDia() == dia && e.data.getMes() == mes) {
                resultado.add(e.nome);
            }
        }
        return resultado;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        Iterator<Entry> it = lista.iterator();
        while (it.hasNext()) {
            Entry e = it.next();
            if (e.nome != null && e.nome.equalsIgnoreCase(nomeAniversariante)) {
                it.remove();
            }
        }
    }

    // útil para depuração
    public ArrayList<String> listarTodos() {
        ArrayList<String> out = new ArrayList<>();
        for (Entry e : lista) out.add(e.nome + " (" + (e.data != null ? e.data.toString() : "sem data") + ")");
        return out;
    }

}
