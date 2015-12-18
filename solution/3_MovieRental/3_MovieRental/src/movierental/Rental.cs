using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace movierental
{
    /// <summary>
    /// The rental class represents a customer renting a movie.
    /// </summary>
    public class Rental
    {
        private Movie _movie;
        private int _daysRented;

        public Rental(Movie movie, int daysRented)
        {
            _movie = movie;
            _daysRented = daysRented;
        }

        public int getDaysRented()
        {
            return _daysRented;
        }

        public Movie getMovie()
        {
            return _movie;
        }
    }
}
