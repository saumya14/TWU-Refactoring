package com.twu.refactor;

//Understands the concept of rental of objects.
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int daysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double calculateRentalAmount()
    {
        double rentalAmount=0;
        switch (movie.getPriceCode()) {
            case Movie.REGULAR:
                rentalAmount += 2;
                if (daysRented > 2)
                    rentalAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                rentalAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                rentalAmount += 1.5;
                if (daysRented > 3)
                    rentalAmount += (daysRented - 3) * 1.5;
                break;

        }
        return rentalAmount;
    }
}