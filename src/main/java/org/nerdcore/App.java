package org.nerdcore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int R = 3, C = 3, N = 3;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < R; i++){
            sb.append(getRow(C));
            for(int j = 1; j < N; j++){
                sb.append("|");
                sb.append(getRow(C));
            }
            sb.append(String.format("%n"));
        }
        System.out.println(sb);
    }
    static String getRow(int C){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < C; i++){
            sb.append("[ ]");
        }
        return sb.toString();
    }
}
