/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119025.adhirafahrigathan.no3;

/**
 *
 * @author User
 */
public class Rnb extends MusicGenre implements Blues, Jazz{
    public void genreJazz(String artisName) {
        System.out.println(artisName+"adalah genre Jazz");
    }
    @Override
    public void genreBlues(String artisName) {
        System.out.println(artisName+"adalah genre Blues");
    }

    void setArtisName(String chad_Baker) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
