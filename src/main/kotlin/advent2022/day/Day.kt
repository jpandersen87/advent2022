package advent2022.day

interface Day {
    fun run()

    companion object {
        fun readInput(resource: String): List<String> {
            return this::class.java.classLoader.getResourceAsStream(resource)?.bufferedReader()?.readLines()!!
        }
    }
}