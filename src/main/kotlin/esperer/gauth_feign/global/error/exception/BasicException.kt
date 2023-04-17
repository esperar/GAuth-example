package esperer.gauth_feign.global.error.exception

import esperer.gauth_feign.global.error.ErrorCode
import java.lang.RuntimeException

open class BasicException(val errorCode: ErrorCode) : RuntimeException(errorCode.message)