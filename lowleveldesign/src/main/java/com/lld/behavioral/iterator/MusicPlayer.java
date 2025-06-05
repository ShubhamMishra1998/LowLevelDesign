package com.lld.behavioral.iterator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MusicPlayer {
    public static void main(String[] args) {
        Song song1 = new Song("song1", 10);
        Song song2 = new Song("song2", 5);
        Song song3 = new Song("song3", 15);
        Song song4 = new Song("song4", 9);

        List<Song> songs = Arrays.asList(song1,song2,song3,song4);
        Queue<Song> songs1 = new LinkedList<>();
        songs1.add(song1);
        songs1.add(song2);
        songs1.add(song3);
        songs1.add(song4);

        Music music = new DefaultMusicPlay(songs);
        Music music1 = new QueueMusicPlay(songs1);

        Iterator<Song> iterator1 = music.getIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();

        Iterator<Song> iterator2 = music1.getIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }



    }
}
