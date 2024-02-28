
public class MusicBox{

    // Variables
    private String songID;
    private char isSongPremium;
    public String songTitle;
    private String songArtists;
    private String songAlbum;
    public String songGenre;
    private String songProducer;
    public String songMusicLabel;
    public int noAds;

    //Constructor
    public MusicBox(String songID, char premiumSong, String title, String artists, String Album, String genre, String producer, String label) {
        this.songID = songID;
        this.isSongPremium = premiumSong;
        this.songArtists = artists;
        this.songTitle = title;
        this.songAlbum = Album;
        this.songGenre = genre;
        this.songProducer = producer;
        this.songMusicLabel = label;
        // -- TODO
        /* Initialise  the rest of the variables in this Constructor block*/
    }
    
    
    //Methods
    public String getSongID() {
        return songID;
    }

    public String getSongArtists() {
        return songArtists;
    }

    public char getPremiumSong() {
        return isSongPremium;
    }

    public String songTitle() {
        return songTitle;
    }
    
    public String songAlbum() {
        return songAlbum;
    }

    public String songGenre() {
        return songGenre;
    }

    public String songProducer() {
        return songProducer;
    }

    public String songMusicLabel() {
        return songMusicLabel;
    }
    // -- TODO
        /* Create the rest of "getters" for the remaining variables */
    
    

    private void playAd(int ads, char premium) {
        if (ads == 1) {
            System.out.println("Playing Ad 1");
        }
        else {
            for(int i=1; i<=ads; i++){
                System.out.println("Playing Ad " + i);
            }
        }
        
    }
    
}

