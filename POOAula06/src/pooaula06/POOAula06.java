package pooaula06;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class POOAula06 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Milene", 1234, "ADS");
        Aluno aluno2 = new Aluno("Nando",5678,"ADS");
        
        ArrayList<Aluno> listaAlunos = new ArrayList();
        
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        
        for(int i = 0; i < listaAlunos.size(); i++){
            JOptionPane.showMessageDialog(null, listaAlunos.get(i).getNome());
        }
        for(Aluno a: listaAlunos){
            JOptionPane.showMessageDialog(null, a.getNome());
        }
    }

}
