package esperer.gauth_feign.global.error

class ErrorResponse(errorCode: ErrorCode){

    val message: String
    val code: Int

    init {
        message = errorCode.message
        code = errorCode.code
    }
}
