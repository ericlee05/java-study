package common_programming_rule;

public class Unboxing_NPE {
    public static void main(String[] args) {
        Integer nullInt = null;
        if(nullInt == 10) // It cause 'NPE' (When null-referenced variable of wrap type converts to primitive type, It makes NPE)
            System.out.println("10입니다");
    }
}
