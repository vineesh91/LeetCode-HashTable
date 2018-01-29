import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
public class EmployeeImportance {
    Hashtable<Integer,Employee> ht;
    public int getImportance(List<Employee> employees, int id) {
        int imp = 0;
        ht = new Hashtable<>();
        for(Employee emp : employees) {
            ht.put(emp.id, emp);
        }
        Employee em = ht.get(id);
        imp += imp(em);
        return imp;
    }
    private int imp(Employee e) {
        int ret = e.importance;
        for(Integer sub : e.subordinates) {
            ret += imp(ht.get(sub));
        }
        return ret;
    }
}
