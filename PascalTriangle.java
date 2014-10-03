// Write a java program to print a pascal triangle
// using multi dimentional array
//
//                       1
//                     1   1
//                   1   2   1
//                 1   3   3   1
//               1   4   6   4   1

class PascalTriangle{
    
    public int[][] pt; // object variable
    
    public PascalTriangle(int n){
        // constructor
        pt = new int[n][];
        for(int i=0; i < n; i++){
            pt[i] = new int[i+1];
            pt[i][0] = 1;
            for(int j=1; j < i; j++){
                pt[i][j] = pt[i-1][j-1] + pt[i-1][j];
            }
            pt[i][i] = 1;
        }
    }
    public void display(){
        // display method
        for(int i=0; i < pt.length; i++){
            for(int j=0; j < pt[i].length; j++){
                System.out.print(pt[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        // main function
        PascalTriangle obj = new PascalTriangle(10);
        obj.display();
    }
}
