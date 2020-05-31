# Toy Robot Coding Challenge in Scala

## Overview
The ubiquitous Toy Robot coding challenge aims to simulate a Toy Robot moving on a 5 x 5 table following these commands.
```
PLACE X,Y,F
MOVE
LEFT
RIGHT
REPORT
```
`PLACE X,Y,F` - Should be the first command to the Toy Robot, placing it at `X`,`Y` location and `F` facing **NORTH/SOUTH/EAST/WEST** direction.

`MOVE` - Moves the Toy Robot one unit forward

`LEFT` - Turns the Toy Robot left of its current direction

`RIGHT` - Turns the Toy Robot right of its current direction

`REPORT` - Writes to console the current Toy Robot location e.g. `0,0,NORTH`

The Toy Robot should not fall out of the table.

## Requirements
- Scala 2.13.2
- SBT

## Running the Application
```sbt
sbt "run src/test/resources/commands.txt"
```
This simulator takes commands from a file passed as an argument to the main class.

## Running the Tests
```sbt
sbt test
```
