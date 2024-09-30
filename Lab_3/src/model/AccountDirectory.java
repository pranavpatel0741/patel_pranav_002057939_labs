/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pranavpatel
 */
public class AccountDirectory {

    private ArrayList<Account> accounts;
    
    public AccountDirectory(){
        this.accounts=new ArrayList<Account>();
    }
    public ArrayList<Account> getAccounts(){
     return accounts;
    }
    public void setAccounts(ArrayList<Account>accounts){
        this.accounts=accounts;
    }

    /**
     *
     * @return
     */
    public Account addAccount(){
     Account a = new Account();
     accounts.add(a);
     return a;
    }
    public void deletAccount(Account account){
        accounts.remove(account);
    }
    public Account searchAccount (String accountNumber){
    for(Account a : accounts){
    if(a.getAccountNumber().contains(accountNumber)){
    return a;}
    }
    return null;
        }
}
