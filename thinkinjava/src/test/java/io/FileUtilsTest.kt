package io

import org.junit.Test
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.io.InputStreamReader

class FileUtilsTest {

    @Test
    fun listDirectoryTest() {
        var file = File("/Users/zhaopinchao/IdeaProjects/think-in-java")
        var fileNames = FileUtils().listDirectory(file)
        for (name in fileNames) {
            println(name)
        }
    }

    @Test
    fun copyFileTest() {
        var beginTime = System.currentTimeMillis()
        println("begin time: ${beginTime}")
        var file = File("/tmp/java-test/copyfileTest")
        var destFileName = "/tmp/java-test/copyfileTest1"
        var result = FileUtils().copyFile(file, destFileName)
        var endTime = System.currentTimeMillis()
        println("end time: ${endTime}")
        println("cost time: ${endTime - beginTime}")
        println(result)
    }

    @Test
    fun copyFileByBufferedTest(){
        var beginTime = System.currentTimeMillis()
        println("begin time: ${beginTime}")
        var file = File("/tmp/java-test/copyfileTest")
        var destFileName = "/tmp/java-test/copyfileTest1"
        var result = FileUtils().copyFileByBuffered(file, destFileName)
        var endTime = System.currentTimeMillis()
        println("end time: ${endTime}")
        println("cost time: ${endTime - beginTime}")
        println(result)
    }


    @Test
    fun readFileTest(){
        var isr = InputStreamReader(FileInputStream("/tmp/java-test/read.txt"), "utf-8")
        var i: Int
        do{
            i = isr.read()
            if(i == -1){
                break
            }
            print(i.toChar())
        }while (i != -1)
        isr.close()

    }

    @ExperimentalStdlibApi
    @Test
    fun testChar(){
        var c: String = "中"
        var cc = c.encodeToByteArray()
        for (a in cc){
            print(" ${a}")
        }
    }
}
