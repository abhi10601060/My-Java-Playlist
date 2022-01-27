public class even_numbers_count {
    public static void main(String[] args) {
        int[] arr ={1,25,366,4,2525,32,52,1451,449,663};

//        System.out.println(count_even(arr));
        System.out.println(Even_digits_count(arr));

    }

    static int  count_even(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int count=0;
        for (int num : arr){
            if (num%2==0){
                count+=1;
            }
        }
        return count;
    }

    static  int Even_digits_count(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int ans=0;
        for (int num : arr){
            int count=0;
            while(num>0){
                count+=1;
                num=num/10;
            }
            if (count%2==0){
                ans+=1;
            }
        }
        return ans;
    }
}
