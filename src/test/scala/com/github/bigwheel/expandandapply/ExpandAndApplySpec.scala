package com.github.bigwheel.expandandapply

import org.scalatest._

class ExpandAndApplySpec extends FunSpec with Matchers {

  describe("expandAndApply") {
    it ("should works correctly") {
      def itemDescription(name: String, yen: Int): String = s"$name: ${yen}yen"
      case class Item(name: String, yen: Int)
      val cola = Item("cola", 120)

      (itemDescription _).expandAndApply(cola) should be("cola: 120yen")
    }
  }

}
