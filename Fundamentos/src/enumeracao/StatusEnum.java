/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public enum StatusEnum {
   EM_PREPARACAO("Em Preparacao"),
   EM_TRANSPORTE("Em Transporte"),
   ENTREGUE("Entregue ao cliente");
   
   private String status;

    private StatusEnum(String status) {
        this.status = status;
    }
   
   public String getStatus(){
       return  this.status;
   }
}
