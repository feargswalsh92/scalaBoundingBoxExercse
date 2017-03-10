package edu.luc.cs.laufer.cs372.shapes

import org.scalatest.FunSuite
import behaviours._

import TestFixtures._

class TestBoundingBox extends FunSuite {

  def testBoundingBox(description: String, s:Shape, x: Int, y: Int, width: Int, height: Int) = {
    test(description) {
      val b = behaviours.boundingBox(s)
      val r = b.shape.asInstanceOf[Rectangle]
      //      val Location(u, v, Rectangle(w, h)) = boundingBox(s)
      assert(x === b.x)
      assert(y === b.y)
      assert(width === r.width)
      assert(height === r.height)
    }
  }

  def testScale(description: String,s: Shape,factor:Int, expectedResultShape: Shape) = {
    test(description) {

      val scaledShape = behaviours.scale(s,factor)


      assert(scaledShape === expectedResultShape)

    }

  }



  def testSize(description: String, s: Shape, retSize: Int) = {
    test(description) {

      val n = size(s)
      assert(n === retSize)


    }
  }
    def testHeight(description: String, s: Shape, retHeight: Int) = {
      test(description)  {
        val h = height(s)
        assert(h=== retHeight)
      }
    }


  testScale("simple ellipse scaled",simpleEllipse,2,ellipseByTwo)
  testScale("simple rectangle scaled",simpleRectangle,2,simpleRectangleByTwo)
  testScale("simple location scaled",simpleLocation,2,simpleLocationByTwo)
  testScale("simple group scaled",basicGroup,2,basicGroupByTwo)

  // DONE comment these tests back in
  //bounding box
  testBoundingBox("simple ellipse", simpleEllipse, -50, -30, 100, 60)
  testBoundingBox("simple rectangle", simpleRectangle, 0, 0, 80, 120) //orig
  testBoundingBox("simple location", simpleLocation, 70, 30, 80, 120) //orig
  testBoundingBox("basic group", basicGroup, -50, -30, 100, 70)
  testBoundingBox("simple group", simpleGroup, 150, 70, 350, 280)
  testBoundingBox("complex group", complexGroup, 30, 60, 470, 320)


  //Size
  testSize("simple ellipse size",simpleEllipse,1)
  testSize("simple rectangle size",simpleRectangle,1)
  testSize("simple location size",simpleLocation,1)
  testSize("basic group size", basicGroup, 2)
  testSize("simple group size",simpleGroup,2)
  testSize("complex group size",complexGroup,5)

  testHeight("simple ellipse height",simpleEllipse,1)
  testHeight("simple rectangle height",simpleRectangle,1)
  testHeight("simple location height",simpleLocation,2)
  testHeight("basic group height", basicGroup, 2)
  testHeight("simple group height",simpleGroup,3)
  testHeight("complex group height",complexGroup,6)





  //
}