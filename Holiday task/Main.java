import java.util.*;

class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println(title + " - " + artist + " (" + duration + " sec)");
    }
}

class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void showPlaylist() {
        System.out.println("\nPlaylist: " + name);
        for (Song s : songs) {
            s.display();
        }
    }
}

class User {
    private String name;
    private Playlist playlist;

    public User(String name) {
        this.name = name;
        this.playlist = new Playlist("My Playlist");
    }

    public Playlist getPlaylist() {
        return playlist;
    }
}

abstract class Player {
    abstract void play(Song song);
    abstract void pause();
    abstract void stop();
}

class MusicPlayer extends Player {
    private int currentIndex = 0;
    private List<Song> songs;

    public MusicPlayer(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    void play(Song song) {
        System.out.println("Playing: " + song.getTitle());
    }

    @Override
    void pause() {
        System.out.println("Music Paused");
    }

    @Override
    void stop() {
        System.out.println("Music Stopped");
    }

    public void playNext() {
        if (currentIndex < songs.size()) {
            play(songs.get(currentIndex));
            currentIndex++;
        } else {
            System.out.println("End of playlist");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Create songs
        Song s1 = new Song("Song1", "Artist1", 200);
        Song s2 = new Song("Song2", "Artist2", 180);
        Song s3 = new Song("Song3", "Artist3", 220);

        // Create user
        User user = new User("Aldam");

        // Add songs to playlist
        user.getPlaylist().addSong(s1);
        user.getPlaylist().addSong(s2);
        user.getPlaylist().addSong(s3);

        // Show playlist
        user.getPlaylist().showPlaylist();

        // Play songs
        MusicPlayer player = new MusicPlayer(user.getPlaylist().getSongs());

        player.playNext();
        player.playNext();
        player.pause();
        player.playNext();
        player.stop();
    }
}
