package lista4;

import java.util.ArrayList;

/**
 *
 * @author Jesiel
 */
public class TesteCar_Building {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CarbonFootprint[] carbon = new CarbonFootprint[3];

        Car carro = new Car("", "");

        carro.setCombustivel("Gasolina");
        carro.setModelo("Sedan");

        House house = new House(0, 0, true, 0, true);

        house.setAreaOcupada(200);
        house.setNumeroDeLampadas(30);
        house.setNumeroDePessoas(5);
        house.setUsoDeArCondicionado(true);
        house.setUsoDeEnergiaRenovavel(true);

        School school = new School(true, 0, true, 0, true);

        school.setAreaVerde(true);
        school.setNumeroDeLampadas(400);
        school.setNumeroDePessoas(100);
        school.setUsoDeArCondicionado(true);
        school.setUsoDeEnergiaRenovavel(false);

//        Building building = new Building(0, true, 0, true);
//        building.setNumeroDeLampadas(4);
//        building.setNumeroDePessoas(5);
//        building.setUsoDeArCondicionado(true);
//        building.setUsoDeEnergiaRenovavel(true);
        carbon[0] = carro;
        carbon[1] = house;
        carbon[2] = school;

//        carbon[1] = building;
        for (int i = 0; i < carbon.length; i++) {
            System.out.println("Valor de Emissão de CO² do quesito :" + (i + 1) + " " + carbon[i].getCarbonFootprint());

        }

    }

}
