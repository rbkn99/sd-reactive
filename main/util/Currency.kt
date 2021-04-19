package util

enum class Currency(val longName: String, val relativeValue: Double) {

    RUB("Russian Rubles", 1.00),
    USD("US Dollars", 76.33),
    EUR("Euros", 91.73),
    JPY("Japanese Yen", 0.71);

    companion object : Converter {
        override fun convert(amount: Double, fromCurrency: Currency, toCurrency: Currency): Double {
            return amount * fromCurrency.relativeValue / toCurrency.relativeValue
        }
    }
}