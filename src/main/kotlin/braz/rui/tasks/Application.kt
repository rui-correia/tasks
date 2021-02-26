package braz.rui.tasks

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("braz.rui.tasks")
		.start()
}

