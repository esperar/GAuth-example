package esperer.gauth_feign.domain.user.domain.repository

import esperer.gauth_feign.domain.user.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long> {
}