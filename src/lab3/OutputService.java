package lab3;

/**
 *
 * @author jlombardo
 */
public class OutputService {
    
    private String msg = "";
    
    public void simpleOutput(String msg) {
        System.out.println(msg);
    }
    
    public void completeOutput(String msg) {
        System.out.println(msg);
    }
    
    public void addData(String data) {
        msg += data;
    }
    

    
//    private Employee employee;
//    
//    public OutputService(Employee e) {
//        employee = e;
//    }
//    
//    public void outputHrInfomation() {
//        System.out.println(employee.getLastName() + "completed orientation");
//    }
}
