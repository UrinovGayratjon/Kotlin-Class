class Example{
    var a = "Salom"
    init {
        println("Birinchi instalizatsion blok ${a}")
        a = "Dunyo"
    }
    init {
        println("Ikkinchi instalizatsion blok ${a}")
    }
}
fun main() {
    val example = Example()
}
