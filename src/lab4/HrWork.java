
package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nick
 */
public class HrWork {
    
    private List<Employee> employees;


    public HrWork() {
        employees = new ArrayList();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName,lastName,ssn);
        employees.add(e);
        orientEmployee(e);
    }
    
    public void orientEmployee(Employee e) {
        e.doFirstTimeOrientation("first");
    }
    
    public void outputReport(String ssn) {
        Employee e = null;
        
        for(Employee emp : employees) {
            if(emp.getSsn().equals(ssn)) {
                e = emp;
                break;
            } else {
                return;
            }
        }

        if(e.isMetWithHr() && e.isMetDeptStaff()
           && e.isReviewedDeptPolicies() && e.isMovedIn()) {
            
            e.getReportService().outputReport();
            
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
