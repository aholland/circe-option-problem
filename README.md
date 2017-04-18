# circe-option-problem
Repo for Travis Brown demonstrating strange effect of doing `Some(invoiceSearchConstraints).asJson`

`git clone https://github.com/aholland/circe-option-problem.git`  
`sbt clean compile run`  
  
  
Output:  
```
Test Circe Started

 == Plain InvoiceSearchConstraints ==
plainObj = InvoiceSearchConstraints(Some(CrmContractorId(3)))
plainObj.asJson = {"opContractorId":3}
plainDecodedFromString = Right(InvoiceSearchConstraints(Some(CrmContractorId(3))))
plainViaReadMethod = InvoiceSearchConstraints(Some(CrmContractorId(3)))

 == Option[InvoiceSearchConstraints] ==
some = Some(InvoiceSearchConstraints(Some(CrmContractorId(3))))
someObj.asJson = [{"opContractorId":3}]
someDecodedFromStr = Left(DecodingFailure(CNil, List()))
java.lang.Exception: DecodingFailure(CNil, List())
        at scratch.circe.TestCirce$.read(TestCirce.scala:56)
        at scratch.circe.TestCirce$.main(TestCirce.scala:32)
        at scratch.circe.TestCirce.main(TestCirce.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:497)
        at sbt.Run.invokeMain(Run.scala:67)
        at sbt.Run.run0(Run.scala:61)
        at sbt.Run.sbt$Run$$execute$1(Run.scala:51)
        at sbt.Run$$anonfun$run$1.apply$mcV$sp(Run.scala:55)
        at sbt.Run$$anonfun$run$1.apply(Run.scala:55)
        at sbt.Run$$anonfun$run$1.apply(Run.scala:55)
        at sbt.Logger$$anon$4.apply(Logger.scala:84)
        at sbt.TrapExit$App.run(TrapExit.scala:248)
        at java.lang.Thread.run(Thread.java:745)
Caused by: DecodingFailure(CNil, List())

 == Holder ==
holder = Holder(Some(InvoiceSearchConstraints(Some(CrmContractorId(3)))))
holderJson.noSpaces = {"optionalInvoiceSearchConstraints":{"opContractorId":3}}
holderDecodedFromStr = Right(Holder(Some(InvoiceSearchConstraints(Some(CrmContractorId(3))))))
holderViaReadMethod = Holder(Some(InvoiceSearchConstraints(Some(CrmContractorId(3)))))
Test Circe Finished
[success] Total time: 0 s, completed 18-Apr-2017 09:50:44
```
