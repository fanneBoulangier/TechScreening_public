using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace src.employedworker
{
    /// <summary>
    /// Een Employee heeft een jaarsalaris, berekend op basis van zijn maandsalaris
    /// </summary>
    public class Employee
    {
        private int monthSalary;

        public Employee(int monthSalary)
        {
            this.monthSalary = monthSalary;
        }

        public int getYearSalary()
        {
            return 12 * monthSalary;
        }
    }
}
