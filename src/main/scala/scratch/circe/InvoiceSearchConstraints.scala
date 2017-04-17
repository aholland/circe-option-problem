package scratch.circe
import scratch.ids
case class InvoiceSearchConstraints(opContractorId: Option[ids.CrmContractorId], opMinInvoiceNumberExclusive: Option[String])
