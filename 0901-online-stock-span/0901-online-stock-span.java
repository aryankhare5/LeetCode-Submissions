class StockSpanner {

    Stack<int[]> s = new Stack<>();
    int idx = 0;

    public StockSpanner() {
    }
    
    public int next(int price) {
        
        while(!s.isEmpty() && s.peek()[0] <= price){
            s.pop();
        }
        int span = (s.isEmpty()) ? idx+1 : idx-s.peek()[1];
        
        s.push(new int[] {price, idx});
        idx++;
        
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */