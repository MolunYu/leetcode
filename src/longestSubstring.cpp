#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution
{
public:
	int lengthOfLongestSubstring(string s)
	{
		if (s.empty())
			return 0;

		vector<int> offset(256, -1);
		int maxline = -1;
		int j = 0;

		for (int i = 0; i < s.size(); i++)
		{
			if (offset[s[i]] >= j) j = offset[s[i]] + 1;
			offset[s[i]] = i;
			maxline = maxline < i - j + 1 ? i - j + 1 : maxline;
		}

		return maxline;
	}
};