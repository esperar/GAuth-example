package esperer.gauth_feign.domain.user.domain.constant

import org.springframework.security.core.GrantedAuthority

enum class Role: GrantedAuthority {
    ROLE_STUDENT, ROLE_TEACHER, ROLE_GRADUATE, ROLE_ADMIN;
    override fun getAuthority(): String = name
}