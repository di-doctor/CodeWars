import kotlinx.coroutines.*

suspend fun main() {
    println("StartProgram")
    coroutineScope {
        println(Thread.currentThread().name)
       val job =  launch(Dispatchers.Default) {
           try {
               println(Thread.currentThread().name)
               repeat(5) {
                   delay(timeMillis = 400)
                   println("$it")
               }
           }catch (e:CancellationException){
               println("Cancel")
           }

        }
        delay(1000)
        job.cancelAndJoin()
        job.join()
    }
    println("StopProgram")
}





