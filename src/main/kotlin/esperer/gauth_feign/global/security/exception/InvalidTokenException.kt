package esperer.gauth_feign.global.security.exception

import esperer.gauth_feign.global.error.ErrorCode
import esperer.gauth_feign.global.error.exception.BasicException

class InvalidTokenException : BasicException(ErrorCode.INVALID_TOKEN)