```groovy
def foo(Closure c) {
  c() 
}

foo {println it}

foo { println it; return 100 }
```