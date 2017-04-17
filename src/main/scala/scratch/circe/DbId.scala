package scratch.circe
abstract class DbId[T](innerId: T) {
 def isNew: Boolean
 def value: T = innerId
}
class IntId(innerId: Int) extends DbId[Int](innerId) { override def isNew: Boolean = value < 0}
class LongId(innerId: Long) extends DbId[Long](innerId) { override def isNew: Boolean = value < 0}
class ShortId(innerId: Short) extends DbId[Short](innerId) { override def isNew: Boolean = value < 0}
