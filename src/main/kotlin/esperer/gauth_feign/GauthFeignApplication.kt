package esperer.gauth_feign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GauthFeignApplication

fun main(args: Array<String>) {
	runApplication<GauthFeignApplication>(*args)
}
