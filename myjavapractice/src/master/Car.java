package master;

public class Car {
	public String engine;
    public String model;
    public int doors;
    public int wheels;
    public String color;
    
    public void setModel(String model) {
    	String validModel = model.toLowerCase();
    	if(validModel.equals("carrera")) {
        	this.model=model;   		
    	}else {
    		this.model="Unknown";
    	}

    	
    }
    public void getModel(String model) {
    	this.model=model;
    	System.out.println(model);
    }
}
