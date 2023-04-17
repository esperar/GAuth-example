package esperer.gauth_feign.global.security.jwt

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "jwt.time")
class JwtExpiredTimeProperties(
    val accessExp: Int,
    val refreshExp: Int
)
