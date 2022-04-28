public class Concert {
    public static void main(String[] args) {
        Screen s = makeScreen();

        // Band Page
        Views bp = new Views(s, new ConcertInfo().bands);
        bp.makeFrontPage();
        pause();
        //s.cls();
        bp.makeBandPage();
        pause();
        bp.makeLineUp();
    }

    static Screen makeScreen() {
        Screen s = new Screen();
        s.setVisible(true);
        s.setBounds(50, 50, 1000, 1000);
        return s;
    }

    static void pause(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
