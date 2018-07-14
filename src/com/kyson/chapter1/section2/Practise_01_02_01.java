package com.kyson.chapter1.section2;

/*
*
* 1.2.1编写一个Point2D的用例，从命令行接受一个整数N。在单位正方形内生成N个随机点，然后计算两点之
* 间的最近距离。

1.2.1 Write a Point2D client that takes an integer value N from the command line,
generates N random points in the unit square, and computes the distance
separating the closest pair of points.
*
* */

public class Practise_01_02_01 {


    public static class Point2D {

        public double x;
        public double y;

        //初始化函数
        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        //计算两点之间的距离
        public double distTo(Point2D that) {
            double xDistance = this.x - that.x;
            double yDistance = this.y - that.y;
            return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
        }
    }

}
