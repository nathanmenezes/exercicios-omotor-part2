package model;

public class Calendario {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Boolean validarData(Integer dia, Integer mes, Integer ano){
        if(dia > 0 & dia <= 30 & mes > 0 & mes < 13){
            return true;
        }
        return false;
    }
}
