package scratch.circe
import scratch.ids
import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._
object TestCirce {
 def main(args: Array[String]): Unit = {
  println("Test Circe Started")
  val isc = InvoiceSearchConstraints(Some(ids.CrmContractorId(3)), Some("frag"))
  val opIsc: Option[InvoiceSearchConstraints] = Some(isc)
  println("isc = " + isc)
  println("opIsc = " + opIsc)
  println("isc.asJson = " + isc.asJson.noSpaces)
  println("opIsc.asJson = " + opIsc.asJson.noSpaces)
  println("Test Circe Finished")
 }
}
