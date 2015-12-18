using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace src.lists
{
    /// <summary>
    /// Een filterable lijst is een lijst waarop je kan filteren
    /// </summary>
    /// <typeparam name="T"></typeparam>
    public interface FilterableList<T> : IList<T>
    {
        List<T> filter(FilterPredicate<T> filterPredicate);
    }
}
