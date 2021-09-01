public class Employee {

    // Attribute, Field
    /*
    public int id;
    public String name;
    public String email;
    */
    private int id;
    private String name;
    private String email;

    public int getId(){
        return id;
    }

    public void setId(int id){
        
        if (id > 100){      // if user try to give more than 100 for user's id -> make it 100 anyway
            this.id = 100;
        }
        else {
            this.id = id;       // otherwise, set it as user's wish
        }
        
    }

    public String getName(){
        return name;
        
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    

    public void showInfos(){

        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name); // = ("Name: " + name)
        System.out.println("Email: " + this.email);
    }



    public Employee(int id, String name, String email){

        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Employee(){ // Overloading

        this.id = 0;
        this.name = "no information";
        this.email = "no information";
    }

    

}
