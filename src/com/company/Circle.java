package com.company;

public class Circle extends Figure{
        private int r;
        public static final double PI = 3.14;

        public Circle(String name, int radius) {
                super.setName(name);
                this.r = radius;
        }

        public int getRadius() {
                return r;
        }

        public void setRadius(int radius) {
                this.r = radius;
        }


        @Override
        public double calculatePerimeter() {
                return 2 * PI* r;
        }

        @Override
        public String draw() {
                return "🔴";
        }
}
