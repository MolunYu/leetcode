#include <iostream>
#include <string>
#include <vector>
#include <cctype>
#include<algorithm>
using namespace std;

class Solution {
public:
	int maxArea(vector<int>& height) {
		int water = 0;
		int h = 0;
		int i = 0;
		int j = height.size() - 1;

		while (i < j)
		{
			h = min(height[i], height[j]);
			water = max(water, h*(j - i));
			while (height[i] <= h) i++;
			while (height[j] <= h) j--;
		}

		return water;
	}
};