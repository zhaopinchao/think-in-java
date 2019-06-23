package common.exception

enum class ExceptionEnum {
    DIR_NOT_EXISTS(10001, "dir ont exists"),
    FILE_NOT_DIRECTORY(10002, "file not directory"),
    FILE_NOT_EXISTS(10003, "file not exists"),
    FILE_IS_DIRECTORY(10004, "file is directory"),
    ;

    private constructor(code: Int, msg: String) {
        this.code = code
        this.msg = msg
    }

    val code: Int
    val msg: String

}