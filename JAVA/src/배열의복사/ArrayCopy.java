package 배열의복사;
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int len = 10;
        int[] arr2 = new int[len];
        arr2[0] = 100;
        arr2[1] = 200;
        System.arraycopy(arr1, 0, arr2, 2, arr1.length);
        for(int e : arr2) System.out.println(e);
    }
}
