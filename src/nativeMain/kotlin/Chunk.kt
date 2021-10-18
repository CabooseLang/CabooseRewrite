class Chunk {
    private val code: MutableList<Byte> = mutableListOf()
    private val lines: MutableList<Int> = mutableListOf()
    private val constants: MutableList<Value<*>> = mutableListOf()

    fun writeByte(byte: Byte, line: Int) {
        code += byte
        lines += line
    }

    fun writeOp(opCode: OpCode, line: Int) {
        writeByte(opCode.getByte(), line)
    }

    fun addConstant(value: Value<*>): Int {
        constants += value
        return constants.size - 1
    }

    fun writeConstant(value: Value<*>, line: Int) {
        writeOp(OpCode.CONSTANT, line)
        val constantIndex = addConstant(value)
        writeByte(constantIndex.toByte(), line)
    }

    fun disassemble() {

    }
}