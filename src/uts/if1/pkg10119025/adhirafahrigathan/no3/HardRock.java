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
public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock {
    public void genreHardRock(String artisName){
        System.out.println(artisName+"adalah genre Hard Rock");
    }

    public void genrePopRock(String artisName){
        System.out.println(artisName+"adalah genre Pop Rock");
    }

    public void genrePsychedelic(String artisName){
        System.out.println(artisName+"adalah genre Psychedelic");
    }

    public void genreProgressive(String artisName) {
        System.out.println(artisName+"adalah genre Progressive");
    }
}