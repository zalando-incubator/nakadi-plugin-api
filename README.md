# Nakadi-plugin-api

Nakadi-plugin-api is an API to develop extensions for [Nakadi](https://github.com/zalando/nakadi).

## Build

To build nakadi-plugin-api, run `gradle jar`. You may have to set bogus values for `sonatypeUsername` 
and `sonatypePassword` in your `gradle.properties`.

## Current plugin stubs

### ApplicationService

Plugins implementing ApplicationService are used to validate the `owning_application` field in an event type definition.

### AuthorizationService

Plugins implementing AuthorizationService are used to enforce per-event type and per-subscription authorization.

## Deployment

To deploy a new version of nakadi-plugin-api, you need write access to org.zalando on sonatype OSS.

* Add your credentials and GPG details to your Gradle configuration
* Check the version number
* Build, sign, and upload the archive with `./gradlew clean build uploadArchive`
* Close then release the repository in oss.sonatype.org