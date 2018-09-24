/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.maven.gitmaven;

/**
 *
 * @author lerys
 */
public class branch {
    private String branchNaam;
    private int branchNr;

    public branch(String branchNaam, int branchNr) {
        this.branchNaam = branchNaam;
        this.branchNr = branchNr;
    }

    public String getBranchNaam() {
        return branchNaam;
    }

    public void setBranchNaam(String branchNaam) {
        this.branchNaam = branchNaam;
    }

    public int getBranchNr() {
        return branchNr;
    }

    public void setBranchNr(int branchNr) {
        this.branchNr = branchNr;
    }
    
    
}
