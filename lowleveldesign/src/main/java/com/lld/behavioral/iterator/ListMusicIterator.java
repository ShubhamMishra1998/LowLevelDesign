package com.lld.behavioral.iterator;

import java.util.List;

public class ListMusicIterator implements Iterator<Song> {

    private final List<Song> songs;
    private int index;

    public ListMusicIterator(List<Song> songs) {
        this.songs = songs;
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(index++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }


}
