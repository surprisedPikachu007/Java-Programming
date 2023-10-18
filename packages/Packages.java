package mypackage;

class Packages extends Parent {
        public static void main(String args[]) {
                Parent parent = new Parent();
                parent.display();
                System.out.println("Parent object: " + parent.x);

                Child child = new Child();
                child.display();
                child.x = 1;
                System.out.println("Child object: " + child.x);

                Packages packages = new Packages();
                packages.display();
                packages.x = 2;
                System.out.println("Packages object: " + packages.x);
        }

        public void display() {
                System.out.println("Packages: " + x);
        }
}
