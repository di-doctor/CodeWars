import kotlinx.coroutines.*


suspend fun main(): Unit {
    coroutineScope {
        val job2 = launch(start = CoroutineStart.LAZY) {

            for (i in 10..15) {
                delay(300L)
                println(i)
            }
        }
        val job = launch(start = CoroutineStart.LAZY) {

            for (i in 0..5) {
                delay(200L)
                println(i)
                if (i == 4){
                    job2.start()
                    job2.join()
                }
            }
        }

        job.start()
        println("Hello Coroutines")
        job.join()
        println("GoodBuy Coroutines")

    }
    println("Finish Coroutine Scope")

}





