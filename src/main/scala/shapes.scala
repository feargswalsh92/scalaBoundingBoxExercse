package edu.luc.cs.laufer.cs372.shapes

/**
 * data Shape = Rectangle(w, h) | Location(x, y, Shape)
 */
sealed trait Shape

case class Rectangle(width: Int, height: Int) extends Shape {
  require(width >= 0 ,"the width is negative")
  require(height >= 0 ,"the height is negative")

}

case class Location(x: Int, y: Int, shape: Shape) extends Shape {
  require(shape != null, "null shape in location")
}

case class Ellipse(minor: Int,major: Int) extends Shape {
  require(minor >= 0 ,"the minor axes is negative")
  require(major >= 0 ,"the major axes is negative")
}


case class Group(shapes: Shape*) extends Shape
{
  //add validitiy checking
}


//add valididity checking





//case class

// DONE add missing case classes (see test fixtures)
// TODO must include validity checking for constructor arguments
