package Atividade13;

public class Main {
  
    public static void main(String[] args) {
     
        //Aluno[] alunos = new Aluno[2000];
        MapaHashVetor x = new MapaHashVetor();

        Aluno sabrina = new Aluno(1011, "Sabrina Fernandes");
        Aluno teste = new Aluno(20, "Teste Fernandes");
        Aluno filipi = new Aluno(1, "Filipi Fernandes");

        //alunos[sabrina.getMatricula()] = sabrina;
        //Aluno obj = alunos[sabrina.getMatricula()];
        //alunos[sabrina.getMatricula()] = null;

        x.put(2022, sabrina);
        x.put(1220, teste);
        x.put(1011, filipi);

        //System.out.println(obj.getMatricula() + obj.getNome() + "////");
        System.out.println(x.get(2022));
        System.out.println(x.get(1011));
        System.out.println(x.get(1220));
        System.out.println(x.get(1203));

    }

}
