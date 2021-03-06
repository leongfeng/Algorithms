package com.leong.chapter01_Fundamentals.section12_Data_Abstraction;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 累加器
 * Created by leong on 2017/9/29.
 */
public class Accumulator {
    private double total;
    private int count;
    public void addDataValue(double val){
        this.total += val;
        count++;
    }

    public double mean(){
        return this.total / count;
    }

    @Override
    public String toString() {
        return "Mean (" + this.total + " values): " + this.mean();
    }

    public static void main(String[] args) {
        int T = StdIn.readInt();
        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++){
            a.addDataValue(StdRandom.uniform());
        }
        System.out.println(a);
    }
}
