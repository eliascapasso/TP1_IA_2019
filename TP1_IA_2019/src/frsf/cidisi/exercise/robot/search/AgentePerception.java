package frsf.cidisi.exercise.robot.search;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class AgentePerception extends Perception {

	//TODO: Setup Statics
    //public static int UNKNOWN_PERCEPTION = -1;   
	
	
	//TODO: Setup Sensors
	private int promocion;
	private int cortecalle;
	private int horariosupermercado;
	private int manifestacion;
	private int PerceptionName;
	
 

    public  AgentePerception() {
    	//TODO: Complete Method
    }

    public AgentePerception(Agent agent, Environment environment) {
        super(agent, environment);
    }

    /**
     * This method is used to setup the perception.
     */
    @Override
    public void initPerception(Agent agentIn, Environment environmentIn) {
    	
    	//TODO: Complete Method
        
        //Agente agent = (Agente) agentIn;
        //AmbienteZonaCostanera environment = (AmbienteZonaCostanera) environmentIn;
        //EstadoAmbiente environmentState =
        //        environment.getEnvironmentState();
       
        
    }
    
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        //TODO: Complete Method

        return str.toString();
    }

    // The following methods are agent-specific:
    //TODO: Complete this section with the agent-specific methods
	
     public int getpromocion(){
        return promocion;
     }
     public void setpromocion(int arg){
        this.promocion = arg;
     }
     public int getcortecalle(){
        return cortecalle;
     }
     public void setcortecalle(int arg){
        this.cortecalle = arg;
     }
     public int gethorariosupermercado(){
        return horariosupermercado;
     }
     public void sethorariosupermercado(int arg){
        this.horariosupermercado = arg;
     }
     public int getmanifestacion(){
        return manifestacion;
     }
     public void setmanifestacion(int arg){
        this.manifestacion = arg;
     }
     public int getPerceptionName(){
        return PerceptionName;
     }
     public void setPerceptionName(int arg){
        this.PerceptionName = arg;
     }
	
   
}
