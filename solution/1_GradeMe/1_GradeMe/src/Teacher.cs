using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace teaching
{
    public class Teacher
    {
        /// <summary>
        /// In deze methode geeft de teacher aan een bepaald percentage een grade.
	    /// Bvb 52 -> E, 84 -> B 
        /// </summary>
        /// <param name="percentage">het behaalde percentage tussen 0 en 100</param>
        /// <returns>de grade behaald</returns>
        /// <exception cref="ArgumentException">als percentage < 0 of > 100</exception>
        public static char gradeMe(int percentage)
        {
            throw new NotImplementedException("implement me");
        }
    }
}
