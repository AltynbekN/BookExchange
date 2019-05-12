package com.example.ExchangeBook.model;


import com.example.ExchangeBook.enums.Language;
import com.example.ExchangeBook.enums.State;
import lombok.Builder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="book_5")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Related to book only
    private Long id;
    private String title;
    private String author;
    private Language language;
    private int pages;
    private int year;
    private State state;
    //Related to exchange
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDateTime dateAdded;
    private Boolean isActive;
    private String description;


    private Book(){}
    public static class Builder {
        private Long id;
        private String title;
        private String author;
        private Language language;
        private int pages;
        private int year;
        private State state;

        private User user;
        private LocalDateTime dateAdded;
        private Boolean isActive;
        private String description;

        public Builder(String title) {
            this.title = title;
        }

        public Builder withAuthor(String author) {
            this.author = author;
            return this;
        }
        public Builder withLanguage(Language language) {
            this.language = language;
            return this;
        }
        public Builder withPages(int pages){
            this.pages = pages;
            return this;
        }
        public Builder withYear(int year){
            this.year = year;
            return this;
        }
        public Builder withState(State state){
            this.state = state;
            return this;
        }
        public Builder withUser(User user){
            this.user = user;
            return this;
        }
        public Builder withDateAdded(LocalDateTime date){
            this.dateAdded = date;
            return this;
        }
        public Builder withDescription(String description){
            this.description = description;
            return this;
        }
        public Builder isActive(Boolean isActive){
            this.isActive = isActive;
            return this;
        }
        //private String title;
        //        private String author;
        //        private Language language;
        //        private int pages;
        //        private int year;
        //        private State state;
        //
        //        private User user;
        //        private LocalDateTime dateAdded;
        //        private Boolean isActive;
        //        private String description;
        public Book build(){
            Book newBook = new Book();
            newBook.title = this.title;
            newBook.author = this.author;
            newBook.language = this.language;
            newBook.pages = this.pages;
            newBook.year = this.year;
            newBook.state = this.state;
            newBook.user = this.user;
            newBook.dateAdded = this.dateAdded;
            newBook.isActive = this.isActive;
            newBook.description = this.description;
            return newBook;
        }




    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public User getOwner() {
        return user;
    }

    public void setOwner(User owner) {
        this.user = owner;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }
}
