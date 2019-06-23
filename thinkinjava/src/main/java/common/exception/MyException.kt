package common.exception

class MyException: RuntimeException {
    private val code:Int
    private val msg: String

    constructor(exception: ExceptionEnum){
        this.code = exception.code
        this.msg = exception.msg
    }

    override fun toString(): String {
        return "MyException(code=$code, msg='$msg')"
    }


}