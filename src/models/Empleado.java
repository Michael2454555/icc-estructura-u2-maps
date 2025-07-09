package models;

public class Empleado implements Comparable<Empleado>{
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Empleado emp) {
        int comparacionId=Integer.compare(id, emp.id);
        if(comparacionId !=0){
            return comparacionId;
        }
        return name.compareToIgnoreCase(emp.getName());
        
        // int result = Integer.compare(o.getId(), o2.getId());
        // return result;
        // if(result==0){
        //     return o.getName().compareToIgnoreCase(o2.getName());
        // }else{
        //     return result;

        // }
    }

    // @Override
    // public int compareTo(Empleado o) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    // }

    
    
}