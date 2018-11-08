public class e0507_foreach {
    public static void main(String args[]){
        int array[][][] = new int[][][]{
                {{0,1,2,2,2,2},{3,4,5}},
                {{10,11,12},{13,14,15,15,15}},
                {{20,21,22},{23,24,25}}
        };

        System.out.println("Use obvious type:");
        for (int[][] i: array){
            for (int[] j: i){
                for (int k: j){
                    System.out.print(k + "\t");
                }
                System.out.print("\t");
            }
            System.out.println();
        }


        System.out.println("Use var:");
        for (var i: array){
            for (var j: i){
                for (var k: j){
                    System.out.print(k + "\t");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
