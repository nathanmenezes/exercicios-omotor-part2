package service;

import model.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroService {

    public List<Carro> carros = new ArrayList<>();
    public String salvarCarro(Carro carro){
        carros.add(carro);
        System.out.println("Salvando o carro: " + carro);
        return "Carro Salvo com Sucesso!!";
    }

    public String deletarCarro(Carro carro){
        carros.remove(carro);
        System.out.println("Deletando o carro: " + carro);
        return "Carro Deletado com Sucesso!!";
    }

    public String editarCarro(int index, Carro carro){
        Carro carro1 = carros.get(index);
        carros.set(index, carro);
        System.out.println("Editando o carro: " + carro1 + " de id: " + index);
        return "Carro Editado com Sucesso!!";
    }

    public Carro visualizarCarro(int index){
        System.out.println("Visualizando o carro: " + carros.get(index));
        return carros.get(index);
    }

}
