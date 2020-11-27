/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119043.ferminaufalakbar;

/**
 *
 * @author FERMI
 */
public class Customer extends ServicePrice implements CustomerInvoice{
    private String name;
    private String email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean isMember() {
        return true;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
    
    @Override
    public String currentTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
