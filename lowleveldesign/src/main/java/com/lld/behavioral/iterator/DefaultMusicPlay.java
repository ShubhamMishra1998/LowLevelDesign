package com.lld.behavioral.iterator;

import java.util.List;

public class DefaultMusicPlay implements Music<Song>{

    private final List<Song> songs;

    public DefaultMusicPlay(List<Song> songs) {
        this.songs = songs;
    }


    @Override
    public Iterator<Song> getIterator() {
        return new ListMusicIterator(songs);
    }
}
