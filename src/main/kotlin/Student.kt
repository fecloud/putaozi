package org.example

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

val resources = arrayListOf(
    //unit1
    Content("4d2eae26-4744-4f6b-ab6b-40db538cafd2", "Hello!", 72, 1),
    Content("ec8cdddb-561c-4030-84a3-78a723d780a6", "Little Rabbit, Happy Turtle", 73, 1),
    Content("55c99f68-deae-4913-bec2-afbe4252d65d", "Stand Up!", 74, 1),
    Content("e5f6fd1c-eb1c-40e9-b4e4-e7a50596e6cb", "Phonics Funtime D&M", 75, 1),
    Content("5165f748-4c83-429d-b264-48c4f36852bf", "Ten Little Monkeys", 76, 1),
    Content("be16e946-571e-4505-8ee1-9d8d207eae0d", "Lineman D", 77, 1),
    Content("9e08ae2d-6cd8-4053-bb7b-d31f85ceab4b", "What Do You See", 78, 1),
    Content("43e1f21a-0c7f-4885-a497-274055145825", "Lineman M", 79, 1),
    Content("58029a92-52fc-4b6a-a770-6b76ef557fcd", "Monkey", 80, 1),
    Content("849f12e6-34f1-415b-b8b5-9cbde60fcdeb", "Red", 81, 1),
    Content("f2498f87-2904-4cdf-a5fa-b15392a56eea", "Animals Play", 82, 1),
    Content("061487f8-8d44-4b34-adf8-e1bf1547595b", "Flashcard Friends Part 1", 83, 1),
    Content("54d3814d-5ea5-4691-96ca-fc95fa621c57", "Good Morning Song", 84, 1),
    Content("13334e85-6872-44ce-9e02-27271ee4f5a7", "Where", 85, 1),
    Content("27d83e24-effe-47af-bdaa-e5c42d4c4598", "I Love Them All", 86, 1),
    Content("414bbcad-5441-4baf-a2eb-06dac5a936ee", "Friends", 87, 1),
    Content("9c707d4c-dc88-4cbf-bdfe-c071d67104ab", "One", 88, 1),
    Content("30cde435-5d1f-4141-ab4b-f2f444eadc6e", "Phonics Funtime F", 89, 1),
    Content("9ba1b28d-6665-4067-ab51-847864f088d1", "Family and Friends", 90, 1),
    Content("856103ff-702c-49dd-bfb9-2103b5d1d6b2", "Lineman F", 91, 1),
    Content("0abc149a-cde6-4f7c-8a58-489ecccb6ccb", "Hop Like a Rabbit", 92, 1),
    Content("19044d3f-ca05-4962-b12f-25d8a3a0235b", "Family at the Zoo", 93, 1),
    Content("e777bb21-27b0-4c2b-85a5-3079bd313eff", "Flashcard Friends Part 2", 94, 1),
    Content("5b13607a-b159-409b-9175-67f78a8afa14", "Alphabet Song", 95, 1),
    Content("5a1bd3b6-2c19-4f54-947b-801af7247e25", "Zoo", 96, 1),
    Content("b6e8399a-3d58-4b2c-8c48-b2be4b76939d", "Five Little Elephants", 97, 1),
    Content("9fed03f9-093a-402a-aacf-4e34a02f418f", "Mouse in the Barn", 98, 1),
    Content("b82d65a1-7163-4d66-940e-cc77735e041e", "Phonics Funtime K&Z", 99, 1),
    Content("14b94b57-bed4-40a1-ba01-b86a797d1e0c", "Happy Birthday", 100, 1),
    Content("2c560c43-397c-4df1-b97a-db1557b6cdee", "Lineman K", 101, 1),
    Content("78300e38-1f91-4501-acae-805f31860b59", "How Old are You", 102, 1),
    Content("1f9f5bae-1918-489c-b990-00454cd5cc51", "Lineman Z", 103, 1),
    Content("bd72d318-082b-4095-9902-7f7fe9431fcf", "Let's Clean Up", 104, 1),
    Content("a6386e3d-9e9e-441a-8571-84254eb2a16c", "Flashcard Friends Part 3", 105, 1),
    Content("8c79106f-5bba-424c-963d-a1ae91e1ab6f", "Goodbye Song", 106, 1),
    Content("0b3a9d22-f938-40a6-b06a-5eaa7f63cda5", "Jonny Bear “This is Me!”", 107, 1),


    )

fun getMedia(base: String, item: Content): String {
    return File(base + "/.contents/" + item.id).listFiles().filter {
        it.name.endsWith("mp3") || it.name.endsWith("mp4")
    }.first().absolutePath
}

fun buildTarget(base: String, item: Content, type: String): String {
    return base + "/Unit${item.unit}/${item.sequence}-${item.name}$type"
}

fun copyFile(sourceFilePath: String, destinationFilePath: String) {
    try {
        val sourceFile = File(sourceFilePath)
        if (!sourceFile.exists()) {
            println("源文件不存在: $sourceFilePath")
            return
        }

        val destinationFile = File(destinationFilePath)
        val destinationDirectory = destinationFile.parentFile
        if (!destinationDirectory.exists()) {
            if (!destinationDirectory.mkdirs()) {
                println("无法创建目标文件夹: ${destinationDirectory.absolutePath}")
                return
            }
        }

        FileInputStream(sourceFile).use { inputStream ->
            FileOutputStream(destinationFile).use { outputStream ->
                val buffer = ByteArray(4096)
                var bytesRead: Int
                while (inputStream.read(buffer).also { bytesRead = it } != -1) {
                    outputStream.write(buffer, 0, bytesRead)
                }
            }
        }
        println("文件复制成功: $sourceFilePath 到 $destinationFilePath")
    } catch (e: IOException) {
        println("文件复制过程中出现错误: ${e.message}")
        throw e
    }
}

fun main() {

    val baseDir = "/Users/anker/Downloads/files"
    val targetDir = "/Users/anker/Downloads/putaozi"

    resources.forEach {
        val sourceFile = getMedia(baseDir, it)
        val targetFile = buildTarget(targetDir, it, sourceFile.substring(sourceFile.lastIndexOf(".")))
        copyFile(sourceFile, targetFile)
    }

}


data class Content(val id: String, val name: String, val sequence: Int, val unit: Int)