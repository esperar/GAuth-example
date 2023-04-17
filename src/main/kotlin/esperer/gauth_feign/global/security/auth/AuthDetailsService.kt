package esperer.gauth_feign.global.security.auth

import esperer.gauth_feign.domain.user.domain.repository.UserRepository
import esperer.gauth_feign.domain.user.exception.UserNotFoundException
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class AuthDetailsService(
    private val userRepository: UserRepository
): UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails =
        userRepository.findByEmail(username)
            .let { it ?: throw UserNotFoundException() }
            .let { AuthDetails(it) }

}