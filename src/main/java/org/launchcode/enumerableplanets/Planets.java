package org.launchcode.enumerableplanets;

public enum Planets {

  MERCURY("Mercury"),
  VENUS("Venus"),
  EARTH("Earth"),
  MARS("Mars"),
  JUPITER("Jupiter"),
  SATURN("Saturn"),
  URANUS("Uranus"),
  NEPTUNE("Neptune");

private final String planetName;


  Planets(String planetName) {
    this.planetName = planetName;
  }


  public String getPlanetName() {
    return planetName;
  }
}
