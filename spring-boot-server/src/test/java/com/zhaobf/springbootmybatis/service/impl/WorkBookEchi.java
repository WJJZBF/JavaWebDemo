package com.zhaobf.springbootmybatis.service.impl;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

;

/**
 * @author wujiaojiao
 * @create 2018-05-10 下午2:53
 **/
public class WorkBookEchi {
    /**
     * 封装getworkbook
     */
    public static Workbook getWorkbook(String filePath) {
        /**
         * 创建 workbook
         *
         * @param filePath excel文件路径
         * @return Workbook 对象
         * @throws IOException
         */
        Workbook wb = null;
        try {
            if (filePath.endsWith(".xls")) {
                File file = new File(filePath);
                InputStream is = new FileInputStream(file);
                wb = new HSSFWorkbook(is);

            } else if (filePath.endsWith(".xlsx") || filePath.endsWith(".xlsm")){
                wb = new XSSFWorkbook();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb;
    }
}
