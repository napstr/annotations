package space.npstr.annotations;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by napster on 19.01.18.
 * <p>
 * Copypasta of {@link javax.annotation.ParametersAreNonnullByDefault} to avoid polluting the javax namespace which
 * actually becomes a real issue with java 9 modules
 */
@Nonnull
@TypeQualifierDefault(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface ParametersAreNonnullByDefault {
}