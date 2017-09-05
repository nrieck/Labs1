package lab3;

/**
 *
 * @author jlombardo
 */
public class OutputService {
    
    private String report = "";
    
    public void simpleOutput(String msg) {
        System.out.println(msg);
    }
    
    public void completeOutput(String msg) {
        System.out.println(msg);
        // sllsdkfjdlkfjdkf
    }
    
    public void addData(String data) {
        report += data;
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
