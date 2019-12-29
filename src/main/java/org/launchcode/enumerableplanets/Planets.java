package org.launchcode.enumerableplanets;

public enum Planets {

  MERCURY("Mercury", 88, 0),
  VENUS("Venus", 225, 0),
  EARTH("Earth", 365, 1),
  MARS("Mars", 687, 2),
  JUPITER("Jupiter", 4333, 79),
  SATURN("Saturn", 10759, 83),
  URANUS("Uranus", 30687, 27),
  NEPTUNE("Neptune", 60200, 14);

private final String planetName;
private final int yearLength;
private final int numMoons;

  Planets(String planetName, int yearLength, int numMoons) {
    this.planetName = planetName;
    this.yearLength = yearLength;
    this.numMoons = numMoons;
  }


  public String getPlanetName() {
    return planetName;
  }

  public int getYearLength() {
    return yearLength;
  }

  public int getNumMoons() {
    return numMoons;
  }
}
