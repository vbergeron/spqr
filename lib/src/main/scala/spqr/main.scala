package spqr

import scala.scalanative.unsafe.*

object spqr:
  @exported("get_sum_impl")
  def getSumImpl(a: Int, b: Int): Int = a + b
