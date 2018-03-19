package com.bridgeit.customAnnotation;

import java.lang.reflect.Method;

public class TestMyAnnotation {

	public static void main(String[] args) throws Exception {

		MyAnnotationClass annotationClassObject = new MyAnnotationClass();
		Method methodObject = annotationClassObject.getClass().getMethod("show");

	/*	MyAnnotation myAnnot = methodObject.getAnnotation(MyAnnotationClass.class);
		myAnnot.value();
*/
	}
}
