[![codecov.io](https://codecov.io/github/arturdm/codecov-android-example/coverage.svg?branch=master)](https://codecov.io/github/arturdm/codecov-android-example?branch=master)

# codecov-android-example

This repository serves as an example on how to integrate [Codecov](https://codecov.io) in Android
projects.

# Add tasks to generate coverage reports

Codecov parses uploaded test coverage reports but your project is required to generate them first.
You can use [jacoco-android-gradle-plugin](https://github.com/arturdm/jacoco-android-gradle-plugin)
to create appropriate gradle tasks and run this command to generate the reports:

```
./gradlew jacocoTestReport
```

# Configure Travis CI

If you use [Travis CI](https://travis-ci.org) as your continuous integration server you can
configure it to build the project, generate test coverage reports and upload them to
[Codecov](https://codecov.io).

```yml
language: android
jdk: oraclejdk8
android:
  components:
  - tools
  - platform-tools
  - build-tools-23.0.2
  - android-23
  - extra-android-m2repository
script: ./gradlew build jacocoTestReport
after_success:
  - bash <(curl -s https://codecov.io/bash)
```
