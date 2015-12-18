using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace src.employedworker
{
    /// <summary>
    /// Een Student heeft een uniek studentnummer
    /// </summary>
    public class Student
    {
        private long uNumber;

        public Student(string name)
        {
            this.uNumber = name.GetHashCode() + new DateTime().Ticks;
        }

        public long getUNumber()
        {
            return uNumber;
        }
    }
}
