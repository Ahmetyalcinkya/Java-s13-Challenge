package employeeApp.OOP;

import employeeApp.ENUMS.Plan;

public class HealthPlan {

    private String id;

    private String name;

    private Plan plan;

    public HealthPlan(String id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "HealthPlan{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}
