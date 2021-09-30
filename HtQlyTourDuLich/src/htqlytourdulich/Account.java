/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. test github
 */
package htqlytourdulich;

/**
 * 
 * @author Thanh 
 */
public class Account {

    int IDAccount;
    String Username, Password, Hovaten;
    String Sdt;
    String Email;

    public Account() {
    }

    public Account(int IDAccount, String Username, String Password, String Hovaten, String Sdt, String Email) {
        this.IDAccount = IDAccount;
        this.Username = Username;
        this.Password = Password;
        this.Hovaten = Hovaten;
        this.Sdt = Sdt;
        this.Email = Email;
    }

    public Account(String Username, String Password, String Hovaten, String Sdt, String Email) {
        this.Username = Username;
        this.Password = Password;
        this.Hovaten = Hovaten;
        this.Sdt = Sdt;
        this.Email = Email;
    }

    public int getIDAccount() {
        return IDAccount;
    }

    public void setIDAccount(int IDAccount) {
        this.IDAccount = IDAccount;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String Hovaten) {
        this.Hovaten = Hovaten;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
