public class Person {
    private int age;
    private String firstName, lastName;

    public int getAge() {
        return age;
    }

    public void setAge(int ageP) {
        if(ageP<=100 && ageP >0){
            this.age = ageP;

        }  else{
            this.age=0;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen(){
        if(age>12 && age <20){
            return true;
        } return false;

    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";

        }
        if(firstName.isEmpty()){
            return lastName;
        }
        if(lastName.isEmpty()){
            return firstName;
        }
        return firstName +" "+ lastName;
    }

}
