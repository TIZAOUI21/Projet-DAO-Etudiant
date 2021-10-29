/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proojetetudiantdao;

import daoimp.EtudiantDAOimp;
import daointerface.EtudiantDAO;
import model.Etudiant;

/**
 *
 * @author Admin
 */
public class ProjetEtudiantDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   EtudiantDAO dao = new EtudiantDAOimp() ;
   Etudiant e = dao.findById(1);
   //System.out.println("id : "+ e.;
   System.out.println("FirstName : "+ e.getfirstName());
    }
    
}
