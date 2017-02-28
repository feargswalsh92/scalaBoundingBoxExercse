package edu.luc.cs.laufer.cs372.shapes

// TODO: implement this behavior

object boundingBox {
  def apply(s: Shape): Location = s match {
    case _ => Location(0, 0, Rectangle(0, 0))
    case Rectangle(0,0) => apply(s)



    // not yet implemented
  }
}
