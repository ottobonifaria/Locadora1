package domain;

public class Veiculos implements Comparable<Veiculos>{

    private String marca;
    private String modeloVeiculo;
    private String cor;
    private String placa;
    private int valorDaDiaria;

    public Veiculos(String marca, String modeloVeiculo, String cor, String placa,int valorDaDiaria) {
        this.marca = marca;
        this.modeloVeiculo = modeloVeiculo;
        this.cor = cor;
        this.placa = placa;
        this.valorDaDiaria = valorDaDiaria;
    }

    @Override
    public String toString() {
        return "Marca ...............: " + marca +
             "\nModelo ..............: " + modeloVeiculo +
             "\nCor .................: " + cor +
             "\nPlaca ...............: " + placa +
             "\nValor da Diária R$ ..: " + valorDaDiaria+"\n";
    }

    @Override
    public int compareTo(Veiculos o) {

        if(this.valorDaDiaria < o.valorDaDiaria){
            return -1;
        }
        if(this.valorDaDiaria > o.valorDaDiaria){
            return 1;
        }
        return 0;
    }
}
