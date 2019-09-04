/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lap
 */
public class TableLoadQueryExecuter {
    Connection con=null;
    PreparedStatement ps=null;
   
    public TableLoadQueryExecuter(){
         con=DBconnect.DBconnect.connect();
    }
    
    public ResultSet  loadTable(String query){
        ResultSet rs=null;
        try {
            ps=con.prepareStatement(query);            
            rs=ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(TableLoadQueryExecuter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
}
