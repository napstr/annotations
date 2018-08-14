package space.npstr.annotations;


import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.checkerframework.framework.qual.TypeUseLocation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by napster on 19.01.18.
 */
@DefaultQualifier(value = NonNull.class, locations = TypeUseLocation.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldsAreNonNullByDefault {}
