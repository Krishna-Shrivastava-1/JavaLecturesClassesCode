package Questions;

public class ThePeakelement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 8, 12, 4, 2};
        int mid = arr.length/2;
int l =mid-1;
int r= mid+1;
        while (l > 0 || r < arr.length) {
            if (arr[mid] > arr[l] && arr[mid] > arr[r] ) {
                System.out.println(arr[mid]);
                break;
            }
            if(arr[mid] < arr[r]){
                mid = r;
                r++;
            }
            if(arr[mid] < arr[l]){
                mid = l;
                l--;
            }
        }
    }
}
