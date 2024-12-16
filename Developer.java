package MODELS;

public class Developer {
   private int  id ;
   private String name,Branch;
   private double BUDGET;
   
   public Developer() {
	   System.out.println(" Developer object created");
   }

public Developer(int id, String name, String branch, double BUDGET) {
	super();
	this.id = id;
	this.name = name;
	this.Branch= branch;
	this.BUDGET = BUDGET;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBranch() {
	return Branch;
}

public void setBranch(String branch) {
	Branch = branch;
}

public double getBUDGET() {
	return BUDGET;
}

public void setBUDGET(int bUDGET) {
	BUDGET = bUDGET;
}

@Override
public String toString() {
	return "Developer [id=" + id + ", name=" + name + ", Branch=" + Branch + ", BUDGET=" + BUDGET + "]";
}
  



   
}
