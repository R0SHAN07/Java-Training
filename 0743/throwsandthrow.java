public class throwsandthrow {
    public static void disp()throws NullPointerException{
        String s= "NULL";
        System.out.println(s.length());
        throw new NullPointerException (){
            public static void main(String[] args) {
                try{
                    disp();
                }
                catch(NullPointerException e){
                    System.out.println(e);
                }
            }
        };
    }
}
