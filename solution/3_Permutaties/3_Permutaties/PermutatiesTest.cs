using System;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using permutaties;

namespace test
{
    [TestClass]
    public class PermutatiesTest
    {
        [TestMethod]
        public void legeSet() {
            setEquals(new HashSet<List<int>>(), ListUtil.permuteer(new HashSet<int>()));
	    }
	
	    [TestMethod]
	    public void setMetEenElement() {
            HashSet<List<int>> expected = new HashSet<List<int>>();
            expected.Add(new List<int>(new int [] {1}));

            setEquals(expected, ListUtil.permuteer(asSet(1)));
	    }
	
	    [TestMethod]
	    public void setMetTweeElementen() {
		    HashSet<List<int>> expected = new HashSet<List<int>>();
		    expected.Add(new List<int>(new int[] {1, 2}));
		    expected.Add(new List<int>(new int[] {2, 1}));
            setEquals(expected, ListUtil.permuteer(asSet(1, 2)));
	    }
	
	    [TestMethod]
	    public void setMetDrieElementen() {
		    HashSet<List<int>> expected = new HashSet<List<int>>();
		    expected.Add(new List<int>(new int[] {1, 2, 3}));
		    expected.Add(new List<int>(new int[] {1, 3, 2}));
		    expected.Add(new List<int>(new int[] {2, 1, 3}));
		    expected.Add(new List<int>(new int[] {2, 3, 1}));
		    expected.Add(new List<int>(new int[] {3, 1, 2}));
		    expected.Add(new List<int>(new int[] {3, 2, 1}));
		    setEquals(expected, ListUtil.permuteer(asSet(1, 2, 3)));
	    }
	
	    [TestMethod]
	    public void setMetVierElementen() {
		    HashSet<List<int>> expected = new HashSet<List<int>>();
		    expected.Add(new List<int>(new int[] {1, 2, 3, 4}));
		    expected.Add(new List<int>(new int[] {1, 2, 4, 3}));
		    expected.Add(new List<int>(new int[] {1, 3, 2, 4}));
		    expected.Add(new List<int>(new int[] {1, 3, 4, 2}));
		    expected.Add(new List<int>(new int[] {1, 4, 2, 3}));
		    expected.Add(new List<int>(new int[] {1, 4, 3, 2}));
		    expected.Add(new List<int>(new int[] {2, 1, 3, 4}));
		    expected.Add(new List<int>(new int[] {2, 1, 4, 3}));
		    expected.Add(new List<int>(new int[] {2, 3, 1, 4}));
		    expected.Add(new List<int>(new int[] {2, 3, 4, 1}));
		    expected.Add(new List<int>(new int[] {2, 4, 1, 3}));
		    expected.Add(new List<int>(new int[] {2, 4, 3, 1}));
		    expected.Add(new List<int>(new int[] {3, 1, 2, 4}));
		    expected.Add(new List<int>(new int[] {3, 1, 4, 2}));
		    expected.Add(new List<int>(new int[] {3, 2, 1, 4}));
		    expected.Add(new List<int>(new int[] {3, 2, 4, 1}));
		    expected.Add(new List<int>(new int[] {3, 4, 1, 2}));
		    expected.Add(new List<int>(new int[] {3, 4, 2, 1}));
		    expected.Add(new List<int>(new int[] {4, 1, 2, 3}));
		    expected.Add(new List<int>(new int[] {4, 1, 3, 2}));
		    expected.Add(new List<int>(new int[] {4, 2, 1, 3}));
		    expected.Add(new List<int>(new int[] {4, 2, 3, 1}));
		    expected.Add(new List<int>(new int[] {4, 3, 1, 2}));
            expected.Add(new List<int>(new int[] {4, 3, 2, 1}));
		    setEquals(expected, ListUtil.permuteer(asSet(1, 2, 3, 4)));
	    }

	    private HashSet<int> asSet(params int[] integers) {
		    HashSet<int> result = new HashSet<int>();
		    foreach (int integer in integers) {
			    result.Add(integer);
		    }
		    return result;
	    }

        private void setEquals(HashSet<List<int>> expected, HashSet<List<int>> actual)
        {
            Assert.AreEqual(expected.Count, actual.Count);
            foreach (List<int> list in expected)
            {
                bool inSet = false;
                foreach (List<int> actualList in actual)
                {
                    if (list.SequenceEqual(actualList))
                    {
                        inSet = true;
                    }
                }
                Assert.IsTrue(inSet);
            }
        }
    }
}
