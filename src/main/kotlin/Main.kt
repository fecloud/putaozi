package org.example

import okio.Source
import org.jdom2.input.SAXBuilder
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.StringReader


fun getStringsKeys(path: String): MutableList<String> {
    val saxBuilder = SAXBuilder()
    val document = saxBuilder.build(FileInputStream(path))
    val root = document.rootElement

    val result = mutableListOf<String>()
    for (person in root.getChildren("string")) {
        result.add(person.getAttribute("name").value)
    }

    return result
}

fun reGen(source: String, dest: String, vararg compares: String) {

    val scale = mutableListOf<String>().apply {
        compares.forEach {
            addAll(getStringsKeys(it))
        }
    }

    val strings = getStringsKeys(source)
    println("scale:${scale.size} strings:${strings.size}")
    val minus = strings.intersect(scale)
    println("相同的key:" + minus.size)

    val content = StringBuilder()

    File(source).forEachLine { line ->
        val linekey = line.replace("<string name=\"", "").substringBefore("\"").trim()
        val delete = linekey in minus
        if (!delete) {
            content.append(line)
        }

        content.append("\n")
    }

    val filePath = dest
    File(filePath).createNewFile()
    File(filePath).bufferedWriter().use { writer ->
        writer.append(content)
    }
}

fun getValuesDir(lang: String): String {
    if (lang.isEmpty()) {
        return "values"
    }

    return "values-$lang"
}


fun main() {

    val baseDir = "/Users/anker/AndroidStudioProjects/LifeOld/EufyLife2.0/Android/EufyLife/"
    val langs =
        mutableListOf("", "ar", "de", "es", "fr", "it", "ja", "ko", "pl", "pt", "ru", "th", "tr", "vi", "zh", "zh-rTW")

//    langs.forEach {
//        reGen("$baseDir/EufyLife_Res/src/main/res/${getValuesDir(it)}/strings.xml",
//            "$baseDir/EufyLife_Res/src/main/res/${getValuesDir(it)}/strings.xml",
//            "$baseDir/EufyLife_Res/src/main/res/values/strings_scale.xml"
//        )
//    }

        langs.forEach {
        reGen("$baseDir/EufyHome_Res/src/main/res/${getValuesDir(it)}/strings.xml",
            "$baseDir/EufyLife_Res/src/main/res/${getValuesDir(it)}/strings_base.xml",
            "$baseDir/EufyLife_Res/src/main/res/values/strings_scale.xml",
            "$baseDir/EufyLife_Res/src/main/res/values/strings.xml"
        )
    }

}