public class Comic {
    // Velocidad de reproduccion del comic
    private final static long SPEED = 3900;

    public static void main(String[] args) {
        Screen comicS = makeScreen(50, 50, 750, 1000);
        Screen dialogS = makeScreen(750, 51, 500, 500);

        Thread comic = new Thread(new Pages(comicS, SPEED));
        Thread dialog = new Thread(new Text(dialogS, SPEED));
        Thread music = new Thread(new Music());
        comic.start();
        dialog.start();
        music.start();

        /* // Se puede iniciar pero no hace nada
        Thread menu = new Thread(new Menu(dialogS));
        menu.start();
         */
    }

    static Screen makeScreen(int x, int y, int w, int h) {
        Screen s = new Screen("FREE COMIC BOOK DAY 2021 SPIDER-MAN/VENOM # 1");
        s.setVisible(true);
        s.setBounds(x, y, w, h);
        return s;
    }
}
