package goupil


class Operation(name: String, date: String, amount: Int) {
    var name: String = name
    var date: String = date
    var amount: Int = amount


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Operation

        if (name != other.name) return false
        if (date != other.date) return false
        if (amount != other.amount) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + date.hashCode()
        result = 31 * result + amount
        return result
    }
}