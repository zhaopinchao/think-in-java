package io

import common.exception.ExceptionEnum
import common.exception.MyException
import java.io.*
import java.net.FileNameMap

/**
 * 文件工具类
 * File的一些常用操作[过滤、遍历……]
 */
class FileUtils {

    /**
     * 获取该文件夹下的所有文件路径
     */
    fun listDirectory(dir: File): List<String>{
        if (dir == null || !dir.exists()) {
            throw MyException(ExceptionEnum.DIR_NOT_EXISTS)
        }
        if (!dir.isDirectory) {
            throw MyException(ExceptionEnum.FILE_NOT_DIRECTORY)
        }
        var listFileNames = ArrayList<String>()
        var listFiles = dir.listFiles()
        if (listFiles == null || listFiles.isEmpty()) {
            return listFileNames
        }
        doListDirectory(dir, listFileNames)
        return listFileNames
    }

    private fun doListDirectory(dir: File, listFileNames: ArrayList<String>) {
        var listFiles = dir.listFiles()
        for (f in listFiles) {
            if (f.isDirectory) {
                listFileNames.add("Directory: " + f.absolutePath)
                doListDirectory(f,listFileNames)
            } else {
                listFileNames.add("     File: " + f.absolutePath)
            }
        }
    }

    fun copyFile(file: File, destFileName: String): String{
        if(!file.exists()){
            throw MyException(ExceptionEnum.FILE_NOT_EXISTS)
        }
        if(!file.isFile){
            throw MyException(ExceptionEnum.FILE_IS_DIRECTORY)
        }
        var fin = FileInputStream(file)
        var fout = FileOutputStream(destFileName)
        var i: Int
        do{
            i = fin.read()
            if(i == -1){
                break
            }
            fout.write(i)
            fout.flush()
        }while (i != -1)
        fin.close()
        fout.close()
        return destFileName
    }

    fun copyFileByBuffered(file: File, destFileName: String): String{
        if(!file.exists()){
            throw MyException(ExceptionEnum.FILE_NOT_EXISTS)
        }
        if(!file.isFile){
            throw MyException(ExceptionEnum.FILE_IS_DIRECTORY)
        }
        var bis = BufferedInputStream(FileInputStream(file))
        var bos = BufferedOutputStream(FileOutputStream(destFileName))
        var i: Int
        do{
            i = bis.read()
            if(i == -1){
                break
            }
            bos.write(i)
            bos.flush()
        }while (i != -1)
        bis.close()
        bos.close()
        return destFileName
    }
}