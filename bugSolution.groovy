```groovy
def foo(Closure c) {
  def result = c() 
  println "Closure returned: $result" //Handle return value
}

foo {println it}

foo { println it; return 100 }
```