public class VariableNameSymbols {

    public static void main(String[] args) {

        // Dollar symbol in variable names
        int temp = 10;
        int temp$ = 20;
        int $temp = 30;
        int te$mp = 40;
        int te$$mp = 50;

        // Underscore in variable names
        int temp_ = 60;
        int _temp = 70;
        int te_mp = 80;
        int te__mp = 90;

        // Dollar and underscore together
        int te_$mp = 100;
        int $ = 110;
        int $$ = 120;

        System.out.println(temp);
        System.out.println(temp$);
        System.out.println($temp);
        System.out.println(te$mp);
        System.out.println(te$$mp);
        System.out.println(temp_);
        System.out.println(_temp);
        System.out.println(te_mp);
        System.out.println(te__mp);
        System.out.println(te_$mp);
        System.out.println($);
        System.out.println($$);

        // A single underscore is invalid from Java 9 onwards.
        // int _ = 130;

        // Underscore inside integer literals
        int a = 10;
        int b = 1_0;
        int c = 1__0;
        int d = 1_____0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Underscore inside floating-point literals
        float g = 33.147F;
        float h = 33.1_47F;

        System.out.println(g);
        System.out.println(h);

        // Hexadecimal literal
        int k = 0x45;
        System.out.println(k);

        /*
         * INVALID EXAMPLES — these produce compilation errors:
         *
         * int e = _10;
         * int f = 10_;
         * float i = 33_.147F;
         * float j = 33._147F;
         * int l = 0_x45;
         * int m = 0x_45;
         * float o = 33.147_F;
         * float p = 33.147F_;
         */
    }
}