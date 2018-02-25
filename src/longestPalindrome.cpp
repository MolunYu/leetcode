#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public:
	string longestPalindrome(string s) {
		//对特殊情况要在程序入口处理
		if (s.empty()) return "";
		if (s.size() == 1) return s;

		int max_len = 1;
		int min_start = 0;
		for (int i = 0; i < s.size();)
		{
			if (s.size() - i - 1 <= max_len / 2) break;
			int j = i, k = i;
			while (k < s.size() - 1 && s[k] == s[k + 1]) k++;
			i = k + 1;
			while (k < s.size() - 1 && j>0 && s[j - 1] == s[k + 1]) { j--; k++; }
			if (k - j + 1 > max_len)
			{
				max_len = k - j + 1;
				min_start = j;
			}
		}
		return s.substr(min_start, max_len);
	}
};