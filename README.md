[![Build Status](https://travis-ci.org/arturdm/example-android.svg?branch=master)](https://travis-ci.org/arturdm/example-android)
[![codecov.io](https://codecov.io/github/arturdm/example-android/coverage.svg?branch=master)](https://codecov.io/github/arturdm/example-android?branch=master)
# Codecov Android Example

This repository serves as an example on how to integrate [Codecov](https://codecov.io) in Android
projects.

# Unit tests coverage reports

Codecov parses uploaded test coverage reports but your project is required to generate them first.
You can use [jacoco-android-gradle-plugin](https://github.com/arturdm/jacoco-android-gradle-plugin)
to create appropriate gradle tasks and run this command to generate the reports:

```
./gradlew jacocoTestReport
```

# Instrumentation tests coverage reports

Generating instrumentation tests code coverage reports requires a minor change to the build script.

```groovy
android {
  buildTypes {
    debug {
      testCoverageEnabled true
    }
  }
}
```

Running the command below generates the reports: 

```
./gradlew connectedCheck
```

# Configure Travis CI

If you use [Travis CI](https://travis-ci.org) as your continuous integration server you can
configure it to build the project, generate test coverage reports and upload them to
[Codecov](https://codecov.io). See an example [.travis.yml](.travis.yml) file on how to do this.
