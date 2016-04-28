
public class Le_186_Reverse_Words_in_a_String_II {
	public void reverseWords(char[] s) {
        if(s == null || s.length == 0){
            return;
        }
        
        int n = s.length;
        reverse(s, 0, n - 1);
        int index = 0;
        
        while(index < n){
            if(s[index] != ' '){
                int front = index;
                while(front < n && s[front] != ' '){
                    front++;
                }
                reverse(s, index, front - 1);
                index = front;
            } else {
                index++;
            }
        }
    }
    
    public void reverse(char[] s, int start, int end){
        if(start == end){
            return;
        }
        
        int left = start, right = end;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
