package com.bridgeit.customAnnotation;

class MyAnnotationClass {
	@MyAnnotation(value = 10)
	void show() {
		System.out.println("My Annotation class..");
	}
}
