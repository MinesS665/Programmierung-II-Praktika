package annotation;

import java.lang.annotation.Annotation;

public class Main {

	public static void main(String[] args) {
		ApiEndpoint p = UserService.class.getAnnotation(ApiEndpoint.class);
		
		System.out.println(p.name());
		System.out.println(p.author());
		System.out.println(p.version());
		System.out.println(p.secured());
	}
}
