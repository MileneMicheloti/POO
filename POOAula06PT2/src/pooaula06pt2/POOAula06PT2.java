package pooaula06pt2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class POOAula06PT2 {

    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList();

        String selecao = JOptionPane.showInputDialog("Digite 1) Para inserir aluno | 2) Mostrar alunos | 3) Sair");

        while (!selecao.equals("3")) {
            if (selecao.equals("1")) {
                Aluno a = new Aluno();

                a.setNome(JOptionPane.showInputDialog("Informe o nome: "));
                a.setRa(Integer.parseInt(JOptionPane.showInputDialog("Informe o RA: ")));
                a.setCurso(JOptionPane.showInputDialog("Informe o curso: "));

                listaAlunos.add(a);
            } else {
                if (selecao.equals("2")) {
                    for (Aluno a : listaAlunos) {
                        JOptionPane.showMessageDialog(null, a.imprimir());
                    }
                }
            }
            selecao = JOptionPane.showInputDialog("Digite 1) inserir aluno | 2) Mostrar alunos | 3) Sair");
        }
    }
}
