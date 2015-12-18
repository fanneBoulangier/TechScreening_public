using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using teaching;

namespace test
{
    [TestClass]
    public class GradeMeTest
    {
        [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
	    public void canNotGradeBelowZero() {
		    Teacher.gradeMe(-1);
	    }
	
	    [TestMethod]
        [ExpectedException(typeof(ArgumentException))]
	    public void canNotGradeHigherThan100() {
		    Teacher.gradeMe(101);
	    }

        [TestMethod]
	    public void normalGrades() {
		    assertGrade('F', 0, 50);
		    assertGrade('E', 51, 59);
		    assertGrade('D', 60, 69);
		    assertGrade('C', 70, 79);
		    assertGrade('B', 80, 89);
		    assertGrade('A', 90, 100);
	    }
	
	    private void assertGrade(char expectedGrade, int startPercentage, int endPercentage) {
		    for (int aPercentage = startPercentage; aPercentage <= endPercentage; aPercentage++) {
			    Assert.AreEqual(expectedGrade, Teacher.gradeMe(aPercentage));
		    }
	    }
    }
}
