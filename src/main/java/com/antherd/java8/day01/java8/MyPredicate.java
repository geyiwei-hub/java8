package com.antherd.java8.day01.java8;

@FunctionalInterface
public interface MyPredicate<T> {

	public boolean test(T t);

}
