package com.jspiders.musicplayer.entity;

public class Song {
	private int number;
	private String song;
	private String singer;
	private double duration;
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Song(int number, String song, String singer, double duration)
		{
			this.number=number;
			this.singer=singer;
			this.song=song;
			this.duration=duration;
		}
	@Override
	public String toString() {
		return "Song number="
	           + number + ",song name=" + song +
	           ", singer of the song=" + singer
				+ ", song duration is=" + duration ;
	}
	public Song(){

	}
}
	

