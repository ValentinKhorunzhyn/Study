public class Generator {

//   Generate the output 4247
//  append;
//  insert;
//  delete;
//  replace.
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("0123456789");
        sb.delete(0,4);
        sb.replace(1,4,"2");
        sb.insert(2,"4");
        sb.delete(3,5);
        sb.append("7");
        System.out.println(sb);

    }

}