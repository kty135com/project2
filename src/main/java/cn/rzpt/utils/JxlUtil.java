package cn.rzpt.utils;

import cn.rzpt.entity.User;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JxlUtil {

    public static List<User> setUsersByExcel(File file) {
        try {
            Workbook workbook = Workbook.getWorkbook(file);  //通过Workbook的静态方法getWorkbook选取Excel文件

            int sheetsnumber = workbook.getNumberOfSheets();//获取工作薄个数

            Sheet sheet = workbook.getSheet(0);  //通过Workbook的getSheet方法选择第一个工作簿（从0开始）

            int columnum = sheet.getColumns(); //  得到列数
            int rownum = sheet.getRows(); //  得到行数
            System.out.println("行=" + rownum + "-=-=-列=" + columnum);
            ArrayList<User> list = new ArrayList<User>();
            for (int i = 1; i < rownum; i++) {
                User u = new User();
                System.out.println("iiiii=" + i);
                System.out.println("越界测试1=" + sheet.getCell(0, i).getContents());
                System.out.println("越界测试2=" + sheet.getCell(5, i).getContents());
                u.setName(sheet.getCell(0, i).getContents());
                u.setPwd(sheet.getCell(1, i).getContents());
                u.setRealName(sheet.getCell(2, i).getContents());
                u.setState(Integer.parseInt(sheet.getCell(3, i).getContents()));
                u.setDept_id(Integer.parseInt(sheet.getCell(4, i).getContents()));
                u.setPro_id(Integer.parseInt(sheet.getCell(5, i).getContents()));
                System.out.println("user=======" + u);
                list.add(u);
            }
            System.out.println("list====" + list);
            workbook.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
