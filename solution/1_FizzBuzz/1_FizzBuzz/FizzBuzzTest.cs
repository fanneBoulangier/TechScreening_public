using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using fizzBuzz;

namespace test
{
    [TestClass]
    public class FizzBuzzTest
    {
        [TestMethod]
        public void fizzbuzz() {
            Assert.AreEqual("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizzbuzz, 16, 17", new FizzBuzz().fizzBuzzIt(17));
        }
    }
}
