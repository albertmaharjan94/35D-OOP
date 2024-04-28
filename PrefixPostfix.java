public class PrefixPostfix{
    public static void main(String[] args){
        int prefixValue = 10;
        /* Note that the value changes in same line */
        System.out.println(++prefixValue);
        System.out.println(prefixValue);
        int postFix = 20;
        /* Note that the value doesnot change in same line*/
        System.out.println(postFix++);
        System.out.println(postFix);

    }
}