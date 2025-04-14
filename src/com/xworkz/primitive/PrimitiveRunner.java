package com.xworkz.primitive;

public class PrimitiveRunner {



        public static void main(String pri[]) {


            short s1 = 1000;
            byte b1 = (byte) s1;
            short s2 = b1;
            System.out.println(b1);
            System.out.println(s2);


            int i1 = 3000;
            short s3 = (short) i1;
            int i2 = s3;
            System.out.println(s3);
            System.out.println(i2);


            long l1 = 123456000L;
            int i3 = (int) l1;
            long l2 = i3;
            System.out.println(i3);
            System.out.println(l2);


            float f1 = 17.5f;
            long l3 = (long) f1;
            float f2 = l3;
            System.out.println(l3);
            System.out.println(f2);


            double d1 = 125673.456;
            float f3 = (float) d1;
            double d2 = f3;
            System.out.println(f3);
            System.out.println(d2);


            int i4 = 99;
            char c1 = (char) i4;
            int i5 = c1;
            System.out.println(c1);
            System.out.println(i5);


            double d3 = 76.99;
            int i6 = (int) d3;
            double d4 = i6;
            System.out.println(i6);
            System.out.println(d4);


            float f4 = 223.55f;
            int i7 = (int) f4;
            float f5 = i7;
            System.out.println(i7);
            System.out.println(f5);

        }
    }




