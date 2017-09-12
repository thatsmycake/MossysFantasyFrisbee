/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mossysfantasyfrisbee;

import java.util.ArrayList;

/**
 *
 * @author Rowan
 */
public class Team {
    private String teamName;
    private int teamID;
    private ArrayList<Player> squadList; //think this is where I've gone wrong
    //To produce a stored player list - this may be done with mySQL at some point but just to practice!
    public Team(String teamName){
        this.teamName = teamName;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the teamID
     */
    public int getTeamID() {
        return teamID;
    }

    /**
     * @param teamID the teamID to set
     */
    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }
    
    /**
     * 
     * @return the array of players in a squad (for scoring)
     */
    public ArrayList getSquadList() {
        return squadList;
    }
    
    public void setSquadList(ArrayList squadList){
        this.squadList = squadList;
    }
}
