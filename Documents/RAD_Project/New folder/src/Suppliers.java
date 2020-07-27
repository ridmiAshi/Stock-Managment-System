/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anupama Dikkumbura
 */
class Suppliers {
        private int sid,tp;
    private String name,address;
    
    public Suppliers(int sid, String name,String address,int tp ){
        
        this.sid = sid;
        this.name =name;
        this.address = address;
        this.tp=tp;
    }
    public int getsid(){
        return sid;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public int gettp(){
        return tp;
    }
}
