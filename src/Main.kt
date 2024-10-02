import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main() {

    val file = File("C:/Users/Админ/Desktop/myfile.txt")
    file.writeFile("С новым годом: С новым счастьем")
    readFile(file.toString())
}

infix fun File.writeFile(text: String){
    val writer = FileWriter(this)
    writer.write(text)
    writer.close()
}

fun readFile(path: String){

    val reader = FileReader(path)
    val content = reader.readText()
    println(content)
    reader.close()
}