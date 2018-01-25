# Annotations
A bunch of handy annotations on top of Spotbugs annotations


## How to get these

###### Gradle build.gradle
```groovy
    repositories {
        maven { url 'https://jitpack.io' }
    }

    dependencies {
        compile group: 'space.npstr.annotations', name: 'annotations', version: '0.0.1'
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
        <groupId>space.npstr.annotations</groupId>
        <artifactId>annotations</artifactId>
        <version>0.0.1</version>
    </dependency>
```

## Changelog

### v0.0.1
- package/class/method level annotations: `@FieldsAreNonNullByDefault`, `@ParametersAreNonnullByDefault,` `@ReturnTypesAreNonNullByDefault`
