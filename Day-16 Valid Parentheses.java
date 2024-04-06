class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a=='('||a=='['||a=='{'){
                stack.push(a);
            }else{
                if(a==')'){
                    if(stack.isEmpty()||stack.pop()!='('){
                        return false;
                    }
                }
                if(a=='}'){
                    if(stack.isEmpty()||stack.pop()!='{'){
                        return false;
                    }
                }
                if(a==']'){
                    if(stack.isEmpty()||stack.pop()!='['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
