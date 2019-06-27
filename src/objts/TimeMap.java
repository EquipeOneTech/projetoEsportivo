/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objts;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Felipe
 */
public abstract class TimeMap {
    HashMap<Time, ArrayList> mapTime = new HashMap();

    public HashMap<Time, ArrayList> getMapTime() {
        return mapTime;
    }

    public void setMapTime(HashMap<Time, ArrayList> mapTime) {
        this.mapTime = mapTime;
    }
    
    
        
    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract String getOrganizacao();

    public abstract void setOrganizacao(String organizacao);
    
    
}
