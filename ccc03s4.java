/**
 * Created by [mse387] on 7/5/2017.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CCC03S4 {
    private static BufferedReader in;
    private static StringTokenizer st;
    private static BufferedWriter out;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] suffixArray;
        String s;
        int count;

        for(int N = nextInt(); N > 0; N--){
            s = nextLine();
            suffixArray = new String[s.length()];
            for(int i = 0; i < s.length(); i++)
                suffixArray[i] = s.substring(i);
            Arrays.sort(suffixArray);
            count = suffixArray[0].length() + 1;
            for(int i = 1; i < suffixArray.length; i++){
                count += suffixArray[i].length();
                int q = Math.min(suffixArray[i-1].length(), suffixArray[i].length());
                for (int j = 0; j < q; j++) {
                    if (suffixArray[i-1].charAt(j) != suffixArray[i].charAt(j)){q = j;break;}
                }
                count -= q;
            }
            if(N!=1)println(count);
            else print(count);
        }

        in.close();
        out.close();
    }

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(in.readLine().trim());
        return st.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    private static char nextCharacter() throws IOException {
        return next().charAt(0);
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    private static String nextLine() throws IOException {
        return in.readLine().trim();
    }

    private static void print(int i) throws IOException {
        out.append(Integer.toString(i));
    }

    private static void println(int i) throws IOException {
        print(i);
        out.append("\n");
    }

    private static void print(String s) throws IOException {
        out.append(s);
    }

    private static void println(String s) throws IOException {
        print(s);
        out.append("\n");
    }

    private static void print(double d) throws IOException {
        out.append(Double.toString(d));
    }

    private static void println(double d) throws IOException {
        print(d);
        out.append("\n");
    }

    private static void print(long l) throws IOException {
        out.append(Long.toString(l));
    }

    private static void println(long l) throws IOException {
        print(l);
        out.append("\n");
    }

    private static void print(float f) throws IOException {
        out.append(Float.toString(f));
    }

    private static void println(float f) throws IOException {
        print(f);
        out.append("\n");
    }

    private static void print(char c) throws IOException {
        out.append(c);
    }

    private static void println(char c) throws IOException {
        print(c);
        out.append("\n");
    }

    private static void print(Object o) throws IOException {
        out.append("" + o);
    }


    private static void print(int[] array) throws IOException {
        for (int o : array) {
            print(o);
            print(' ');
        }
    }

    private static void print(int[][] array) throws IOException {
        for (int[] o : array) {
            for (int o1 : o) {
                print(o1);
                print(' ');
            }
            out.append("\n");
        }
    }

    private static void println() throws IOException {
        out.append("\n");
    }
}
