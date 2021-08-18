# Reproducer for SNAKE\_CASE issue

## Build

```
mvn clean install
```

## Run

```
java -jar target/build-finder-snake-jar-with-dependencies.jar
```

The example runs with first, the Jackson object mapper configured without the
snake case property, and then parsing the file `test.json`. Then a second
object mapper is created and configured to use the snake case property, then
parsing the file `test.json` and setting the `kojiHubURL` to null.

```
$ java -jar target/build-finder-snake-jar-with-dependencies.jar
-- Before setting property naming strategy
https://indy.com
-- After setting property naming strategy
null
```
