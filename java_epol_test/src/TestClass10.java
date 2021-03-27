
class TestClass10 {

    public static void main(String[] args) {
       Test test = new Test();
        System.out.println(Test.getNumber(4,'b'));
    }
    static int getNumber(int i){
        return 2;
    }
}

class Test extends TestClass10{
    static int getNumber(int i, char m){
        return 4;
    }


}
