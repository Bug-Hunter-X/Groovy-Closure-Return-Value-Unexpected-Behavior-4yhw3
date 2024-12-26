# Groovy Closure Return Value Unexpected Behavior

This example demonstrates unexpected behavior when a closure passed to a method returns a value.  The `foo` method simply executes the provided closure; however, the return value of the closure is ignored.  This can lead to subtle bugs and unexpected program flow if not understood. The solution demonstrates how to handle such situations, specifically addressing this return value handling.