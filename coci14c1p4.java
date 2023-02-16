/**
 * Created by [mse387] on 5/31/2017.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class COCI14C1P4 {
    private static BufferedReader in;
    private static StringTokenizer st;
    private static BufferedWriter out;
    private static int[] a, b;
    private static boolean[] visited;
    private static int ans;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = nextInt();
        a = new int[N + 1];
        b = new int[N + 1];
        visited = new boolean[N +1];
        for(int i = 0; i < N; i++){
            b[i+1] = nextInt();
            a[b[i+1]]++;
        }
        for (int i = 0; i < N; i++) {
            if (a[i+1] == 0) {
                DFS(i+1, false);
            }
        }
        for (int i = 0; i < N; i++)
            DFS(i+1, true);
        print(ans);
        in.close();
        out.close();
    }
    private static void DFS (int i, boolean cycle) {
        if (!visited[i]) {
            visited[i] = true;
            a[b[i]]--;
            if (!cycle)ans++;
            if (a[b[i]] == 0 || !cycle) {
                DFS(b[i], !cycle);
            }
        }
    }

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(in.readLine().trim());
        return st.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static void print(int i) throws IOException {
        out.append(Integer.toString(i));
    }
}
