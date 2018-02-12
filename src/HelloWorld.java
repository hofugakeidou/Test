public class HelloWorld {
    public static void main(String[] args){
        MyString str1 = new MyString("Test1.");
        MyString str2 = new MyString("Test2.");
        System.out.println(str1.strs);
        System.out.println(str2.strs);

        StringTest(str1);
        StringTest2(str2);
        System.out.println(str1.strs);
        System.out.println(str2.strs);
    }

    public static void StringTest(MyString pStr){
        pStr.changeMyString(new String("Hello,world!"));
    }

    public static void StringTest2(MyString pStr){
        pStr = new MyString("Hello,world!");
    }
}

class MyString{
    public String strs;
    public MyString(String str){
        this.strs = str;
    }

    public void changeMyString(String str){
        this.strs = str;
    }
}