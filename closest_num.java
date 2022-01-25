import java.util.Arrays;

public class closest_num {
 
    public static void main(String[] args) {

        int[] data = {1,4,5,6,7,-1};
        int curr = 0;
        int near = data[0]; 
        Arrays.sort(data);      //  add this
        //System.out.println(Arrays.toString(data));        
        // find the element nearest to zero
        for ( int i=0; i < data.length; i++ ){
            //System.out.println("dist from " + data[i] + " = " + Math.abs(0 -data[i]));
            curr = data[i] * data[i]; 
            if ( curr <= (near * near) )  { 
                near = data[i];
            } 
        }
        System.out.println( near );
    }   
}
/*int[] arr = {1,4,5,6,7,-1};

int closestIndex = 0;
int diff = Integer.MAX_VALUE;
for (int i = 0; i < arr.length; ++i) {
    int abs = Math.abs(arr[i]);
    if (abs < diff) {
        closestIndex = i;
        diff = abs;
    } else if (abs == diff && arr[i] > 0 && arr[closestIndex] < 0) {
        //same distance to zero but positive 
        closestIndex =i;
    }
}   
System.out.println(arr[closestIndex ]);*/