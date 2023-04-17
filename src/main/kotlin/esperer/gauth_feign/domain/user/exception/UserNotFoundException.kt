package esperer.gauth_feign.domain.user.exception

import esperer.gauth_feign.global.error.ErrorCode
import esperer.gauth_feign.global.error.exception.BasicException

class UserNotFoundException : BasicException(ErrorCode.NOT_FOUND_USER)