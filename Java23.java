public class Java23 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        int iobj = i.intValue();
        int j = i;// Unboxing
        //Integer j= Integer.valueOf(i);
      //  Integer ab= i;//Autoboxing
        System.out.println(iobj + j);
    }
}
