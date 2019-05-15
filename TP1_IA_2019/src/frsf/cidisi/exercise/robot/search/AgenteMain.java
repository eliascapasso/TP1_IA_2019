package frsf.cidisi.exercise.robot.search;

import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;

public class AgenteMain {

    public static void main(String[] args) throws PrologConnectorException {
        Agente agent = new Agente();
        
        
        //prueba push

        AmbienteZonaCostanera environment = new AmbienteZonaCostanera();

        SearchBasedAgentSimulator simulator =
                new SearchBasedAgentSimulator(environment, agent);
        
        simulator.start();
    }

}
