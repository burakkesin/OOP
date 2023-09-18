public class Lamba {

    public boolean durumu = false;

    public void lambaDurumu(String konum){
        if(durumu){
            System.out.println( konum+ "Lamba Açık");
        }else {
            System.out.println(konum +"Lamba Kapalı");
        }
    }
}

