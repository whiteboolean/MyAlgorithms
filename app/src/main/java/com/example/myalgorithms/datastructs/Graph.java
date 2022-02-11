package com.example.myalgorithms.datastructs;

/**
 * 定义图的结构
 */
public class Graph {

    //结点数目
    private int size = 20;
    //定义数组，保存顶点信息
    char[] nodes = new char[size];

    //定义矩阵保存顶点信息
    int[][] edges = new int[size][size];

    /**
     *     v0 v1 v2 v3
     * v0  0  1  1  1
     * v1  1  0  1  0
     * v2  1  1  0  1
     * v3  1  0  1  0
     */
    public static void main(String[] args) {
        Graph graph = new Graph();
    }


    public Graph() {
        size = 4 ;
        nodes = new char[size];
        edges = new int[size][size];
        edges[0][1] = 1 ;
        edges[0][2] = 1 ;
        edges[0][3] = 1 ;
        edges[1][0] = 1 ;
        edges[1][2] = 1 ;
        edges[2][0] = 1 ;
        edges[2][1] = 1 ;
        edges[2][3] = 1 ;
        edges[3][0] = 1 ;
        edges[3][2] = 1 ;
    }
}
