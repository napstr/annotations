# Annotations
A bunch of handy annotations on top of Spotbugs annotations


## How to get these

###### Gradle build.gradle
```groovy
    repositories {
        maven { url 'https://jitpack.io' }
    }

    dependencies {
        compile group: 'space.npstr', name: 'annotations', version: '0.0.2'
    }

```

###### Maven pom.xml
```xml
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependency>
        <groupId>space.npstr</groupId>
        <artifactId>annotations</artifactId>
        <version>0.0.2</version>
    </dependency>
```

## Changelog

### v0.0.2
- Add copypasta of `@CheckReturnValue` annotation to avoid javax namespace pollution in java 9

### v0.0.1
- package/class/method level annotations: `@FieldsAreNonNullByDefault`, `@ParametersAreNonnullByDefault,` `@ReturnTypesAreNonNullByDefault`
