package iterators

open class ThreesAndFives (private val limit: Int) : Iterable<Int> {
    override fun iterator(): Iterator<Int> {
        return object : Iterator<Int> {
            private var nextThree = 3
            private var nextFive = 5

            override fun hasNext(): Boolean {
                return nextThree < limit || nextFive < limit
            }

            override fun next(): Int {
                var result = nextThree

                when {
                    nextThree < nextFive -> nextThree += 3
                    nextThree == nextFive -> {
                        nextThree += 3
                        nextFive += 5
                    }
                    else -> {
                        result = nextFive
                        nextFive += 5
                    }
                }

                return result
            }
        }
    }
}
