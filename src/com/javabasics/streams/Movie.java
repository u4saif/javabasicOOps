package com.javabasics.streams;

public class Movie {

    private String title;
    private int totalLikes;

    public Genre getGenre() {
        return genre;
    }

    private  Genre genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }


    public Movie(String title, int totalLikes,Genre genre) {
        this.title = title;
        this.totalLikes = totalLikes;
        this.genre = genre;
    }

    @Override
    public String toString(){
        return title;
    }

//    @Override
//    public String toString() {
//        return "Movie{" +
//                "title:'" + title + '\'' +
//                '}';
//    }
}
