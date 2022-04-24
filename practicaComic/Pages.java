public class Pages implements Runnable{
    Screen s;
    long millis;
    public Pages(Screen s, long millis) {
        this.s = s;
        this.millis = millis;
    }

    public void run() {
        for (int i = 1; i <= 46; i++) {
            s.cls();
            // Recorre las páginas del comic
            String page = "./img/page (" + i + ").png";
            s.showImage(page);
            try {
                // Pausa entre paginas
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}