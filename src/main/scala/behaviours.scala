package edu.luc.cs.laufer.cs372.shapes

// DONE: implement this behavior

object behaviours {
  def boundingBox(s: Shape): Location = s match {
    case Rectangle(_, _) => Location(0, 0, s)
    case Ellipse(min, maj) => Location(0 - min, 0 - maj, Rectangle(2 * min, 2 * maj))
    case Group(shapes@_*) => {
      val bBoxes = shapes.map(s => boundingBox(s))
      val minX = bBoxes.map(b => b.x).min
      val maxX = bBoxes.map(b => b.x + b.shape.asInstanceOf[Rectangle].width).max
      val minY = bBoxes.map(b => b.y).min
      val maxY = bBoxes.map(b => b.y + b.shape.asInstanceOf[Rectangle].height).max
      //locationsList foldLeft

      ///recursively
      Location(minX, minY, Rectangle(maxX - minX, maxY - minY))

    }
    case Location(x, y, s) => {
      val bBox = boundingBox(s)
      Location(x + bBox.x, y + bBox.y, bBox.shape)


    }
  }

  def size(s:Shape): Int = s match {

    case Rectangle(_,_) => 1
    case Ellipse(min,maj) => 1
    case Location(x,y,s) => size(s)
    case Group(shapes @_*) => {
      val shapesList = shapes
      shapesList.foldLeft(0)((a,s1) => size(s1)+a)
    }



  }
      //nested case statement







  //this program is taking shapes, depending on which shape it is it is goin to be a location.
      //a location

    //receiving error requiring me to pass a locaiton


    // not yet implemented



}
