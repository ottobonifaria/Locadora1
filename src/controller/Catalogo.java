package controller;

import domain.Veiculos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Catalogo {

    static List veiculos = new ArrayList<Veiculos>();

    public List getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List veiculos) {
        this.veiculos = veiculos;
    }

    static  public void ordena(){
        Collections.sort(veiculos);
    }
    static public void deletaVeiculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do veiculo a ser digitado");
        int numero = sc.nextInt();
        if (numero > veiculos.size() || numero <= 0){
            System.out.println("Veiculo não localizado");
        }else{
            veiculos.remove(numero+1);
        }
    }

    static public void CadastraVeiculo(Veiculos v){
        veiculos.add(v);
    }

  static public void listar(){
      for(int i = 0 ; i < veiculos.size();i++) {
           System.out.println("\n========= Veiculo Nun. " + (i+1) + " =========\n");
           System.out.println(veiculos.get(i));
       }

    }
}
