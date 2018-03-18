package com.qa.bookstore.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Book {

    @Id @GeneratedValue
    private Long id;

    @Column(length = 200)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(name = "unit_cost")
    private Float unitCost;

    private String isbn;

    @Column(name = "publication__date")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    @Column(name = "no_of_pages")
    private Integer noOfPages;

    @Column(name = "image_url")
    private String imageUrl;

    private Language language;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(Integer noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(title, book.title) &&
                Objects.equals(description, book.description) &&
                Objects.equals(unitCost, book.unitCost) &&
                Objects.equals(isbn, book.isbn) &&
                Objects.equals(publicationDate, book.publicationDate) &&
                Objects.equals(noOfPages, book.noOfPages) &&
                Objects.equals(imageUrl, book.imageUrl) &&
                language == book.language;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, unitCost, isbn, publicationDate, noOfPages, imageUrl, language);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", unitCost=" + unitCost +
                ", isbn='" + isbn + '\'' +
                ", publicationDate=" + publicationDate +
                ", noOfPages=" + noOfPages +
                ", imageUrl='" + imageUrl + '\'' +
                ", language=" + language +
                '}';
    }
}
