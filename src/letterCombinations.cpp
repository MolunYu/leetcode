#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public:
	vector<string> letterCombinations(string digits) {
		string phoneAlpha[10] = { "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz" };
		vector<string> store;
		string result = "";

		if (digits.empty()) return store;

		letterStore(digits, store, phoneAlpha, result);

		return store;
	}

	void letterStore(string digits, vector<string>& store, string phoneAlpha[], string& result) {
		if (!digits.empty())
		{
			for (string::iterator iter = phoneAlpha[digits[0] - '0'].begin(); iter != phoneAlpha[digits[0] - '0'].end(); iter++)
			{
				result += *iter;
				letterStore(string(digits.begin() + 1, digits.end()), store, phoneAlpha, result);
				result.erase(result.end() - 1);
			}
		}
		else store.push_back(result);
	}
};