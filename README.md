Demonstrates that packing all Wicket jars together in one jar
distribution does not work (before pull request for 7.1.0-SNAPSHOT).

This is because Wicket stops looking for Initializers after the first one found,
and there are multiple ones if they are all packed in a single jar.

To run the application simply type:
```
mvn exec:java
```

This will run out of the normal jars, and should work (you should see an
empty table). After "mvn install" try the following:
```
java -jar target/wicket-uberjar-sandbox-1.0.0-SNAPSHOT-jar-with-dependencies.jar
```

This should throw an Exception that property 'datatable.no-records-found' could not be found.


