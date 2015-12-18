using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace src.lists
{
    public interface FilterPredicate<T>
    {
        bool matches(T anObject);
    }
}
