# Sellable

Sellable is an open source project aimed at providing collaborative control
to sellers, supply chain operators and consumers over the entire product
life cycle.

## Quick Start

#### Dependencies

1. MySQL version 8.0
   * [Install MySQL](https://dev.mysql.com/doc/refman/8.0/en/installing.html)
     on your operating system
   * 'sellable' database user with access to the 'sellable_api' database
   * Proper password for sellable user configured in the
     src/main/resources/application.properties
2. Java version 17 or higher installed
3. [Gradle installed](https://gradle.org/install/) with Java 17 source
   version support
4. GitHub access (you need to be able to run git clone for public repos)

#### Starting the API

For a linux based operating system, do the following:

1. Cone the repository
```bash
> git clone https://github.com/grokthis/sellable.git
> cd sellable
```

2. Configure database connection in `src/main/resources/application.properties`

3. Run the API
```
> ./gradlew bootRun
```

## API Reference

*Coming Soon*

## Contribution

This project is not accepting contributions at this time. We are still working
on bootstrapping the project.

## License

This project is licensed under the Apache 2.0 license. See LICENSE file.
