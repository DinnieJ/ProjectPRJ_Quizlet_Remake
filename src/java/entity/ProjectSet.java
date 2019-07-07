/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author MemeLord
 */
public class ProjectSet {
    private String setID;
    private String setName;
    private String description;
    private String creator;

    public ProjectSet() {
    }

    public ProjectSet(String setID, String setName, String description, String creator) {
        this.setID = setID;
        this.setName = setName;
        this.description = description;
        this.creator = creator;
    }

    public String getSetID() {
        return setID;
    }

    public String getSetName() {
        return setName;
    }

    public String getDescription() {
        return description;
    }

    public String getCreator() {
        return creator;
    }
    
    
}
