package br.unb.cic.epl

package object OpHeight {
  class Add(l: Height.Expression, r: Height.Expression) extends Add.GAdd with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def height(): Int = lhs.height.max(rhs.height()) + 1
  }

  class Sub(l: Height.Expression, r: Height.Expression) extends Sub.GSub with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def height(): Int = lhs.height.max(rhs.height()) + 1
  }

  class Mul(l: Height.Expression, r: Height.Expression) extends Mul.GMul with Height.Expression {
    type T = Height.Expression
    lhs = l
    rhs = r

    override def height(): Int = lhs.height.max(rhs.height()) + 1
  }
}