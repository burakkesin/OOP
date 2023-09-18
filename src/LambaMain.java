public class LambaMain {
    public static void main(String[] args) {

        Lamba salonLambasi= new Lamba();
        salonLambasi.lambaDurumu("salon");
        salonLambasi.durumu = true;
        salonLambasi.lambaDurumu("salon");

        Lamba yatakLambası= new Lamba();
        yatakLambası.lambaDurumu("yatak");
    }
}
