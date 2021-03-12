package relationtoluke;

public class Relation {
    private String name;

    public Relation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void relationToLuke(){
        if(name.equals("Darth Vader")) System.out.println("Luke, I am your father.");
        else if(name.equals("Leia")) System.out.println("Luke, I am your sister.");
        else if(name.equals("Han")) System.out.println("Luke, I am your brother in law.");
        else System.out.println("Luke, I am your droid.");
    }
}

