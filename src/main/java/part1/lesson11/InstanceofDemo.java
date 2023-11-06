package part1.lesson11;

class InstanceofDemo {
    public static void main(String[] args) {

        Parent obj1 = new Parent();

        System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
    }
}

class Parent {}
