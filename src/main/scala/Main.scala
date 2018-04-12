import br.unb.cic.epl.Core
import br.unb.cic.epl.Eval
import br.unb.cic.epl.Add
import br.unb.cic.epl.AddEval
import br.unb.cic.epl.Sub
import br.unb.cic.epl.SubEval
import br.unb.cic.epl.Mul
import br.unb.cic.epl.MulEval

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  println(lit100.eval())
  println(lit500.eval())
  
  val sumEval = new AddEval.Add(lit100, lit500) 
  val difEval = new SubEval.Sub(lit500, lit100) 
  val prodEval = new MulEval.Mul(lit100, lit500)
 
  println(sumEval.print() + " = " + sumEval.eval())
  println(difEval.print() + " = " + difEval.eval())
  println(prodEval.print() + " = " + prodEval.eval())

  println(1.max(2) + 1) 
}
