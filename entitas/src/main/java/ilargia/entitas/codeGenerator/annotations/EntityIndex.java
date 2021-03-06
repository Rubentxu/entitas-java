package ilargia.entitas.codeGenerator.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;


@Retention(RetentionPolicy.SOURCE)
@Target({TYPE, FIELD, METHOD})
public @interface EntityIndex {

    EntityIndexType type() default EntityIndexType.ENTITY_INDEX;

}