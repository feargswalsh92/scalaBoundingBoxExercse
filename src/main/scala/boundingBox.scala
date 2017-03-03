package edu.luc.cs.laufer.cs372.shapes

// TODO: implement this behavior

object boundingBox {
  def apply(s: Shape): Location = s match {
    case Rectangle(_, _) => Location(0, 0, s)
    case Ellipse(min, maj) => Location(0 - min, 0 - maj, Rectangle(2 * min, 2 * maj))
    case Group(shapes @ _*) => {
      val bBoxes = shapes.map(s => apply(s))
      val minX = bBoxes.map(b => b.x).min
      val maxX = bBoxes.map(b => b.x + b.shape.asInstanceOf[Rectangle].width).max
      val minY = bBoxes.map(b => b.y).min
      val maxY = bBoxes.map(b => b.y + b.shape.asInstanceOf[Rectangle].height).max
      //locationsList foldLeft

      ///recursively
      Location(minX,minY, Rectangle(maxX - minX,maxY - minY))
  }

      //nested case statement







  //this program is taking shapes, depending on which shape it is it is goin to be a location.
      //a location

    //receiving error requiring me to pass a locaiton
    case Location() => {
      Location(0, 0, Rectangle(0, 0))

    }

    // not yet implemented
  }
}
