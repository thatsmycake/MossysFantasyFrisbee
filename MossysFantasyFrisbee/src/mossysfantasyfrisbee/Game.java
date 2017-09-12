/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mossysfantasyfrisbee;

import java.util.ArrayList;

/**
 *
 * @author Andy
 */
public class Game {
    private Team team1;
    private Team team2;
    
    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    
    ArrayList squad1 = team1.getSquadList();
    ArrayList squad2 = team2.getSquadList();
    
    private String getTeamMembers(ArrayList squadlist) {
        for(Object p : squadlist) { //Why does it make this be Object and not Player?
            System.out.print("Player: " + p);
        }
        return "done";
    }
    

}
