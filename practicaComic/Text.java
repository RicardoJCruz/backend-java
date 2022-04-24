import java.io.FileInputStream;
import java.io.IOException;

public class Text implements Runnable{
    Screen s;
    long millis;
    public Text(Screen s, long millis) {
        this.s = s;
        this.millis = millis;
    }

    // Lee un archivo de texto y muestra el contenido en un screen
    public void run() {
        try {
            FileInputStream fis = new FileInputStream("src\\dialog.txt");
            int i;
            while ((i = fis.read()) != -1) {
                // 124 es el caracter '|' que indica una nueva pagina
                if (i == 124) {
                    Thread.sleep(millis);
                    s.cls();
                } else {
                    // Imprime los dialogos de la pagina correspondiente
                    char a = (char)i;
                    s.out(String.valueOf(a), "MV Boli", 24, Colors.PrestigeBlue);
                }
            }
            fis.close();
        } catch (IOException | InterruptedException ioe) {
            ioe.printStackTrace();
        }
    }
}
