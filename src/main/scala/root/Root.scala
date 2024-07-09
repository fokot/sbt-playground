package root

import dependent1.Dependent1
import dependent2.Dependent2

object Root:
  def f(): Int =
    Dependent1.f() + Dependent2.f()
