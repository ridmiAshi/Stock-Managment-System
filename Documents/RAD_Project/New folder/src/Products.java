/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anupama Dikkumbura
 */
class Products {
    private int pid,price,supplier;
    private String name;
    
    public Products(int pid, String name,int price,int supplier ){
        
        this.pid = pid;
        this.name =name;
        this.price = price;
        this.supplier=supplier;
    }
    public int getpid(){
        return pid;
    }
    public String getname(){
        return name;
    }
    public int getprice(){
        return price;
    }
    public int getsupplier(){
        return supplier;
    }
}
