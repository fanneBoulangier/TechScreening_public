using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using src.employedworker;

namespace test
{
    [TestClass]
    public class EmployedStudentTest
    {
        [TestMethod]
        public void testUNumber() {
		    EmployedStudent tom = new EmployedStudent("tom",1000);
		    EmployedStudent bob = new EmployedStudent("bob",1200);
		    Assert.IsFalse(tom.getUNumber() == bob.getUNumber());		
	    }

        [TestMethod]
	    public void testYearSalary() {
		    EmployedStudent tom = new EmployedStudent("tom",1000);
		    Assert.AreEqual(12000, tom.getYearSalary());
	    }
    }
}
