package common.result

class Result {
    private val code: Int
    private val data: Any
    private val success: Boolean

    constructor(code: Int, success: Boolean, data: Any){
        this.code = code
        this.success = success
        this.data = data
    }

    open fun OK(data: Any): Result{
        return Result(200, true, data)
    }

    open fun ERROR(): Result{
        return Result(500, false, "")
    }
}