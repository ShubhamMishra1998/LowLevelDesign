package com.lld.behavioral.iterator;

import java.util.Queue;

public class QueueMusicPlay implements Music<Song> {

    private final Queue<Song> songs;

    public QueueMusicPlay(Queue<Song> songs) {
        this.songs = songs;
    }


    @Override
    public Iterator<Song> getIterator() {
        return new QueueMusicIterator(songs);
    }
}
