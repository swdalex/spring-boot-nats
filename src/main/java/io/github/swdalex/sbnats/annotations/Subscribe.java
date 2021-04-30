package io.github.swdalex.sbnats.annotations;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Subscribe {

    /**
     * @return {@link #subscribe()}
     */
    @AliasFor("subscribe")
    String value() default "";

    /**
     * The Nats subject to subscribe to.
     *
     * @return the Nats Subject
     */
    @AliasFor("value")
    String subscribe() default "";


    /**
     * Queue name
     *
     * @return the nats queue name
     */
    String queue() default "";
}