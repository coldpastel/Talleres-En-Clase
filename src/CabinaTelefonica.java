import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class CabinaTelefonica {
    private int[] totalLlamadas;
    private int[] totalMinutos;
    private int[] totalCostos;

    public CabinaTelefonica() {
        this.totalLlamadas = new int[3];
        this.totalMinutos = new int[3];
        this.totalCostos = new int[3];
    }

    public CabinaTelefonica(int[] totalLlamadas, int[] totalMinutos, int[] totalCostos) {
        this.totalLlamadas = totalLlamadas;
        this.totalMinutos = totalMinutos;
        this.totalCostos = totalCostos;
    }

    public void registrarLlamada(int tipoLlamada) {
        int[] duracionPorTipo = {20, 40, 30};
        int duracion = ThreadLocalRandom.current().nextInt(1, duracionPorTipo[tipoLlamada] + 1);
        int[] tarifas = {50, 350, 150};

        totalLlamadas[tipoLlamada]++;
        totalMinutos[tipoLlamada] += duracion;
        totalCostos[tipoLlamada] += duracion * tarifas[tipoLlamada];
    }

    public int[] getTotalLlamadas() {
        return totalLlamadas;
    }

    public int[] getTotalMinutos() {
        return totalMinutos;
    }

    public int[] getTotalCostos() {
        return totalCostos;
    }

    public void reiniciar() {
        Arrays.fill(totalLlamadas, 0);
        Arrays.fill(totalMinutos, 0);
        Arrays.fill(totalCostos, 0);
    }

    @Override
    public String toString() {
        return "Llamadas locales: " + totalLlamadas[0] +
                ", Larga distancia: " + totalLlamadas[1] +
                ", Celulares: " + totalLlamadas[2];
    }
}

