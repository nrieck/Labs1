/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

public class Company {
    
    private HrWork hr;
    
    public Company() {
        hr = new HrWork();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }

    public HrWork getHr() {
        return hr;
    }

    public void setHr(HrWork hr) {
        this.hr = hr;
    }
}
