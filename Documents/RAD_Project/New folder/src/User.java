/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachini Nayanathara
 */
class User {
    private int uid;
    private String username;
    
    public User(int uid, String username ){
        
        this.uid = uid;
        this.username =username;

    }
    public int getpid(){
        return uid;
    }
    public String getname(){
        return username;
    }
    
}
