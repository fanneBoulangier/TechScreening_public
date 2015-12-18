using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using fibonacci;

namespace test
{
    [TestClass]
    public class FibonacciTest
    {
        [TestMethod]
        public void fibonacci()
        {
            Assert.AreEqual(0, new Fibonacci().bereken(0));
            Assert.AreEqual(1, new Fibonacci().bereken(1));
            Assert.AreEqual(1, new Fibonacci().bereken(2));
            Assert.AreEqual(2, new Fibonacci().bereken(3));
            Assert.AreEqual(3, new Fibonacci().bereken(4));
            Assert.AreEqual(5, new Fibonacci().bereken(5));
            Assert.AreEqual(8, new Fibonacci().bereken(6));
            Assert.AreEqual(13, new Fibonacci().bereken(7));
            Assert.AreEqual(21, new Fibonacci().bereken(8));
            Assert.AreEqual(34, new Fibonacci().bereken(9));
            Assert.AreEqual(55, new Fibonacci().bereken(10));
            Assert.AreEqual(89, new Fibonacci().bereken(11));
            Assert.AreEqual(144, new Fibonacci().bereken(12));
            Assert.AreEqual(233, new Fibonacci().bereken(13));
            Assert.AreEqual(377, new Fibonacci().bereken(14));
            Assert.AreEqual(610, new Fibonacci().bereken(15));
            Assert.AreEqual(987, new Fibonacci().bereken(16));
            Assert.AreEqual(1597, new Fibonacci().bereken(17));
            Assert.AreEqual(2584, new Fibonacci().bereken(18));
            Assert.AreEqual(4181, new Fibonacci().bereken(19));
            Assert.AreEqual(6765, new Fibonacci().bereken(20));
        }
    }
}
