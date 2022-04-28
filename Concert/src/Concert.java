public class Concert {
    public static void main(String[] args) {
        Screen s = makeScreen();
        Views bp = new Views(s, new ConcertInfo().bands);
        bp.makeFrontPage();
        pause();
        bp.makeBandPage();
        pause();
        bp.makeLineUp();
        pause();
        new PrintInfo().save();
    }

    static Screen makeScreen() {
        Screen s = new Screen();
        s.setVisible(true);
        s.setBounds(500, 50, 700, 1000);
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