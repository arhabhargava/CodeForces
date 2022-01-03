class CountGoodTriplets {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int triplet=0;

        for (int i=1; i<arr.length-2; i++){
            for (int j=i+1; j<arr.length-1; j++){
                for (int k=j+1; k<arr.length; k++){
                    if (i!=j & j!=k & i!=k){

                        if (Math.abs(arr[i] - arr[j]) <= a){
                            if (Math.abs(arr[j] - arr[k])<= b & Math.abs(arr[i] - arr[k]) <= c) {
                                System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                                triplet++;
                            }
                        }
                    }
                }
            }
        }
        return triplet;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,18,19,2,19,10,2,5,15,18};

        CountGoodTriplets m = new CountGoodTriplets();
        System.out.println(m.countGoodTriplets(arr,4,9,2));
    }
}