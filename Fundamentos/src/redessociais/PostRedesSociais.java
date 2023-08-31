/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redessociais;

/**
 *
 * @author Aluno
 */

public class PostRedesSociais implements ClassificacaoPost{
    private int estrelas;
    
    public PostRedesSociais(int  estrelas) {
        this.estrelas = estrelas;
        
    }

    @Override
    public String toString() {
        return "PostRedesSociais{" + "estrelas=" + estrelas + '}';
    }

    @Override
    public void comum() {
        System.out.println("Post comm classificação comum");
    }

    @Override
    public void legal() {
         System.out.println("Post comm classificação legal");
    }
    

    @Override
    public void superLegal() {
        System.out.println("Post comm classificação super legal");
    }
   
}
