class NumberValue(override val value: Double) : Value<Double> {
    override fun getValue(): Double = value
    override fun printValue() {
        print(value)
    }
}