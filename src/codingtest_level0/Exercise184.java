package codingtest_level0;

class Exercise184 {
  
	
	public int solution(String myString, String pat) {
        int answer = 0;
        
        
        for(int i=0; i<myString.length()-pat.length()+1; i++) {
           
        	if(myString.substring(i,i+pat.length()).contains(pat)) {
                answer++;
            } // if
        	
        } // for
        
        return answer;
    } // solution
	
} // end class