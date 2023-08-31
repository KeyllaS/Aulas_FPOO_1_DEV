/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redessociais;

import com.sun.tools.javac.Main;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[] args) {
        PostRedesSociais post1 = new PostRedesSociais(1);
        PostRedesSociais post2 = new PostRedesSociais(3);
        PostRedesSociais post3 = new PostRedesSociais(5);
        
        post1.comum();
        post2.legal();
        post3.superLegal();
    }
}
