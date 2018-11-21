package com.github.bigwheel.expandandapply

import org.scalatest._

class ExpandAndApplySpec extends FunSpec with Matchers {

  private[this] def itemDescription(name: String, yen: Int): String = s"$name: ${yen}yen"
  private[this] case class Item(name: String, yen: Int)
  private[this] val cola = Item("cola", 120)

  describe("expandAndApply") {
    it ("should works correctly") {
      (itemDescription _).expandAndApply(cola) should be("cola: 120yen")
    }
  }

  describe("expandAndPipe") {
    it ("should works correctly") {
      cola.expandAndPipe(itemDescription _) should be("cola: 120yen")
    }
  }

}
