package edu.luc.cs.laufer.cs372.shapes

/**
 * data Shape = Rectangle(w, h) | Location(x, y, Shape)
 */
sealed trait Shape

case class Rectangle(width: Int, height: Int) extends Shape

case class Location(x: Int, y: Int, shape: Shape) extends Shape {
  require(shape != null, "null shape in location")
}

case class Ellipse(minor: Int,major: Int) extends Shape


case class basicGroup(ellipse: Ellipse, rectangle: Rectangle) extends Shape



//case class

// TODO add missing case classes (see test fixtures)
// TODO must include validity checking for constructor arguments
