package fi.academy.aiemmat;

import java.io.*;

public class Kirjoituskone {
    public static void main(String[] args) {

        String s;

        {
            try {
                System.out.println("Syötä tekstiä");
                s = new BufferedReader(new InputStreamReader(System.in)).readLine();
                FileWriter fw = new FileWriter("./kissa.txt", true); // Perään kirjoitus
                PrintWriter pw = new PrintWriter(fw); // Autoflush
                pw.println(s);
                fw.close();
                pw.close();

                File file = new File("C:\\Users\\jadem\\IdeaProjects\\Jihuu\\kissa.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                String rivi;
                while ((rivi = br.readLine()) != null)
                    System.out.println(rivi);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
