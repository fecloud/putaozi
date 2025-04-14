package org.example

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

val resources = arrayListOf(
    Content("4d2eae26-4744-4f6b-ab6b-40db538cafd2", "Hello!", 72, 1),
    Content("ec8cdddb-561c-4030-84a3-78a723d780a6", "Little Rabbit, Happy Turtle", 73, 1),
    Content("55c99f68-deae-4913-bec2-afbe4252d65d", "Stand Up!", 74, 1),
    Content("e5f6fd1c-eb1c-40e9-b4e4-e7a50596e6cb", "Phonics Funtime D&M", 75, 1),
    Content("5165f748-4c83-429d-b264-48c4f36852bf", "Ten Little Monkeys", 76, 1),
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