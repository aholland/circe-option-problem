# circe-option-problem
Repo for Travis Brown demonstrating strange effect of doing `Some(invoiceSearchConstraints).asJson`

`git clone https://github.com/aholland/circe-option-problem.git`  
`sbt clean compile run`  
  
  
Output:  
```
Test Circe Started
isc = InvoiceSearchConstraints(Some(CrmContractorId(3)),Some(frag))  
opIsc = Some(InvoiceSearchConstraints(Some(CrmContractorId(3)),Some(frag)))  
isc.asJson = {"opContractorId":{"innerId":3},"opMinInvoiceNumberExclusive":"frag"}  
opIsc.asJson = {"opContractorId":[{"innerId":3}],"opMinInvoiceNumberExclusive":"frag"}  
Test Circe Finished
```
