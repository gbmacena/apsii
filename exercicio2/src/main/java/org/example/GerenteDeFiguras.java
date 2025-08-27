package org.example;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }

    public void adicionaFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica f : figuras) {
            System.out.println(f.getNomeFigura());
        }
    }

    public double getMaiorAreaDeFigura() {
        double maior = 0;
        for (FiguraGeometrica f : figuras) {
            double area = f.calculaArea();
            if (area > maior) {
                maior = area;
            }
        }
        return maior;
    }

    public double getAreaTotal() {
        double soma = 0;
        for (FiguraGeometrica f : figuras) {
            soma += f.calculaArea();
        }
        return soma;
    }
}