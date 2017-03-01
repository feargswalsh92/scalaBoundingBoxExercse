package edu.luc.cs.laufer.cs372.shapes

// TODO: implement this behavior

object boundingBox {
  def apply(s: Shape): Location = s match {
    case Rectangle(_, _)  => Location(0, 0, s)
    case Ellipse(min,maj) =>  Location(0-min,0-maj,Rectangle(0-min,0-maj))
    //receiving error requiring me to pass a locaiton
    case _ => Location(0, 0, Rectangle(0, 0))

    // not yet implemented
  }
}
