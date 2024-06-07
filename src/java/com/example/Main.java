package com.example.conjugategradient;

public class Main {
    public static void main(string[] args){
        //Example A and b
        double [][] A = {
                {4,1},
                {1,3}
        };
        double[] b = {1,2};

        ConjugateGradientSolver solver = new ConjugateGradientSolver(A,b);
        solver.solve()
    }

}