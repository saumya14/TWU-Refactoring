package com.twu.refactor;

import java.util.ArrayList;
import java.util.Iterator;

//Understands the entity that would be borrowing.
public class Customer {

	private String name;
	private ArrayList<Rental> rentalList = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentalList.add(arg);
	}

    public String displayRentalInformation() {
		double totalRentalAmount = 0;
		int frequentRenterPoints = 0;
		Iterator<Rental> rentals = rentalList.iterator();
        String displayedOutput = "Rental Record for " + name + "\n";
		while (rentals.hasNext()) {
			double rentalAmount;
			Rental eachRental = rentals.next();
            rentalAmount = eachRental.calculateRentalAmount();

            frequentRenterPoints = incrementFrequentRenterPoint(frequentRenterPoints);
			if (isNewReleaseRentedForTwoDays(eachRental))
                frequentRenterPoints = incrementFrequentRenterPoint(frequentRenterPoints);

            // show figures for this rental
			displayedOutput += "\t" + eachRental.getMovie().getTitle() + "\t"
					+ String.valueOf(rentalAmount) + "\n";
			totalRentalAmount += rentalAmount;

		}
		displayedOutput += "Amount owed is " + String.valueOf(totalRentalAmount) + "\n";
		displayedOutput += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		return displayedOutput;
	}

    private boolean isNewReleaseRentedForTwoDays(Rental each) {
        return (each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                && each.daysRented() > 1;
    }

    private int incrementFrequentRenterPoint(int frequentRenterPoints) {
        frequentRenterPoints++;
        return frequentRenterPoints;
    }


}
