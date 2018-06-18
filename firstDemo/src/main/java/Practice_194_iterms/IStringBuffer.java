package Practice_194_iterms;

public interface IStringBuffer {
    public void append(char c);//追加字符
    public void append(String s);//追加字符串
    public void delete(int start);//从开始位置删除剩下的
    public void delete(int start ,int end);//从开始位置删除到结束位置
    public void insert(int pos,char ch);//从指定位置插入字符
    public void insert(int pos,String st);//从指定位置插入字符串
    public void reverse();//反转
    public int length();//返回长度
}
