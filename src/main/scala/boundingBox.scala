package edu.luc.cs.laufer.cs372.shapes

// TODO: implement this behavior

object boundingBox {
  def apply(s: Shape): Location = s match {
    case Rectangle(_, _)  => Location(0, 0, s)
    case Ellipse(min,maj) =>  Location(0-min,0-maj,Rectangle(2*min,2*maj))
    case basicGroup(shapes @ _*) => {
      shapes.map(s => apply(s))
    }






  //this program is taking shapes, depending on which shape it is it is goin to be a location.
      //a location

    //receiving error requiring me to pass a locaiton
    case _ => Location(0, 0, Rectangle(0, 0))



    // not yet implemented
  }
}
