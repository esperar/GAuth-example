package esperer.gauth_feign.domain.auth.domain.repository

import esperer.gauth_feign.domain.auth.domain.RefreshToken
import org.springframework.data.repository.CrudRepository

interface RefreshTokenRepository : CrudRepository<RefreshToken, String> {
}