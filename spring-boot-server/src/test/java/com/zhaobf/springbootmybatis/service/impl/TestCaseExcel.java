package com.zhaobf.springbootmybatis.service.impl;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.ArrayList;
import java.util.HashMap;

;

/**
 * @author wujiaojiao
 * @create 2018-05-10 下午3:08
 **/
public class TestCaseExcel {
    public Object[][] testData(String file) {
        ArrayList<String> arrKey = new ArrayList<>();
        Workbook workbook = WorkBookEchi.getWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
        //获取总行数
        int rowTotalNum = sheet.getLastRowNum() + 1;
        //总列数
        int columns = sheet.getRow(0).getPhysicalNumberOfCells();
        HashMap<String, String>[][] map = new HashMap[rowTotalNum - 1][1];
        //对所有元素进行初始化
        if (rowTotalNum > 1) {
            for (int i = 0; i < rowTotalNum - 1; i++) {
                map[i][0] = new HashMap();
            }
        } else {
            System.out.println("测试的excel" + file + "中没有数据");
        }
        //获得首行的列名，作为hashmap的key
        for (int c = 0; c < columns; c++) {
            String cellvalue = CellUnit.getCellValue(sheet, 0, c);
            arrKey.add(cellvalue);
        }
        //遍历单元格所有值添加到hashmap
        for (int r = 1; r < rowTotalNum; r++) {
            for (int c = 0; c < columns; c++) {
                String cellvalue = CellUnit.getCellValue(sheet, r, c);
                map[r - 1][0].put(arrKey.get(c), cellvalue);
            }
        }
        return map;
    }
}
