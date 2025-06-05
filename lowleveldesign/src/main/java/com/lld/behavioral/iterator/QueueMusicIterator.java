package com.lld.behavioral.iterator;

import java.util.Queue;

public class QueueMusicIterator implements Iterator<Song> {
    private final Queue<Song> song;

    public QueueMusicIterator(Queue<Song> song) {
        this.song = song;
    }


    @Override
    public boolean hasNext() {
        return !song.isEmpty();
    }

    @Override
    public Song next() {
        return song.poll();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
