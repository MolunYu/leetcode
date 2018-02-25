#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public :
	vector<vector<int>> permute(vector<int>& nums) {

	}

	void swap(vector<int>& nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}£»