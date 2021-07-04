package de.swed.user;

public class Rating {
    private int stars;
    private Customer user;
    private String improvementSuggestions;

    //set methods

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setUser(Customer user) {
        this.user = user;
    }

    public void setImprovementSuggestions(String is) {
        this.improvementSuggestions = is;
    }

    //get methods
    public int getStars() {
        return stars;
    }

    public Customer getUser() {
        return user;
    }

    public String getImprovementSuggestions() {
        return improvementSuggestions;
    }

}
