package two_pointers;

public class RemoveDuplicatesfromString {
     public static void main(String[] args) {
        String str = "aabbbccdd"; int n = str.length();
        StringBuilder sb = new StringBuilder();
        int l =0, r =l+1;
        while(r<n){
            char lt = str.charAt(l);
            char rt = str.charAt(r);
            if(r==n-1){
                sb.append(str.charAt(r));
            }
            if(lt !=rt){
                sb.append(lt);
                l=r;
                r++;
            }else{
                r++;
            }
        }
        System.out.println(sb);
    }
}
