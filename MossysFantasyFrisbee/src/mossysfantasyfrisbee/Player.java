/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mossysfantasyfrisbee;

/**
 *
 * @author Andy
 */
public class Player implements Cloneable {
    private String name;
    private Team team;
    private Gender gender;
    private String shirtNum;
    private int assists;
    private int scores;
    
    public Player(String inputtedName){
        name = inputtedName;
    }
    
    /**
    * @return the name
    */
    public String getName() {
        return name;
    }
    
    /**
     * @param n the name to set
     */
    public void setName(String n) {
        this.name = n;
    }
    
    /**
     * 
     * @return the team name
     */
    public Team getTeam() {
        return team;
    }
    
    /**
     * 
     * @param t the team name to set
     */
    public void setTeam(Team t) {
        this.team = t;        
    }
    
    /**
     * 
     * @return shirt number set as a string (for descriptions)
     */
    public String getShirtNum(){
        return shirtNum;
    }
    
    public void setShirtNum(String num){
        this.shirtNum = num;
    }
    
    /**
     * 
     * @return Gender, which is set to be Male, Female, or UNKNOWN
     */
    public Gender getGender() {
        return gender;
    }
    
    public void setGender(Gender gender){
        this.gender = gender;
    }
    
    /**
     * 
     * @return assists and scores, set as integers. 
     */
    public int getAssists(){
        return assists;
    }
    
    public void setAssists(int a) {
        this.assists = a;
    }
   
    public int getScores(){
        return scores;
    }
    
    public void setScores(int s) {
        this.scores = s;
    }
    
}

