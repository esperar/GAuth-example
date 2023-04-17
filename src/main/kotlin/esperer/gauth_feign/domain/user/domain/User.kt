package esperer.gauth_feign.domain.user.domain

import esperer.gauth_feign.domain.user.domain.constant.Role
import javax.persistence.*

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val email: String,

    val nickname: String,

    val grade: Int,

    val classNum: Int,

    val number: Int,

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "Role", joinColumns = [JoinColumn(name = "user_id")])
    var roles: MutableList<Role> = mutableListOf(),

    @Column(columnDefinition = "TEXT")
    var profileImg: String? = "",
) {
}