public class Main {
    //THIS CLASS IS FOR TESTING IMPLEMENTATIONS
    public static void main(String[] args) throws Exception {
        // Vector vector = new Vector(1); 


    }

    public static void print(Vector vector) throws Exception {
        System.out.println();
        System.out.print("[");
        for(int i = 0; i < vector.size(); i++) {
            if(i != vector.size() - 1) {
                System.out.print(vector.at(i) + ", ");
            }
            else {
                System.out.print(vector.at(i));
            }
        }
        System.out.println("]");
    }
}
