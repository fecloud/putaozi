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

    Content("49e8adc4-47dc-4de3-9122-f11e15ae1763", "Early in the Morning", 47, 2),
    Content("80232af2-f6de-4ce9-90e3-5e7d5b91d43e", "Flashcard Friends Part 1", 48, 2),
    Content("e9eb4529-6bfe-4274-9a96-9d1d070d0e32", "Just Wiggle!", 49, 2),
    Content("175bd643-3751-4cb3-baff-ffbc66c6bd36", "Two Little Eyes", 50, 2),
    Content("8b61b131-bf47-4e68-b20b-7216c2ab77d9", "Ten Things", 51, 2),
    Content("60a08dab-06e0-4538-a346-0b542158ff09", "Phonics Funtime L&G", 52, 2),
    Content("50f66ea9-0868-4f14-ae6d-0824fe35678e", "Umbrella", 53, 2),
    Content("0ce36f78-ba8f-4843-a608-853f581d4695", "Lineman L", 54, 2),
    Content("2cea4f1c-dd0d-451b-b459-53b6d1e3b521", "Stand Up and Look Around", 55, 2),
    Content("ea28e3b2-3e77-4eb6-b68b-9592cab877cf", "Blue", 56, 2),
    Content("59c30990-795a-47a6-8344-afb3834e440a", "Lineman G", 57, 2),
    Content("94ab5d93-50ba-47f4-993e-ea7c8792c715", "Hold Hands with a Friend", 58, 2),
    Content("44c97efc-6f8e-4201-86a2-24be82b78668", "Flashcard Friends Part 2", 59, 2),
    Content("f4cb7643-28b4-4308-8437-f901dfa8c5d0", "Nice Things to Say", 60, 2),
    Content("280e3de4-58f9-49b9-80c4-4849e3e6b069", "Kenny Kangaroo", 61, 2),
    Content("d2aaf711-377e-4717-8658-c0e2e761142c", "My Hands", 62, 2),
    Content("ba1b269c-510a-428e-9ea4-c4e042032fce", "All These Things", 63, 2),
    Content("563866ab-d393-425a-b392-6ad7648081bb", "Boy", 64, 2),
    Content("fc42e6cc-5458-4d0d-b84a-88fb561a33db", "Two", 65, 2),
    Content("17a4bf25-f7eb-441b-8ec6-a478af0dfc69", "Phonics Funtime U", 66, 2),
    Content("796a3248-6cae-49de-9d41-f3c415d3e9e5", "What Can You Do", 67, 2),
    Content("ff4066af-c78a-40d1-a22d-a468d8f0db5f", "Lineman U", 68, 2),
    Content("798dca2a-8845-4d3d-93f6-bc05b62c6cde", "Point and Pat", 69, 2),
    Content("6e5487bf-d635-4158-a561-9c22d3569c08", "Too Big, Too Small", 70, 2),
    Content("799aa5ff-f7fc-4605-8d25-8fc5f95f89b5", "Head, Shoulders, Knees and Toes", 71, 2),
    Content("5f05a1c6-ab5e-4fab-918e-6f2d9d2466c6", "Girl", 72, 2),
    Content("8eb16a5e-02ef-4205-88d2-f26f81894a0c", "Phonics Funtime B", 73, 2),
    Content("0f7e57c3-313a-40de-be18-ee1e96cc9bee", "Lineman B", 74, 2),
    Content("b52f0438-868b-4aa1-9781-6149d0cffe7f", "Mother Who Lives in a Boot", 75, 2),
    Content("9cecc9f1-4a41-40eb-8a93-e8a795f4475e", "Jonny Bear Goes to the Zoo", 76, 2),
    Content("ca0b63f3-b28a-47d9-a294-9959da15e8e4", "Flashcard Friends Part 3", 77, 2),

    Content("0aa94a0d-0370-4dac-afcb-e53b3dc4ae4d", "Hello, How Are You", 59, 3),
    Content("43e352c0-381e-41f9-93e1-f22f4ee24e3f", "Colors Everywhere!", 60, 3),
    Content("9c8bdd85-1087-414c-829c-bdf0fe2e667b", "Flashcard Friends 1", 61, 3),
    Content("88c8d9ed-1def-4e70-8406-9bc4875e767a", "Crayons Are Fun", 62, 3),
    Content("7310f9fa-b29a-4035-9b7b-443dc16ec792", "Black", 63, 3),
    Content("8f949e3a-9bac-4880-b1fe-234d4855b522", "Marvin Goes to School", 64, 3),
    Content("c524aaf9-ae8c-4a1e-b596-ff34128f5525", "Phonics Funtime E&N", 65, 3),
    Content("aa6dec72-8f3b-4d49-8e76-8e3eaebd27f4", "Count and Shout!", 66, 3),
    Content("90355fa4-dd12-4960-864f-2b993acb27af", "Lineman E", 67, 3),
    Content("d1df65b7-a749-45ee-bcc9-d40496e524c8", "Lineman N", 68, 3),
    Content("4e94d53f-84da-40bd-bd0b-1b91bcd832ec", "Yes, It Is!", 69, 3),
    Content("760b6c76-e4e2-4ee9-accd-8d182c5a792d", "We Love School!", 70, 3),
    Content("c37a09cf-0f13-4aaf-a0ae-318e08d47b97", "Time for a Story", 71, 3),
    Content("3f9b942a-9d4e-4518-9dfd-51c68eb1f6a8", "Flashcard Friends 2", 72, 3),
    Content("ae5e365c-115a-4819-8f53-d7a370add126", "I Like These Things", 73, 3),
    Content("9285127b-520a-4964-844a-f4037395d574", "We Say Please!", 74, 3),
    Content("cc6a245e-5448-44d7-a35d-7638e4ba0056", "My Toy Box", 75, 3),
    Content("dc5e698d-3904-40a0-bddf-cf9806705ea1", "Let's Spin!", 76, 3),
    Content("2f3cfd79-4860-4b2b-b742-506e3ea69013", "Phonics Funtime X", 77, 3),
    Content("514856ff-a166-4fdc-875a-2f7e99a4fe96", "Lineman X", 78, 3),
    Content("9df74db1-e4fd-4436-a76e-03981c46b0ea", "Three", 79, 3),
    Content("65680a71-af4e-4d52-af9d-7347695e099c", "Give it to a Friend!", 80, 3),
    Content("5894d813-3950-4344-8518-9f9011f9828e", "Yes No", 81, 3),
    Content("130c8489-1840-4897-bddf-9f11cec74efd", "Flashcard Friends 3", 82, 3),
    Content("4e12fa80-51d7-4fb1-80ca-6e354808ff7e", "Our Day at School", 83, 3),
    Content("7ffad446-6b58-4662-9139-1473fdca6421", "Jonny Bear Helps His Mother", 84, 3),
    Content("97d9e588-ef5d-49aa-8002-0b5451e3fbf2", "Phonics Funtime C", 85, 3),
    Content("aa89d3a1-8750-4717-8acd-fe85cc104d9b", "Lineman C", 86, 3),

    )

fun getMedia(base: String, item: Content): String {
    return File(base + "${File.separator}.contents${File.separator}" + item.id).listFiles().filter {
        it.name.endsWith("mp3") || it.name.endsWith("mp4")
    }.first().absolutePath
}

fun buildTarget(base: String, item: Content, type: String): String {
    return base + "${File.separator}Unit${item.unit}${File.separator}${item.sequence}-${item.name}$type"
}

fun copyFile(sourceFilePath: String, destinationFilePath: String) {
    try {
        val sourceFile = File(sourceFilePath)
        if (!sourceFile.exists()) {
            println("源文件不存在: $sourceFilePath")
            return
        }

        val destinationFile = File(destinationFilePath)

        if (destinationFile.exists() && sourceFile.length() == destinationFile.length()){
            return
        }
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

    val baseDir = "f:\\files"
    val targetDir = "d:\\putaozi"

    resources.forEach {
        val sourceFile = getMedia(baseDir, it)
        val targetFile = buildTarget(targetDir, it, sourceFile.substring(sourceFile.lastIndexOf(".")))
        copyFile(sourceFile, targetFile)
    }

}


data class Content(val id: String, val name: String, val sequence: Int, val unit: Int)