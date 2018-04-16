package aaa;

import com.alibaba.fastjson.JSON;

;

/**
 * @author wujiaojiao
 * @create 2018-04-16 下午9:20
 **/
public class JsonDemo {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setId("1");
//        student.setName("wujiaojiao");
//        String jsonString = JSON.toJSONString(student);
//        System.out.println(jsonString);


        String str = "{\"id\":\"1\",\"name\":\"wujiaojiao\"}";
        Student student = JSON.parseObject(str, Student.class);
        System.out.println(student.getId());
        System.out.println(student.getName());


    }
}
