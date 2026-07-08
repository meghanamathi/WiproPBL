package Oops.TopicstoLearn.ClassesandObject;

class Box {

    int width;
    int height;
    int depth;

    Box(int width, int height, int depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int getVolume()
    {
        return width * height * depth;
    }
}

public class Assignment1 {

    public static void main(String[] args) {

        Box b = new Box(5,4,3);

        System.out.println("Width = " + b.width);
        System.out.println("Height = " + b.height);
        System.out.println("Depth = " + b.depth);

        System.out.println("Volume = " + b.getVolume());
    }
}