fun main() {
    val chunk = Chunk()

    chunk.writeConstant(NumberValue(1.2), 1)
    chunk.writeOp(OpCode.RETURN, 1)

    chunk.disassemble()
}