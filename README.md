# text-justify
A simple utility to justify text

The main API is a JustificationStrategy, which offers:

String justify(String s, int length)

Implementations are provided for left, right, center, and full.

To run pre-built version:

java -jar textjustify-1.0-SNAPSHOT-all.jar

To build from source:
./gradlew shadowJar

The lib will be available in build/libs
