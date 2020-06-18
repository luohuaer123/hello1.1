package com.company;


public class Main {
    static void dfs(int step, int[][] a, int[] b, int N) {
        if (step == N) return;



                }



    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] b = new int[numCourses];
        dfs(0, prerequisites, b, numCourses);
        return b;
    }

    public static void main(String[] args) {
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] rs = findOrder(4, prerequisites);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(rs[i]);
        }

    }
}
