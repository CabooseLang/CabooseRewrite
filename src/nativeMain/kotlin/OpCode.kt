enum class OpCode {
    RETURN,
    CONSTANT,
    ;

    fun getByte(): Byte = ordinal.toByte()
}