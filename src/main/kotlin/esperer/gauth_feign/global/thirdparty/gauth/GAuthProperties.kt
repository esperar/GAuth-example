package esperer.gauth_feign.global.thirdparty.gauth

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "gauth")
data class GAuthProperties(
    val clientId: String,
    val clientSecret: String,
    val redirectUri: String
)

