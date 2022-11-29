public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = new int[]{4,3,5,1,2,};
        Main.printArr(arr);
        arr = Main.bubbleSort(arr);
        Main.printArr(arr);
    }

    public static int[] bubbleSort(int[] arr){
        int tmp;
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void printArr(int[] arr){
        System.out.print("[ ");
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + ", ");
        System.out.println("]");
    }
}