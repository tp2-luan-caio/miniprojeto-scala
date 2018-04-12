package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestHeight extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Height expression"

  var literal100: Height.Literal = _
  var literal200: Height.Literal = _

  before {
    literal100 = new Core.Literal(100) with Height.Literal
    literal200 = new Core.Literal(200) with Height.Literal
  }

  it should "return 1 when we call literal100.height()" in {
    val h = literal100.height()
  
    h should be (1)
  }

  it should "return 2 when we call call Add(Literal(100), Literal(200)).height()" in {
    val h = new OpHeight.Add(literal100, literal200)

    h.height() should be (2)
  }

  it should "return 3 when we call call Sub(Literal(100), Mul(Literal(200), Literal(100))).height()" in {
    val h = new OpHeight.Mul(literal100, literal200)
    val i = new OpHeight.Sub(literal100, h)

    i.height() should be (3)
  }
}