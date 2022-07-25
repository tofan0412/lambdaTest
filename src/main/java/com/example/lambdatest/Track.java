package com.example.lambdatest;

public class Track {
    private String name;
    private int trackNo;

    public Track(String name, int trackNo) {
        this.name = name;
        this.trackNo = trackNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrackNo() {
        return trackNo;
    }

    public void setTrackNo(int trackNo) {
        this.trackNo = trackNo;
    }
}
