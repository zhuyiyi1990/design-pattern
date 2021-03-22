package com.github.zhuyiyi1990.designpattern.filterpattern;

import java.util.List;

public interface Criteria {

    public abstract List<Person> meetCriteria(List<Person> persons);

}
