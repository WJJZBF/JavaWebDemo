package com.zhaobf.springbootmybatis.service.impl;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author wujiaojiao
 * @create 2018-05-09 下午7:30
 **/
public class CellUnit {

    /**封装getCellvalue*/
    /**
     * 通过sheet 行号和列返回值
     *
     * @param sheet   sheet name
     * @param rowNum  行号
     * @param cellNum 列号
     * @return
     */
    public static String getCellValue(Sheet sheet, int rowNum, int cellNum) {
        Cell cell = sheet.getRow(rowNum).getCell(cellNum);
        String value = CellUnit.getCellValue(cell);
        return value;
    }

    public static String getCellValue(Cell cell) {
        String value = "";
        switch (cell.getCellTypeEnum()) {
            case STRING:
                value = String.valueOf(cell.getRichStringCellValue());
                return value;
            case NUMERIC:
                value = String.valueOf(cell.getNumericCellValue());
                return value;
            case BOOLEAN:
                value = String.valueOf(cell.getBooleanCellValue());
                return value;
            case ERROR:
                value = String.valueOf(cell.getErrorCellValue());
                return value;
            case FORMULA:
                value = String.valueOf(cell.getCellFormula());
                return value;
            case BLANK:
                return value;
            default:
                System.out.println("未知单元");
                return value;
        }


    }
}
