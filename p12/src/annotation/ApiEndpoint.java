package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ApiEndpoint {
	String name();
	String version();
	String author();
	boolean secured() default false;
	
}
