package pl.pjatk.rentalservice.model;

import io.swagger.annotations.ApiModelProperty;

public class Movie {

    @ApiModelProperty(notes = "Movie id", required = true, value = "id", example = "1")
    private Long id;
    @ApiModelProperty(notes = "Movie name", required = true, value = "name", example = "Hello")
    private String name;
    @ApiModelProperty(notes = "Movie category", required = true, value = "category", example = "ACTION")
    private Category category;
    @ApiModelProperty(notes = "Movie is available", required = true, value = "isAvailable", example = "true")
    private boolean isAvailable;

    public Movie() {
    }

    public Movie(Long id, String name, Category category, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
