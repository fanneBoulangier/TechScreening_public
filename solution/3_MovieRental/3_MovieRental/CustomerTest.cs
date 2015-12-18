using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using movierental;

namespace test
{
    [TestClass]
    public class CustomerTest
    {
        [TestMethod]
        public void testCustomer() {
		    Customer c = new Customer("David");
		    Assert.IsNotNull(c);	
	    }

	    [TestMethod]
	    public void testAddRental() {
		    Customer customer2 = new Customer("Sallie");
		    Movie movie1 = new Movie("Gone with the Wind", Movie.REGULAR);
		    Rental rental1 = new Rental(movie1, 3); // 3 day rental
		    customer2.addRental(rental1);
	    }

	    [TestMethod]
	    public void testGetName() {
		    Customer c = new Customer("David");
		    Assert.AreEqual("David", c.getName());
	    }

	    [TestMethod]
	    public void statementForRegularMovie() {
		    Customer customer2 = new Customer("Sallie");
		    Movie movie1 = new Movie("Gone with the Wind", Movie.REGULAR);
		    Rental rental1 = new Rental(movie1, 3); // 3 day rental
		    customer2.addRental(rental1);
		    string expected = "Rental Record for Sallie\n" +
							    "\tGone with the Wind\t3.5\n" +
							    "Amount owed is 3.5\n" +
							    "You earned 1 frequent renter points";
		    string statement = customer2.statement();
            Assert.AreEqual(expected, statement);
	    }
	
	    [TestMethod]
	    public void statementForNewReleaseMovie() {
		    Customer customer2 = new Customer("Sallie");
		    Movie movie1 = new Movie("Star Wars", Movie.NEW_RELEASE);
		    Rental rental1 = new Rental(movie1, 3); // 3 day rental
		    customer2.addRental(rental1);
		    string expected = "Rental Record for Sallie\n" +
							    "\tStar Wars\t9.0\n" +
							    "Amount owed is 9.0\n" +
							    "You earned 2 frequent renter points";
		    string statement = customer2.statement();
            Assert.AreEqual(expected, statement);
	    }
	
	    [TestMethod]
	    public void statementForChildrensMovie() {
		    Customer customer2 = new Customer("Sallie");
		    Movie movie1 = new Movie("Madagascar", Movie.CHILDRENS);
		    Rental rental1 = new Rental(movie1, 3); // 3 day rental
		    customer2.addRental(rental1);
		    String expected = "Rental Record for Sallie\n" +
							    "\tMadagascar\t1.5\n" +
							    "Amount owed is 1.5\n" +
							    "You earned 1 frequent renter points";
		    String statement = customer2.statement();
            Assert.AreEqual(expected, statement);
	    }

        [TestMethod]
	    public void statementForManyMovies() {
		    Customer customer1 = new Customer("David");
		    Movie movie1 = new Movie("Madagascar", Movie.CHILDRENS);
		    Rental rental1 = new Rental(movie1, 6); // 6 day rental
		    Movie movie2 = new Movie("Star Wars", Movie.NEW_RELEASE);
		    Rental rental2 = new Rental(movie2, 2); // 2 day rental
		    Movie movie3 = new Movie("Gone with the Wind", Movie.REGULAR);
		    Rental rental3 = new Rental(movie3, 8); // 8 day rental
		    customer1.addRental(rental1);
		    customer1.addRental(rental2);
		    customer1.addRental(rental3);
		    String expected = "Rental Record for David\n" +
							    "\tMadagascar\t6.0\n" +
							    "\tStar Wars\t6.0\n" +
							    "\tGone with the Wind\t11.0\n" +
							    "Amount owed is 23.0\n" +
							    "You earned 4 frequent renter points";
		    String statement = customer1.statement();
            Assert.AreEqual(expected, statement);
	    }
	
	    //TODO make test for price breaks in code.
    }
}
