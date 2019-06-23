package io

import java.io.*

/**
 * DataInputStream 和 DataOutputStream 的demo
 * DataInputStream在读取数据时需要与DataOutputStream写数据的顺序和类型都保持一直
 */
class DataStreamDemo {

    fun dosDemp(){
        var fos = FileOutputStream("/tmp/java-test/disDemo")
        var dos = DataOutputStream(fos)
        dos.writeInt(10)
//        dos.writeDouble(10.5)
        dos.writeUTF("中国")
//        dos.writeInt(20)
        dos.writeDouble(20.5)
        dos.writeUTF("汉子")
        dos.close()
    }

    fun disDemo(){
        var fin = FileInputStream("/tmp/java-test/disDemo")
        var dis = DataInputStream(fin)
        println(dis.readInt())
        println(dis.readUTF())
        println(dis.readDouble())
    }
}

fun main(){
    DataStreamDemo().dosDemp()
    DataStreamDemo().disDemo()
}