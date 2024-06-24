public class GetNum{
    public static int GetNum(int num){
        int result =0;
        for(int i =0;i<num;i++) {
            int result2 = 1;
            for(int j =1;j<i;j++) {
                result2 *= j;
            }
            result += result2;
        }
        
        return result;
    }
}
