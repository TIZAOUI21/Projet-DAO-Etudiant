
package model;

/**
 *
 * @author Admin
 */
public class Etudiant {
    
    private int id;
    private String firstName;
     private String lastName;
     private String gender;
     
     public Etudiant (){
    
}
     public int getID(){
       return id ;
     }
     
public String getfirstName(){
         return firstName;
     }

    public void setId(int id) {
        this.id = id;
    }
public void setfirstName(String firstName){
         this.firstName =firstName;
     }
public String getlastName(){
         return lastName;
     }
public void setlastName(String lastName){
         this.lastName =lastName;
     }
public String getgender(){
        return gender;
     }
public void setgender(String gender){
         this.gender =gender;
     }

@Override
public String toString() {
return "Etudiant id" + id + ", firstName"+ firstName +", lastName"+lastName+",gender" + gender;
}
}