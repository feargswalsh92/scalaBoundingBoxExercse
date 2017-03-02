package edu.luc.cs.laufer.cs372.shapes

import org.scalatest.FunSuite

import TestFixtures._

class TestBoundingBox extends FunSuite {

  def testBoundingBox(description: String, s: Shape, x: Int, y: Int, width: Int, height: Int) = {
    test(description) {
      val b = boundingBox(s)
      val r = b.shape.asInstanceOf[Rectangle]
//      val Location(u, v, Rectangle(w, h)) = boundingBox(s)
      assert(x === b.x)
      assert(y === b.y)
      assert(width === r.width)
      assert(height === r.height)
    }
  }

  // TODO comment these tests back in

  testBoundingBox("simple ellipse", simpleEllipse, -50, -30, 100, 60)
  testBoundingBox("simple rectangle", simpleRectangle, 0, 0, 80, 120) //orig
// testBoundingBox("simple location", simpleLocation, 70, 30, 80, 120) //orig
  testBoundingBox("basic group", basicGroup, -50, -30, 100, 70)
//  testBoundingBox("simple group", simpleGroup, 150, 70, 350, 280)
//  testBoundingBox("complex group", complexGroup, 30, 60, 470, 320)
}
