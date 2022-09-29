/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan7;

/**
 *
 * @author HUY DINH
 */
public class BaiTapTuan7 {

    public static void main(String[] args) {
       
    /**
     * @param args the command line arguments
     */
        circle ck= new circle(5,"đỏ",8,9);
        circle ck1= new circle(6,"xanh",10,0);
        circle ck2= new circle(9,"hồng",15,7);
        System.out.println(ck);
        ck.inDienTichVaChuVi();
        System.out.println(ck1);
        ck1.inDienTichVaChuVi();
        System.out.println(ck2);
        ck2.inDienTichVaChuVi();
        
        
        hcn hc=new hcn(10,3);
        System.out.println(hc);
        hc.inDienTichVaChuVi();
        
        
        
        box bx=new box(2,4,6);
        System.out.println(bx);
        bx.inDienTichVaTheTich();
    }
    
}
