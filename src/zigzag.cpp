#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public:
	string convert(string s, int numRows) {
		if (s.empty()) return "";
		if (numRows == 1) return s;

		string result = "";

		int n = 0;
		while (2 * (numRows - 1)*n < s.size()) { result += s[2 * (numRows - 1)*n]; n++; }
		for (int i = 1; i < numRows-1; i++)
		{
			n = 0;
			while ((2 * (numRows - 1)*n + i) < s.size() || (2 * (numRows - 1)*(n + 1) - i) < s.size())
			{
				if ((2 * (numRows - 1)*n + i) < s.size())
				{
					result += s[2 * (numRows - 1)*n + i];
				}
				if ((2 * (numRows - 1)*(n + 1) - i) < s.size())
				{
					result += s[2 * (numRows - 1)*(n + 1) - i];
				}
				n++;
			}
		}
		n = 0;
		while (2 * (numRows - 1)*n + numRows - 1 < s.size()) { result += s[2 * (numRows - 1)*n+ numRows - 1]; n++; }
		return result;
	}
};
