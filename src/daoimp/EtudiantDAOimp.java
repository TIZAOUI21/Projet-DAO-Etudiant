/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimp;

import connection.ConnectionFactory;
import daointerface.EtudiantDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Etudiant;
/**
 *
 * @author Admin
 */
public class EtudiantDAOimp implements EtudiantDAO{
    
    Connection connection = ConnectionFactory.getConnection();
    
public EtudiantDAOimp () {     
    
}
// create a new Etudiant
/*public void create (Etudiant etudiant){



PreparedStatement preparedStatement;

try {
String createQuery = "INSERT INTO ETUDIANTS(id, name) VALUES(?,?)";
preparedStatement = connection.prepareStatement (createQuery);

preparedStatement.setInt(1, etudiant.getID());
preparedStatement.setString(2, etudiant.getfirstName());
preparedStatement.setString(3, etudiant.getlastName());
preparedStatement.setString(3, etudiant.getlastName());
preparedStatement.setString(3, etudiant.getgender());

preparedStatement.executeUpdate();
preparedStatement.close();



} catch (SQLException ex) {



ex.printStackTrace();



}*/
// Find by id
    @Override
    public Etudiant findById(int id) {

        Etudiant etudiant = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            String selectIdQuery = "SELECT * FROM etudiant where id = ?";
            preparedStatement = connection.prepareStatement(selectIdQuery);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            resultSet.next();
            etudiant = new Etudiant();
            etudiant.setId(resultSet.getInt("id"));
            etudiant.setfirstName(resultSet.getString("name"));
            resultSet.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return etudiant;
    }
}
