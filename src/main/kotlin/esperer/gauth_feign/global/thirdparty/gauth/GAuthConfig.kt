package esperer.gauth_feign.global.thirdparty.gauth

import gauth.GAuth
import gauth.impl.GAuthImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GAuthConfig {
    @Bean
    fun gAuth(): GAuth = GAuthImpl()
}