class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
		if (numRows <= 0)
			return result;
		// 指向上一个三角形
		List<Integer> pre = new ArrayList<>();
 
		pre.add(1);
		result.add(pre);
		// i代表层数，从1开始
		for (int i = 2; i <= numRows; i++) {
			List<Integer> cur = new ArrayList<Integer>();
			// first
			cur.add(1);
			for (int j = 0; j < pre.size() - 1; j++) {
				// middle
				cur.add(pre.get(j) + pre.get(j + 1));
			}
			// last
			cur.add(1);
 
			result.add(cur);
			pre = cur;
		}
 
		return result;


    }
}
