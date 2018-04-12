package br.unb.cic.epl

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestExp extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An expression"

  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _

  before {
    literal100 = new Core.Literal(100) with Eval.Literal
    literal200 = new Core.Literal(200) with Eval.Literal
  }

  it should "return String (100 + 200) * 100 when we call MulEval.Mul(add, literal100).print()" in {
    val add = new AddEval.Add(literal100, literal200)
    val exp = new MulEval.Mul(add, literal100)
  
    exp.print() should be ("((100 + 200) * 100)")
  }

  it should "return 10000 when we call call MulEval.Mul(sub, literal100).eval()" in {
    val sub = new SubEval.Sub(literal200, literal100)
    val exp = new MulEval.Mul(sub, literal100)

    exp.eval() should be (10000)
  }
}
