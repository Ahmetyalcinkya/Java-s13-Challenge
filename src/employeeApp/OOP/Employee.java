package employeeApp.OOP;

import java.util.Arrays;

public class Employee {

    private String id;
    private String fullName;
    private String email;

    private String password;

    private String[] healthPlans;

    public Employee(String id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }
    public void addHealthPlan(int index, String name){

        if(index < 0){
            System.out.println("Index değeri 0'dan küçük olamaz.");
        }else {
            try {
                boolean isExist = false;
                for(String plan: healthPlans){
                    if(plan != null && plan.equals(name)){
                        isExist = true;
                        System.out.println(name + " değeri dizi içerisinde bulunmaktadır.");
                        break;
                    }else {
                        System.out.println("Index: "+ index + " değeri doludur.");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Index geçersizdir.");
            }catch (NullPointerException npe){
                System.out.println("Null pointer exception : " + npe.getMessage());
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
