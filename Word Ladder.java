class Solution {
    public int ladderLength(String bg, String end, List<String> word) {
        HashSet<String> hp = new HashSet<>();
        
        for(var a : word) hp.add(a);
      

        Queue<String> q = new LinkedList<>();
        q.add(bg);
        int ans = 0;
        while(q.size()!=0){
            int n = q.size();
            ans++;
            for(int k=0; k<n; k++){
                String s = q.remove();
                System.out.println(s);
                if(s.equals(end)) return ans;
                for(int i=0; i<s.length(); i++){
                    for(char j='a'; j<='z'; j++){
                        
                        String curr = s.substring(0,i)+j+s.substring(i+1);
                        if(hp.contains(curr)){
                            
                            q.add(curr);
                            hp.remove(curr);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
