package Basic2;

import java.util.Arrays;

public class HongP2 {
    public static void main(String[] args) {
        Song s1 = new Song("HOT","캔디");
        Song s2 = new Song("르세라핌","안티프레져");
        Song s3 = new Song("조유리","러버블");

        Song[] songArr = new Song[]{s1,s2,s3};
        for (int i = 0; i < songArr.length; i++) {
            System.out.println(songArr[i].toStr());
        }
    }
}

class Song{
    String singerName;
    String songName;

    Song(String singerName, String songName) {
        this.singerName = singerName;
        this.songName = songName;
    }

    String toStr(){
        return String.format("노래: %s, 가수: %s", songName, singerName);
    }
}
