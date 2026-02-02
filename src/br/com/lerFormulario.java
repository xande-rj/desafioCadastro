import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class lerFormulario {
  static public ArrayList<String> list = new ArrayList<String>();

  public static void leitura() {
    File f = new File("formulario.txt");
    try (FileReader fr = new FileReader(f)) {
      BufferedReader br = new BufferedReader(fr);
      String linha;
      while ((linha = br.readLine()) != null) {
        list.add(linha);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {

    leitura();
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
