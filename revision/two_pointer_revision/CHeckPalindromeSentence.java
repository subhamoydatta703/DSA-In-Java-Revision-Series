package revision.two_pointer_revision;

public class CheckPalindromeSentence {
    public static void main(String[] args) {
        String str ="A man a plan a canal Panama";
        int n = str.length(), l =0, r = n-1;
        System.out.println(n);
        while(l<r){
            char lt = Character.toLowerCase(str.charAt(l));
            char rt = Character.toLowerCase(str.charAt(r));
            if(!Character.isLetterOrDigit(lt)){l++;continue;}
            if(!Character.isLetterOrDigit(rt)){r--;continue;}
             if(lt != rt){
            System.out.println("No");
                return;}
            l++;
            r--;
        }
        System.out.println("Yes");
    }
}
