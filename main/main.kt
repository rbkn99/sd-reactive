import io.reactivex.netty.protocol.http.server.HttpServer
import org.apache.log4j.BasicConfigurator
import server.ReactiveHttpServer

fun main() {
    val processor = ReactiveHttpServer
    BasicConfigurator.configure()
    HttpServer
        .newServer(8888)
        .start { request, response ->
            processor.process(request, response)
        }
        .awaitShutdown()
}