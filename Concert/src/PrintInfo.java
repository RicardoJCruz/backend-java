import java.io.FileOutputStream;
import java.io.IOException;

public class PrintInfo {

    ConcertInfo ci = new ConcertInfo();
    private String host = ci.getHost();
    private String event = ci.getEvent();
    private String timePlace = ci.getTimePlace();
    private String welcome = ci.getWelcome();
    private Band[] bands = ci.bands;

    String info;
    private void formatInfo(){

        host = host.replace("\n", "").replace("\t", " ");
        host = host.strip().trim();

        event = event.replace("\n", "").replace("\t", "");
        event = event.strip().trim();

        timePlace = timePlace.replace("\n", "").replace("\t", " ");
        timePlace = timePlace.strip().trim();

        welcome = welcome.replace("\n", "").replace("\t", " ");
        welcome = welcome.strip().trim();
    }

    private void createFile() {
        formatInfo();

        info = host + "\n" + event + " CON" + "\n";
        for(int i = 0, n = bands.length; i < n; i++) {
            info += "+ " + bands[i].getName().strip() + "\n";
        }
        info += timePlace + "\n" + welcome;
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\" + System.getProperty("user.name") +"\\Desktop\\Concert.txt");
            byte b[] = info.getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void save() {
        Dialog d = new Dialog();
        if ((d.readOption(d.opt, "¿Guardar invitación en disco?", d.tit, 0)) == 0) {
            createFile();
            d.display("Archivo guardado en C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Concert.txt", 'I');
        } else
            d.display("¡Gracias por tu atención", 'P');
    }
}
